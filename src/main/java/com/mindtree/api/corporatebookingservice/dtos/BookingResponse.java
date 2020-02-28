package com.mindtree.api.corporatebookingservice.dtos;


import java.util.List;

public class BookingResponse {
    private List<FlightItinerary> flightItinerary;
    private String cabinClass;

    public List<FlightItinerary> getFlightItinerary() {
        return this.flightItinerary;
    }

    public void setFlightItinerary(List<FlightItinerary> flightItinerary) {
        this.flightItinerary = flightItinerary;
    }

    public String getCabinClass() {
        return this.cabinClass;
    }

    public void setCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;

    }


    @Override
    public String toString() {
        return "BookingResponse{" +
                "flightItinerary=" + flightItinerary +
                ", cabinClass='" + cabinClass + '\'' +
                '}';
    }
}
