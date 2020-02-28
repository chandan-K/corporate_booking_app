package com.mindtree.api.corporatebookingservice.dtos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by M1038824 on 10/12/2019.
 */
public class FlightItinerary {

    private int flightSequence;
    private List<Flight> flights = new ArrayList<>();
    private String flightCost;
    private String currency;
    private String airLineName;
//    private FlightCarbonResponse flightCarbonResponse;
//    private String qrString;
//    private QrCodeResponse qrCodeResponse;

    /*public QrCodeResponse getQrCodeResponse() {
        return this.qrCodeResponse;
    }

    public void setQrCodeResponse(QrCodeResponse qrCodeResponse) {
        this.qrCodeResponse = qrCodeResponse;
    }*/

   /* public String getQrString() {
        return this.qrString;
    }

    public void setQrString(String qrString) {
        this.qrString = qrString;
    }*/

    public int getFlightSequence() {
        return this.flightSequence;
    }

    public void setFlightSequence(int flightSequence) {
        this.flightSequence = flightSequence;
    }

   /* public FlightCarbonResponse getFlightCarbonResponse() {
        return this.flightCarbonResponse;
    }

    public void setFlightCarbonResponse(FlightCarbonResponse flightCarbonResponse) {
        this.flightCarbonResponse = flightCarbonResponse;
    }*/


    public String getAirLineName() {
        return this.airLineName;
    }

    public void setAirLineName(String airLineName) {
        this.airLineName = airLineName;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getFlightCost() {
        return this.flightCost;
    }

    public void setFlightCost(String flightCost) {
        this.flightCost = flightCost;
    }

    public List<Flight> getFlights() {
        return this.flights;
    }

    public void setFlights(List<Flight> flights) {

        this.flights = flights;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	

   
}
