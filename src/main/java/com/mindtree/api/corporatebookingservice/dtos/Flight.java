package com.mindtree.api.corporatebookingservice.dtos;

/**
 * Created by M1038824 on 10/12/2019.
 */
public class Flight {

    private String flightNumber;
    private String origin;
    private String dstn;
    private String airCraftIataCode;
    private String airCraftName;

    private String depDate;
    private String arrivalDate;

    private String depTime;
    private String arrivalTime;
    private String originCityName;
    private String destinationCityName;
    private String duration;

    public String getDuration() {
        return this.duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDestinationCityName() {
        return this.destinationCityName;
    }

    public void setDestinationCityName(String destinationCityName) {
        this.destinationCityName = destinationCityName;
    }

    public String getOriginCityName() {
        return this.originCityName;
    }

    public void setOriginCityName(String originCityName) {
        this.originCityName = originCityName;
    }

    public String getAirCraftName() {
        return this.airCraftName;
    }

    public void setAirCraftName(String airCraftName) {
        this.airCraftName = airCraftName;
    }


    public String getFlightNumber() {
        return this.flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {
        return this.origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDstn() {
        return this.dstn;
    }

    public void setDstn(String dstn) {
        this.dstn = dstn;
    }

    public String getAirCraftIataCode() {
        return this.airCraftIataCode;
    }

    public void setAirCraftIataCode(String airCraftIataCode) {
        this.airCraftIataCode = airCraftIataCode;
    }

    public String getDepDate() {
        return this.depDate;
    }

    public void setDepDate(String depDate) {
        this.depDate = depDate;
    }

    public String getArrivalDate() {
        return this.arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }


    public String getDepTime() {
        return this.depTime;
    }

    public void setDepTime(String depTime) {
        this.depTime = depTime;
    }

    public String getArrivalTime() {
        return this.arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", origin='" + origin + '\'' +
                ", dstn='" + dstn + '\'' +
                ", airCraftIataCode='" + airCraftIataCode + '\'' +
                ", airCraftName='" + airCraftName + '\'' +
                ", depDate='" + depDate + '\'' +
                ", arrivalDate='" + arrivalDate + '\'' +
                ", depTime='" + depTime + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", originCityName='" + originCityName + '\'' +
                ", destinationCityName='" + destinationCityName + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
