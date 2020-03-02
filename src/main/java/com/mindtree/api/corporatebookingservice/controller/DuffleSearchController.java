/**
 * 
 */
package com.mindtree.api.corporatebookingservice.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mindtree.api.corporatebookingservice.DuffleSearchRequest.Data;
import com.mindtree.api.corporatebookingservice.DuffleSearchRequest.OfferRequest;
import com.mindtree.api.corporatebookingservice.DuffleSearchRequest.Passenger;
import com.mindtree.api.corporatebookingservice.DuffleSearchRequest.Slice;
import com.mindtree.api.corporatebookingservice.DuffleSearchResponse.Fare;
import com.mindtree.api.corporatebookingservice.DuffleSearchResponse.FlightInfo;
import com.mindtree.api.corporatebookingservice.DuffleSearchResponse.FlightItinerary;
import com.mindtree.api.corporatebookingservice.DuffleSearchResponse.Offer;
import com.mindtree.api.corporatebookingservice.DuffleSearchResponse.OfferPack;
import com.mindtree.api.corporatebookingservice.DuffleSearchResponse.OfferResponse;
import com.mindtree.api.corporatebookingservice.DuffleSearchResponse.SearchFlightResponse;
import com.mindtree.api.corporatebookingservice.DuffleSearchResponse.Segment;
import com.mindtree.api.corporatebookingservice.dtos.BookingRequest;
import com.mindtree.api.corporatebookingservice.ndcclient.NDCDuffelServiceProxyClient;



/**
 * @author M1026334
 *
 */
@RestController
@CrossOrigin
public class DuffleSearchController {
	
	@Autowired
    NDCDuffelServiceProxyClient ndcDuffelServiceProxyClient;
	
	@GetMapping("/test")
	public String test() {
		return "ok..Tested";
		
	}

	@PostMapping("/duffelsearch")
    public ResponseEntity<List<OfferPack>> search(@RequestBody BookingRequest bookingRequest) {
		OfferRequest offerRequest = constructDuffleSearchRequest(bookingRequest);
//		System.out.println(Jso);
//		OfferResponse offerResponse = ndcDuffelServiceProxyClient.search(offerRequest);
		OfferResponse offerResponse = null;
		try {
			 offerResponse = ndcDuffelServiceProxyClient.search(offerRequest);
		}
		catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			 
		}
        
       SearchFlightResponse results = constructResponse(offerResponse);
	   return new ResponseEntity<>(results.getOfferPackages(), HttpStatus.OK);
		
	}

	/**
	 * 
	 * @param offerResponse
	 * @return
	 */
	private SearchFlightResponse constructResponse(OfferResponse offerResponse) {
		SearchFlightResponse searchFlightResponse = new SearchFlightResponse(); 
		List<Offer> offers = offerResponse.getData().getOffers();
		if(offers != null && !offers.isEmpty()) {
			List<OfferPack> offerPacks = new ArrayList<OfferPack>();
			for(Offer offer : offers) {
				OfferPack offerPack = new OfferPack();
				FlightItinerary onwardFlightItinerary = populateFlightItineraryDetails(offer.getSlices().get(0));
				offerPack.setOnwardFlightItinerary(onwardFlightItinerary);
				if(offer.getSlices().size() > 1) {
					FlightItinerary returnFlightItinerary = populateFlightItineraryDetails(offer.getSlices().get(1));
					offerPack.setReturnFlightItinerary(returnFlightItinerary);
				}
				Fare fare = populateFareDetails(offer);
				offerPack.setFare(fare);
				offerPacks.add(offerPack);
				searchFlightResponse.setOfferPackages(offerPacks);
			}
			
		}
		return searchFlightResponse;
	}



	private Fare populateFareDetails(Offer offer) {
		Fare fare = new Fare();
		fare.setBaseFare(Double.valueOf(offer.getBaseAmount()));
		fare.setTaxes(Double.valueOf(offer.getTaxAmount()));
		fare.setTotal(Double.valueOf(offer.getTotalAmount()));
		return fare;
	}
	
	/**
	 * 
	 * @param nDCSlice
	 * @return
	 */
	private FlightItinerary populateFlightItineraryDetails(
			com.mindtree.api.corporatebookingservice.DuffleSearchResponse.Slice nDCSlice) {
			FlightItinerary flightItinerary = new FlightItinerary();
			populateSegmentInfoToItinerary(flightItinerary, nDCSlice);
			flightItinerary.setOriginPoint(nDCSlice.getOrigin().getIataCode());
			flightItinerary.setOriginCountry(nDCSlice.getOrigin().getIataCountryCode());
			if(nDCSlice.getOrigin().getCity() != null) {
				flightItinerary.setOriginCity(nDCSlice.getOrigin().getCity().getName());
			}
			
			String[] departureDateTime = nDCSlice.getSegments().get(0).getDepartingAt().split("T");
			flightItinerary.setDepartureTime(departureDateTime[1].substring(0, 5));
			flightItinerary.setDepartureOffset(0);
			
			flightItinerary.setDestinationPoint(nDCSlice.getDestination().getIataCode());
			flightItinerary.setDestinationCountry(nDCSlice.getDestination().getIataCountryCode());
			
			if(nDCSlice.getDestination().getCity() != null) {
				flightItinerary.setDestinationCity(nDCSlice.getDestination().getCity().getName());
			}
			
			String[] arrivalDateTime = nDCSlice.getSegments().get(0).getArrivingAt().split("T");
			flightItinerary.setArrivalTime(arrivalDateTime[1].substring(0, 5));
			flightItinerary.setArrivalOffset(calculateArrivalOffset(departureDateTime[0], arrivalDateTime[0]));
//			Random rand = new Random();
//			Integer journeyDuration = rand.nextInt(350) + 400;
			flightItinerary.setJourneyDuration(nDCSlice.getDuration().substring(2));
			
			Iterator<String> itr = flightItinerary.getAirlineCodes().iterator();
			if(itr.hasNext()) {
				flightItinerary.setPartner(itr.next());
			}
		return flightItinerary;
	}
	
	/**
	 * 
	 * @param string
	 * @param string2
	 * @return
	 */
	private Integer calculateArrivalOffset(String departuerDate, String arrivalDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		try {
			Date firstDate = sdf.parse(departuerDate);
			Date secondDate = sdf.parse(arrivalDate);
			long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
			Integer diff = (int) TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
			return diff;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 
	 * @param flightItinerary
	 * @param nDCSlice
	 * @throws ParseException 
	 */
	private void populateSegmentInfoToItinerary(FlightItinerary flightItinerary,
			com.mindtree.api.corporatebookingservice.DuffleSearchResponse.Slice nDCSlice) {
		if (nDCSlice != null && nDCSlice.getSegments() != null && !nDCSlice.getSegments().isEmpty()) {
			LinkedHashSet<String> airlineCodes = new LinkedHashSet<String>();
			LinkedHashSet<String> airlineNames = new LinkedHashSet<String>();
			List<FlightInfo> flightInfos = new ArrayList<FlightInfo>();
			List<String> layoverPorts = new ArrayList<String>();
			List<String> layoverCities = new ArrayList<String>();
			List<Integer> layoverDuration = new ArrayList<Integer>();
			List<String> layoverAirportname = new ArrayList<String>();
			int count = 1;
			for (Segment segment : nDCSlice.getSegments()) {
				airlineCodes.add(segment.getMarketingCarrier().getIataCode());
				airlineNames.add(segment.getMarketingCarrier().getName());
				FlightInfo flightInfo = new FlightInfo();
				flightInfo.setAircraft(segment.getAircraft().getName());
				flightInfo.setAirlineCode(segment.getMarketingCarrier().getIataCode());
				flightInfo.setAirlineName(segment.getMarketingCarrier().getName());
				if(segment.getOperatingCarrierFlightNumber() != null) {
					flightInfo.setFlightNo(segment.getMarketingCarrierFlightNumber());
				}
				else {
					flightInfo.setFlightNo(segment.getOperatingCarrierFlightNumber());
					
				}
				
				flightInfo.setOriginPoint(segment.getOrigin().getIataCode());
				flightInfo.setOriginCountry(segment.getOrigin().getIataCountryCode());
				flightInfo.setOriginAirportName(segment.getOrigin().getName());
				
				String[] departureDateTime = segment.getDepartingAt().split("T");
				
				//Date conversion
				flightInfo.setDepartureTime(departureDateTime[1].substring(0, 5));
				
				flightInfo.setDestinationPoint(segment.getDestination().getIataCode());
				flightInfo.setDestinationCountry(segment.getDestination().getIataCountryCode());
				flightInfo.setDestinationAirportName(segment.getDestination().getName());
				
//				Random rand = new Random();
//				Integer flightDuration = rand.nextInt(480) + 220;
				flightInfo.setFlightDuration(segment.getDuration().substring(2));
				
				String[] arrivalDateTime = segment.getArrivingAt().split("T");
				
				DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				Date departureDate = null;
				Date arrivalDate = null;
				try {
					departureDate = format.parse(departureDateTime[0]);
					arrivalDate = format.parse(arrivalDateTime[0]);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				flightInfo.setDepartureDate(departureDate);
				flightInfo.setArrivalDate(arrivalDate);
				flightInfo.setArrivalTime(arrivalDateTime[1].substring(0, 5));
				flightInfo.setDepartureOffset(0);
				flightInfo.setArrivalOffset(calculateArrivalOffset(departureDateTime[0], arrivalDateTime[0]).toString());
				flightInfos.add(flightInfo);
				if(nDCSlice.getSegments().size() > 1 && count < nDCSlice.getSegments().size()) {
					layoverPorts.add(segment.getDestination().getIataCode());
					if(segment.getDestination().getCity() != null) {
						layoverCities.add(segment.getDestination().getCity().getName());
					}
					else {
						layoverCities.add(segment.getDestination().getIataCode());
					}
					layoverAirportname.add(segment.getDestination().getName());
					layoverDuration.add(calculateLayoverDuration(segment.getArrivingAt(), nDCSlice.getSegments().get(count).getDepartingAt()));
					count ++;
				}
			}
			flightItinerary.setLayoverAirportNames(layoverAirportname);
			flightItinerary.setLayoverCities(layoverCities);
			flightItinerary.setLayoverDurations(layoverDuration);
			flightItinerary.setLayoverPorts(layoverPorts);
			flightItinerary.setAirlineCodes(airlineCodes);
			flightItinerary.setAirlineNames(airlineNames);
			flightItinerary.setFlightInfos(flightInfos);

		}

	}

	/**
	 * 
	 * @param arrivingAt
	 * @param departingAt
	 * @return
	 */
	private Integer calculateLayoverDuration(String arrivingAt, String departingAt) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		LocalDateTime arrivingTime = LocalDateTime.parse(arrivingAt.replace('T', ' '), formatter);
		LocalDateTime departingTime = LocalDateTime.parse(departingAt.replace('T', ' '), formatter);
		
		Long layOverDuration = java.time.Duration.between(arrivingTime, departingTime).toMinutes();
		return layOverDuration.intValue();
	}

	private Date populateDepartureDate(String departingAt) {
		// TODO Auto-generated method stub
		return null;
	}

	private OfferRequest constructDuffleSearchRequest(BookingRequest bookingRequest) {
		OfferRequest offerRequest = new OfferRequest();
        Data requestData = new Data();

        //Passengers
        List<Passenger> passengers = new ArrayList<>();
        Passenger passenger = new Passenger();
        passenger.setType("adult");
        passengers.add(passenger);

        //Slice Details
        List<Slice> slices = new ArrayList<Slice>();
        Slice slice = new Slice();
        slice.setOrigin(bookingRequest.getFrom());
        slice.setDestination(bookingRequest.getTo());
        slice.setDepartureDate(bookingRequest.getDepDate());
        //slice.setAdditionalProperty("", bookingRequest.getNoOfAdults());
        slices.add(slice);
        if(bookingRequest.getReturnDate() != null) {
        	Slice slice1 = new Slice();
            slice1.setOrigin(bookingRequest.getTo());
            slice1.setDestination(bookingRequest.getFrom());
            slice1.setDepartureDate(bookingRequest.getReturnDate());
            //slice.setAdditionalProperty("", bookingRequest.getNoOfAdults());
            slices.add(slice1);
        	
        }
            
        //Set data property
        requestData.setSlices(slices);
        requestData.setPassengers(passengers);
        requestData.setCabinClass("economy");
        //data.setAdditionalProperty("", new Object());

        offerRequest.setData(requestData);
        ObjectMapper mapper = new ObjectMapper();
        try {
			String writeValueAsString = mapper.writeValueAsString(offerRequest);
			System.out.println(writeValueAsString);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return offerRequest;
	}

	/**
	 * @return the ndcDuffelServiceProxyClient
	 */
	public NDCDuffelServiceProxyClient getNdcDuffelServiceProxyClient() {
		return ndcDuffelServiceProxyClient;
	}

	/**
	 * @param ndcDuffelServiceProxyClient the ndcDuffelServiceProxyClient to set
	 */
	public void setNdcDuffelServiceProxyClient(NDCDuffelServiceProxyClient ndcDuffelServiceProxyClient) {
		this.ndcDuffelServiceProxyClient = ndcDuffelServiceProxyClient;
	}
	

}
