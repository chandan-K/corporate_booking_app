
package com.mindtree.api.corporatebookingservice.DuffleSearchResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "aircraft",
    "arriving_at",
    "departing_at",
    "destination",
    "destination_terminal",
    "distance",
    "duration",
    "marketing_carrier",
    "marketing_carrier_flight_number",
    "operating_carrier",
    "operating_carrier_flight_number",
    "origin",
    "origin_terminal",
    "passengers"
})
public class Segment {

    @JsonProperty("aircraft")
    private Aircraft aircraft;
    @JsonProperty("arriving_at")
    private String arrivingAt;
    @JsonProperty("departing_at")
    private String departingAt;
    @JsonProperty("destination")
    private Destination destination;
    @JsonProperty("destination_terminal")
    private String destinationTerminal;
    @JsonProperty("distance")
    private String distance;
    @JsonProperty("duration")
    private String duration;
    @JsonProperty("marketing_carrier")
    private MarketingCarrier marketingCarrier;
    @JsonProperty("marketing_carrier_flight_number")
    private String marketingCarrierFlightNumber;
    @JsonProperty("operating_carrier")
    private OperatingCarrier operatingCarrier;
    @JsonProperty("operating_carrier_flight_number")
    private String operatingCarrierFlightNumber;
    @JsonProperty("origin")
    private Origin origin;
    @JsonProperty("origin_terminal")
    private String originTerminal;
    @JsonIgnore
    @JsonProperty("passengers")
    private List<Passenger> passengers = new ArrayList<Passenger>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("aircraft")
    public Aircraft getAircraft() {
        return aircraft;
    }

    @JsonProperty("aircraft")
    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public Segment withAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
        return this;
    }

    @JsonProperty("arriving_at")
    public String getArrivingAt() {
        return arrivingAt;
    }

    @JsonProperty("arriving_at")
    public void setArrivingAt(String arrivingAt) {
        this.arrivingAt = arrivingAt;
    }

    public Segment withArrivingAt(String arrivingAt) {
        this.arrivingAt = arrivingAt;
        return this;
    }

    @JsonProperty("departing_at")
    public String getDepartingAt() {
        return departingAt;
    }

    @JsonProperty("departing_at")
    public void setDepartingAt(String departingAt) {
        this.departingAt = departingAt;
    }

    public Segment withDepartingAt(String departingAt) {
        this.departingAt = departingAt;
        return this;
    }

    @JsonProperty("destination")
    public Destination getDestination() {
        return destination;
    }

    @JsonProperty("destination")
    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public Segment withDestination(Destination destination) {
        this.destination = destination;
        return this;
    }

    @JsonProperty("destination_terminal")
    public String getDestinationTerminal() {
        return destinationTerminal;
    }

    @JsonProperty("destination_terminal")
    public void setDestinationTerminal(String destinationTerminal) {
        this.destinationTerminal = destinationTerminal;
    }

    public Segment withDestinationTerminal(String destinationTerminal) {
        this.destinationTerminal = destinationTerminal;
        return this;
    }

    @JsonProperty("distance")
    public String getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(String distance) {
        this.distance = distance;
    }

    public Segment withDistance(String distance) {
        this.distance = distance;
        return this;
    }

    @JsonProperty("duration")
    public String getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Segment withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    @JsonProperty("marketing_carrier")
    public MarketingCarrier getMarketingCarrier() {
        return marketingCarrier;
    }

    @JsonProperty("marketing_carrier")
    public void setMarketingCarrier(MarketingCarrier marketingCarrier) {
        this.marketingCarrier = marketingCarrier;
    }

    public Segment withMarketingCarrier(MarketingCarrier marketingCarrier) {
        this.marketingCarrier = marketingCarrier;
        return this;
    }

    @JsonProperty("marketing_carrier_flight_number")
    public String getMarketingCarrierFlightNumber() {
        return marketingCarrierFlightNumber;
    }

    @JsonProperty("marketing_carrier_flight_number")
    public void setMarketingCarrierFlightNumber(String marketingCarrierFlightNumber) {
        this.marketingCarrierFlightNumber = marketingCarrierFlightNumber;
    }

    public Segment withMarketingCarrierFlightNumber(String marketingCarrierFlightNumber) {
        this.marketingCarrierFlightNumber = marketingCarrierFlightNumber;
        return this;
    }

    @JsonProperty("operating_carrier")
    public OperatingCarrier getOperatingCarrier() {
        return operatingCarrier;
    }

    @JsonProperty("operating_carrier")
    public void setOperatingCarrier(OperatingCarrier operatingCarrier) {
        this.operatingCarrier = operatingCarrier;
    }

    public Segment withOperatingCarrier(OperatingCarrier operatingCarrier) {
        this.operatingCarrier = operatingCarrier;
        return this;
    }

    @JsonProperty("operating_carrier_flight_number")
    public String getOperatingCarrierFlightNumber() {
        return operatingCarrierFlightNumber;
    }

    @JsonProperty("operating_carrier_flight_number")
    public void setOperatingCarrierFlightNumber(String operatingCarrierFlightNumber) {
        this.operatingCarrierFlightNumber = operatingCarrierFlightNumber;
    }

    public Segment withOperatingCarrierFlightNumber(String operatingCarrierFlightNumber) {
        this.operatingCarrierFlightNumber = operatingCarrierFlightNumber;
        return this;
    }

    @JsonProperty("origin")
    public Origin getOrigin() {
        return origin;
    }

    @JsonProperty("origin")
    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public Segment withOrigin(Origin origin) {
        this.origin = origin;
        return this;
    }

    @JsonProperty("origin_terminal")
    public String getOriginTerminal() {
        return originTerminal;
    }

    @JsonProperty("origin_terminal")
    public void setOriginTerminal(String originTerminal) {
        this.originTerminal = originTerminal;
    }

    public Segment withOriginTerminal(String originTerminal) {
        this.originTerminal = originTerminal;
        return this;
    }

    @JsonProperty("passengers")
    public List<Passenger> getPassengers() {
        return passengers;
    }

    @JsonProperty("passengers")
    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Segment withPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Segment withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Segment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("aircraft");
        sb.append('=');
        sb.append(((this.aircraft == null)?"<null>":this.aircraft));
        sb.append(',');
        sb.append("arrivingAt");
        sb.append('=');
        sb.append(((this.arrivingAt == null)?"<null>":this.arrivingAt));
        sb.append(',');
        sb.append("departingAt");
        sb.append('=');
        sb.append(((this.departingAt == null)?"<null>":this.departingAt));
        sb.append(',');
        sb.append("destination");
        sb.append('=');
        sb.append(((this.destination == null)?"<null>":this.destination));
        sb.append(',');
        sb.append("destinationTerminal");
        sb.append('=');
        sb.append(((this.destinationTerminal == null)?"<null>":this.destinationTerminal));
        sb.append(',');
        sb.append("distance");
        sb.append('=');
        sb.append(((this.distance == null)?"<null>":this.distance));
        sb.append(',');
        sb.append("duration");
        sb.append('=');
        sb.append(((this.duration == null)?"<null>":this.duration));
        sb.append(',');
        sb.append("marketingCarrier");
        sb.append('=');
        sb.append(((this.marketingCarrier == null)?"<null>":this.marketingCarrier));
        sb.append(',');
        sb.append("marketingCarrierFlightNumber");
        sb.append('=');
        sb.append(((this.marketingCarrierFlightNumber == null)?"<null>":this.marketingCarrierFlightNumber));
        sb.append(',');
        sb.append("operatingCarrier");
        sb.append('=');
        sb.append(((this.operatingCarrier == null)?"<null>":this.operatingCarrier));
        sb.append(',');
        sb.append("operatingCarrierFlightNumber");
        sb.append('=');
        sb.append(((this.operatingCarrierFlightNumber == null)?"<null>":this.operatingCarrierFlightNumber));
        sb.append(',');
        sb.append("origin");
        sb.append('=');
        sb.append(((this.origin == null)?"<null>":this.origin));
        sb.append(',');
        sb.append("originTerminal");
        sb.append('=');
        sb.append(((this.originTerminal == null)?"<null>":this.originTerminal));
        sb.append(',');
        sb.append("passengers");
        sb.append('=');
        sb.append(((this.passengers == null)?"<null>":this.passengers));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.passengers == null)? 0 :this.passengers.hashCode()));
        result = ((result* 31)+((this.departingAt == null)? 0 :this.departingAt.hashCode()));
        result = ((result* 31)+((this.distance == null)? 0 :this.distance.hashCode()));
        result = ((result* 31)+((this.aircraft == null)? 0 :this.aircraft.hashCode()));
        result = ((result* 31)+((this.origin == null)? 0 :this.origin.hashCode()));
        result = ((result* 31)+((this.destination == null)? 0 :this.destination.hashCode()));
        result = ((result* 31)+((this.marketingCarrierFlightNumber == null)? 0 :this.marketingCarrierFlightNumber.hashCode()));
        result = ((result* 31)+((this.duration == null)? 0 :this.duration.hashCode()));
        result = ((result* 31)+((this.marketingCarrier == null)? 0 :this.marketingCarrier.hashCode()));
        result = ((result* 31)+((this.destinationTerminal == null)? 0 :this.destinationTerminal.hashCode()));
        result = ((result* 31)+((this.operatingCarrierFlightNumber == null)? 0 :this.operatingCarrierFlightNumber.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.operatingCarrier == null)? 0 :this.operatingCarrier.hashCode()));
        result = ((result* 31)+((this.arrivingAt == null)? 0 :this.arrivingAt.hashCode()));
        result = ((result* 31)+((this.originTerminal == null)? 0 :this.originTerminal.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Segment) == false) {
            return false;
        }
        Segment rhs = ((Segment) other);
        return ((((((((((((((((this.passengers == rhs.passengers)||((this.passengers!= null)&&this.passengers.equals(rhs.passengers)))&&((this.departingAt == rhs.departingAt)||((this.departingAt!= null)&&this.departingAt.equals(rhs.departingAt))))&&((this.distance == rhs.distance)||((this.distance!= null)&&this.distance.equals(rhs.distance))))&&((this.aircraft == rhs.aircraft)||((this.aircraft!= null)&&this.aircraft.equals(rhs.aircraft))))&&((this.origin == rhs.origin)||((this.origin!= null)&&this.origin.equals(rhs.origin))))&&((this.destination == rhs.destination)||((this.destination!= null)&&this.destination.equals(rhs.destination))))&&((this.marketingCarrierFlightNumber == rhs.marketingCarrierFlightNumber)||((this.marketingCarrierFlightNumber!= null)&&this.marketingCarrierFlightNumber.equals(rhs.marketingCarrierFlightNumber))))&&((this.duration == rhs.duration)||((this.duration!= null)&&this.duration.equals(rhs.duration))))&&((this.marketingCarrier == rhs.marketingCarrier)||((this.marketingCarrier!= null)&&this.marketingCarrier.equals(rhs.marketingCarrier))))&&((this.destinationTerminal == rhs.destinationTerminal)||((this.destinationTerminal!= null)&&this.destinationTerminal.equals(rhs.destinationTerminal))))&&((this.operatingCarrierFlightNumber == rhs.operatingCarrierFlightNumber)||((this.operatingCarrierFlightNumber!= null)&&this.operatingCarrierFlightNumber.equals(rhs.operatingCarrierFlightNumber))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.operatingCarrier == rhs.operatingCarrier)||((this.operatingCarrier!= null)&&this.operatingCarrier.equals(rhs.operatingCarrier))))&&((this.arrivingAt == rhs.arrivingAt)||((this.arrivingAt!= null)&&this.arrivingAt.equals(rhs.arrivingAt))))&&((this.originTerminal == rhs.originTerminal)||((this.originTerminal!= null)&&this.originTerminal.equals(rhs.originTerminal))));
    }

}
