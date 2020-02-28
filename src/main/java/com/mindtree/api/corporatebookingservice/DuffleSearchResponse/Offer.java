
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
    "base_amount",
    "base_currency",
    "created_at",
    "expires_at",
    "id",
    "live_mode",
    "owner",
    "slices",
    "tax_amount",
    "tax_currency",
    "total_amount",
    "total_currency"
})
public class Offer {

    @JsonProperty("base_amount")
    private String baseAmount;
    @JsonProperty("base_currency")
    private String baseCurrency;
    @JsonIgnore
    @JsonProperty("created_at")
    private String createdAt;
    @JsonIgnore
    @JsonProperty("expires_at")
    private String expiresAt;
    @JsonIgnore
    @JsonProperty("id")
    private String id;
    @JsonIgnore
    @JsonProperty("live_mode")
    private Boolean liveMode;
    @JsonIgnore
    @JsonProperty("owner")
    private Owner owner;
    @JsonProperty("slices")
    private List<Slice> slices = new ArrayList<Slice>();
    @JsonProperty("tax_amount")
    private String taxAmount;
    @JsonProperty("tax_currency")
    private String taxCurrency;
    @JsonProperty("total_amount")
    private String totalAmount;
    @JsonProperty("total_currency")
    private String totalCurrency;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("base_amount")
    public String getBaseAmount() {
        return baseAmount;
    }

    @JsonProperty("base_amount")
    public void setBaseAmount(String baseAmount) {
        this.baseAmount = baseAmount;
    }

    public Offer withBaseAmount(String baseAmount) {
        this.baseAmount = baseAmount;
        return this;
    }

    @JsonProperty("base_currency")
    public String getBaseCurrency() {
        return baseCurrency;
    }

    @JsonProperty("base_currency")
    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public Offer withBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
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

    public Offer withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("expires_at")
    public String getExpiresAt() {
        return expiresAt;
    }

    @JsonProperty("expires_at")
    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    public Offer withExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
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

    public Offer withId(String id) {
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

    public Offer withLiveMode(Boolean liveMode) {
        this.liveMode = liveMode;
        return this;
    }

    @JsonProperty("owner")
    public Owner getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Offer withOwner(Owner owner) {
        this.owner = owner;
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

    public Offer withSlices(List<Slice> slices) {
        this.slices = slices;
        return this;
    }

    @JsonProperty("tax_amount")
    public String getTaxAmount() {
        return taxAmount;
    }

    @JsonProperty("tax_amount")
    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Offer withTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
        return this;
    }

    @JsonProperty("tax_currency")
    public String getTaxCurrency() {
        return taxCurrency;
    }

    @JsonProperty("tax_currency")
    public void setTaxCurrency(String taxCurrency) {
        this.taxCurrency = taxCurrency;
    }

    public Offer withTaxCurrency(String taxCurrency) {
        this.taxCurrency = taxCurrency;
        return this;
    }

    @JsonProperty("total_amount")
    public String getTotalAmount() {
        return totalAmount;
    }

    @JsonProperty("total_amount")
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Offer withTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    @JsonProperty("total_currency")
    public String getTotalCurrency() {
        return totalCurrency;
    }

    @JsonProperty("total_currency")
    public void setTotalCurrency(String totalCurrency) {
        this.totalCurrency = totalCurrency;
    }

    public Offer withTotalCurrency(String totalCurrency) {
        this.totalCurrency = totalCurrency;
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

    public Offer withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Offer.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("baseAmount");
        sb.append('=');
        sb.append(((this.baseAmount == null)?"<null>":this.baseAmount));
        sb.append(',');
        sb.append("baseCurrency");
        sb.append('=');
        sb.append(((this.baseCurrency == null)?"<null>":this.baseCurrency));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("expiresAt");
        sb.append('=');
        sb.append(((this.expiresAt == null)?"<null>":this.expiresAt));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("liveMode");
        sb.append('=');
        sb.append(((this.liveMode == null)?"<null>":this.liveMode));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("slices");
        sb.append('=');
        sb.append(((this.slices == null)?"<null>":this.slices));
        sb.append(',');
        sb.append("taxAmount");
        sb.append('=');
        sb.append(((this.taxAmount == null)?"<null>":this.taxAmount));
        sb.append(',');
        sb.append("taxCurrency");
        sb.append('=');
        sb.append(((this.taxCurrency == null)?"<null>":this.taxCurrency));
        sb.append(',');
        sb.append("totalAmount");
        sb.append('=');
        sb.append(((this.totalAmount == null)?"<null>":this.totalAmount));
        sb.append(',');
        sb.append("totalCurrency");
        sb.append('=');
        sb.append(((this.totalCurrency == null)?"<null>":this.totalCurrency));
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
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.slices == null)? 0 :this.slices.hashCode()));
        result = ((result* 31)+((this.totalCurrency == null)? 0 :this.totalCurrency.hashCode()));
        result = ((result* 31)+((this.baseAmount == null)? 0 :this.baseAmount.hashCode()));
        result = ((result* 31)+((this.baseCurrency == null)? 0 :this.baseCurrency.hashCode()));
        result = ((result* 31)+((this.expiresAt == null)? 0 :this.expiresAt.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.totalAmount == null)? 0 :this.totalAmount.hashCode()));
        result = ((result* 31)+((this.liveMode == null)? 0 :this.liveMode.hashCode()));
        result = ((result* 31)+((this.taxCurrency == null)? 0 :this.taxCurrency.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.taxAmount == null)? 0 :this.taxAmount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Offer) == false) {
            return false;
        }
        Offer rhs = ((Offer) other);
        return ((((((((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.slices == rhs.slices)||((this.slices!= null)&&this.slices.equals(rhs.slices))))&&((this.totalCurrency == rhs.totalCurrency)||((this.totalCurrency!= null)&&this.totalCurrency.equals(rhs.totalCurrency))))&&((this.baseAmount == rhs.baseAmount)||((this.baseAmount!= null)&&this.baseAmount.equals(rhs.baseAmount))))&&((this.baseCurrency == rhs.baseCurrency)||((this.baseCurrency!= null)&&this.baseCurrency.equals(rhs.baseCurrency))))&&((this.expiresAt == rhs.expiresAt)||((this.expiresAt!= null)&&this.expiresAt.equals(rhs.expiresAt))))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.totalAmount == rhs.totalAmount)||((this.totalAmount!= null)&&this.totalAmount.equals(rhs.totalAmount))))&&((this.liveMode == rhs.liveMode)||((this.liveMode!= null)&&this.liveMode.equals(rhs.liveMode))))&&((this.taxCurrency == rhs.taxCurrency)||((this.taxCurrency!= null)&&this.taxCurrency.equals(rhs.taxCurrency))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.taxAmount == rhs.taxAmount)||((this.taxAmount!= null)&&this.taxAmount.equals(rhs.taxAmount))));
    }

}
