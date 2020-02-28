
package com.mindtree.api.corporatebookingservice.DuffleSearchRequest;

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
    "cabin_class",
    "passengers",
    "slices"
})
public class Data {

    @JsonProperty("cabin_class")
    private String cabinClass;
    @JsonProperty("passengers")
    private List<Passenger> passengers = new ArrayList<Passenger>();
    @JsonProperty("slices")
    private List<Slice> slices = new ArrayList<Slice>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cabin_class")
    public String getCabinClass() {
        return cabinClass;
    }

    @JsonProperty("cabin_class")
    public void setCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
    }

    public Data withCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
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

    public Data withPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
        return this;
    }

    @JsonProperty("slices")
    public List<Slice> getSlices() {
        return slices;
    }

    @JsonProperty("slices")
    public void setSlices(List<Slice> slices) {
        this.slices = slices;
    }

    public Data withSlices(List<Slice> slices) {
        this.slices = slices;
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

    public Data withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Data.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cabinClass");
        sb.append('=');
        sb.append(((this.cabinClass == null)?"<null>":this.cabinClass));
        sb.append(',');
        sb.append("passengers");
        sb.append('=');
        sb.append(((this.passengers == null)?"<null>":this.passengers));
        sb.append(',');
        sb.append("slices");
        sb.append('=');
        sb.append(((this.slices == null)?"<null>":this.slices));
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
        result = ((result* 31)+((this.cabinClass == null)? 0 :this.cabinClass.hashCode()));
        result = ((result* 31)+((this.slices == null)? 0 :this.slices.hashCode()));
        result = ((result* 31)+((this.passengers == null)? 0 :this.passengers.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Data) == false) {
            return false;
        }
        Data rhs = ((Data) other);
        return (((((this.cabinClass == rhs.cabinClass)||((this.cabinClass!= null)&&this.cabinClass.equals(rhs.cabinClass)))&&((this.slices == rhs.slices)||((this.slices!= null)&&this.slices.equals(rhs.slices))))&&((this.passengers == rhs.passengers)||((this.passengers!= null)&&this.passengers.equals(rhs.passengers))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
