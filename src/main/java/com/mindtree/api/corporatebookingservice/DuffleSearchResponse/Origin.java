
package com.mindtree.api.corporatebookingservice.DuffleSearchResponse;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "airports",
    "city",
    "iata_city_code",
    "iata_code",
    "iata_country_code",
    "id",
    "name",
    "type"
})
public class Origin {

    @JsonProperty("airports")
    private Object airports;
    @JsonProperty("city")
    private City city;
    @JsonProperty("iata_city_code")
    private String iataCityCode;
    @JsonProperty("iata_code")
    private String iataCode;
    @JsonProperty("iata_country_code")
    private String iataCountryCode;
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("airports")
    public Object getAirports() {
        return airports;
    }

    @JsonProperty("airports")
    public void setAirports(Object airports) {
        this.airports = airports;
    }

    public Origin withAirports(Object airports) {
        this.airports = airports;
        return this;
    }

    @JsonProperty("city")
    public City getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(City city) {
        this.city = city;
    }

    public Origin withCity(City city) {
        this.city = city;
        return this;
    }

    @JsonProperty("iata_city_code")
    public String getIataCityCode() {
        return iataCityCode;
    }

    @JsonProperty("iata_city_code")
    public void setIataCityCode(String iataCityCode) {
        this.iataCityCode = iataCityCode;
    }

    public Origin withIataCityCode(String iataCityCode) {
        this.iataCityCode = iataCityCode;
        return this;
    }

    @JsonProperty("iata_code")
    public String getIataCode() {
        return iataCode;
    }

    @JsonProperty("iata_code")
    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }

    public Origin withIataCode(String iataCode) {
        this.iataCode = iataCode;
        return this;
    }

    @JsonProperty("iata_country_code")
    public String getIataCountryCode() {
        return iataCountryCode;
    }

    @JsonProperty("iata_country_code")
    public void setIataCountryCode(String iataCountryCode) {
        this.iataCountryCode = iataCountryCode;
    }

    public Origin withIataCountryCode(String iataCountryCode) {
        this.iataCountryCode = iataCountryCode;
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

    public Origin withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Origin withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Origin withType(String type) {
        this.type = type;
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

    public Origin withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Origin.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("airports");
        sb.append('=');
        sb.append(((this.airports == null)?"<null>":this.airports));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("iataCityCode");
        sb.append('=');
        sb.append(((this.iataCityCode == null)?"<null>":this.iataCityCode));
        sb.append(',');
        sb.append("iataCode");
        sb.append('=');
        sb.append(((this.iataCode == null)?"<null>":this.iataCode));
        sb.append(',');
        sb.append("iataCountryCode");
        sb.append('=');
        sb.append(((this.iataCountryCode == null)?"<null>":this.iataCountryCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        result = ((result* 31)+((this.iataCode == null)? 0 :this.iataCode.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.iataCountryCode == null)? 0 :this.iataCountryCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.airports == null)? 0 :this.airports.hashCode()));
        result = ((result* 31)+((this.iataCityCode == null)? 0 :this.iataCityCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Origin) == false) {
            return false;
        }
        Origin rhs = ((Origin) other);
        return ((((((((((this.iataCode == rhs.iataCode)||((this.iataCode!= null)&&this.iataCode.equals(rhs.iataCode)))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.iataCountryCode == rhs.iataCountryCode)||((this.iataCountryCode!= null)&&this.iataCountryCode.equals(rhs.iataCountryCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.airports == rhs.airports)||((this.airports!= null)&&this.airports.equals(rhs.airports))))&&((this.iataCityCode == rhs.iataCityCode)||((this.iataCityCode!= null)&&this.iataCityCode.equals(rhs.iataCityCode))));
    }

}
