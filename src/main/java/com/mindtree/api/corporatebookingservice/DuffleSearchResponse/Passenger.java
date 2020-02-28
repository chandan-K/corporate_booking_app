
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
    "baggages",
    "cabin_class",
    "cabin_class_marketing_name",
    "passenger_id"
})
public class Passenger {

    @JsonProperty("baggages")
    private List<Baggage> baggages = new ArrayList<Baggage>();
    @JsonProperty("cabin_class")
    private String cabinClass;
    @JsonProperty("cabin_class_marketing_name")
    private String cabinClassMarketingName;
    @JsonProperty("passenger_id")
    private String passengerId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("baggages")
    public List<Baggage> getBaggages() {
        return baggages;
    }

    @JsonProperty("baggages")
    public void setBaggages(List<Baggage> baggages) {
        this.baggages = baggages;
    }

    public Passenger withBaggages(List<Baggage> baggages) {
        this.baggages = baggages;
        return this;
    }

    @JsonProperty("cabin_class")
    public String getCabinClass() {
        return cabinClass;
    }

    @JsonProperty("cabin_class")
    public void setCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
    }

    public Passenger withCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
        return this;
    }

    @JsonProperty("cabin_class_marketing_name")
    public String getCabinClassMarketingName() {
        return cabinClassMarketingName;
    }

    @JsonProperty("cabin_class_marketing_name")
    public void setCabinClassMarketingName(String cabinClassMarketingName) {
        this.cabinClassMarketingName = cabinClassMarketingName;
    }

    public Passenger withCabinClassMarketingName(String cabinClassMarketingName) {
        this.cabinClassMarketingName = cabinClassMarketingName;
        return this;
    }

    @JsonProperty("passenger_id")
    public String getPassengerId() {
        return passengerId;
    }

    @JsonProperty("passenger_id")
    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    public Passenger withPassengerId(String passengerId) {
        this.passengerId = passengerId;
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

    public Passenger withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Passenger.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("baggages");
        sb.append('=');
        sb.append(((this.baggages == null)?"<null>":this.baggages));
        sb.append(',');
        sb.append("cabinClass");
        sb.append('=');
        sb.append(((this.cabinClass == null)?"<null>":this.cabinClass));
        sb.append(',');
        sb.append("cabinClassMarketingName");
        sb.append('=');
        sb.append(((this.cabinClassMarketingName == null)?"<null>":this.cabinClassMarketingName));
        sb.append(',');
        sb.append("passengerId");
        sb.append('=');
        sb.append(((this.passengerId == null)?"<null>":this.passengerId));
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
        result = ((result* 31)+((this.baggages == null)? 0 :this.baggages.hashCode()));
        result = ((result* 31)+((this.cabinClass == null)? 0 :this.cabinClass.hashCode()));
        result = ((result* 31)+((this.passengerId == null)? 0 :this.passengerId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cabinClassMarketingName == null)? 0 :this.cabinClassMarketingName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Passenger) == false) {
            return false;
        }
        Passenger rhs = ((Passenger) other);
        return ((((((this.baggages == rhs.baggages)||((this.baggages!= null)&&this.baggages.equals(rhs.baggages)))&&((this.cabinClass == rhs.cabinClass)||((this.cabinClass!= null)&&this.cabinClass.equals(rhs.cabinClass))))&&((this.passengerId == rhs.passengerId)||((this.passengerId!= null)&&this.passengerId.equals(rhs.passengerId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cabinClassMarketingName == rhs.cabinClassMarketingName)||((this.cabinClassMarketingName!= null)&&this.cabinClassMarketingName.equals(rhs.cabinClassMarketingName))));
    }

}
