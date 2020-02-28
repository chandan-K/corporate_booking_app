
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
    "cabin_class",
    "created_at",
    "id",
    "live_mode",
    "offers",
    "passengers",
    "slices"
})
public class Data {

	@JsonIgnore
    @JsonProperty("cabin_class")
    private String cabinClass;
	@JsonIgnore
    @JsonProperty("created_at")
    private String createdAt;
	@JsonIgnore
    @JsonProperty("id")
    private String id;
    @JsonProperty("live_mode")
    @JsonIgnore
    private Boolean liveMode;
    @JsonProperty("offers")
    private List<Offer> offers = new ArrayList<Offer>();
    @JsonIgnore
    @JsonProperty("passengers")
    private List<Passenger> passengers = new ArrayList<Passenger>();
    @JsonIgnore
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

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Data withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Data withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("live_mode")
    public Boolean getLiveMode() {
        return liveMode;
    }

    @JsonProperty("live_mode")
    public void setLiveMode(Boolean liveMode) {
        this.liveMode = liveMode;
    }

    public Data withLiveMode(Boolean liveMode) {
        this.liveMode = liveMode;
        return this;
    }

    @JsonProperty("offers")
    public List<Offer> getOffers() {
        return offers;
    }

    @JsonProperty("offers")
    public void setOffers(List<Offer> offers) {
        this.offers = offers;
    }

    public Data withOffers(List<Offer> offers) {
        this.offers = offers;
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
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("liveMode");
        sb.append('=');
        sb.append(((this.liveMode == null)?"<null>":this.liveMode));
        sb.append(',');
        sb.append("offers");
        sb.append('=');
        sb.append(((this.offers == null)?"<null>":this.offers));
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
        result = ((result* 31)+((this.offers == null)? 0 :this.offers.hashCode()));
        result = ((result* 31)+((this.cabinClass == null)? 0 :this.cabinClass.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.slices == null)? 0 :this.slices.hashCode()));
        result = ((result* 31)+((this.liveMode == null)? 0 :this.liveMode.hashCode()));
        result = ((result* 31)+((this.passengers == null)? 0 :this.passengers.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
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
        return (((((((((this.offers == rhs.offers)||((this.offers!= null)&&this.offers.equals(rhs.offers)))&&((this.cabinClass == rhs.cabinClass)||((this.cabinClass!= null)&&this.cabinClass.equals(rhs.cabinClass))))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.slices == rhs.slices)||((this.slices!= null)&&this.slices.equals(rhs.slices))))&&((this.liveMode == rhs.liveMode)||((this.liveMode!= null)&&this.liveMode.equals(rhs.liveMode))))&&((this.passengers == rhs.passengers)||((this.passengers!= null)&&this.passengers.equals(rhs.passengers))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
