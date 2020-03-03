package com.mindtree.api.corporatebookingservice.dtos;

public class BookingRequest {

    private String from;
    private String to;
    private String depDate;
    private String returnDate;
    private String adults;
    private String children;
    private String infants;
    private String class_;
	/**
	 * @return the class_
	 */
	public String getClass_() {
		return class_;
	}
	/**
	 * @param class_ the class_ to set
	 */
	public void setClass_(String class_) {
		this.class_ = class_;
	}
	/**
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}
	/**
	 * @param from the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}
	/**
	 * @return the to
	 */
	public String getTo() {
		return to;
	}
	/**
	 * @param to the to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}
	/**
	 * @return the depDate
	 */
	public String getDepDate() {
		return depDate;
	}
	/**
	 * @param depDate the depDate to set
	 */
	public void setDepDate(String depDate) {
		this.depDate = depDate;
	}
	/**
	 * @return the returnDate
	 */
	public String getReturnDate() {
		return returnDate;
	}
	/**
	 * @param returnDate the returnDate to set
	 */
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	/**
	 * @return the adults
	 */
	public String getAdults() {
		return adults;
	}
	/**
	 * @param adults the adults to set
	 */
	public void setAdults(String adults) {
		this.adults = adults;
	}
	/**
	 * @return the children
	 */
	public String getChildren() {
		return children;
	}
	/**
	 * @param children the children to set
	 */
	public void setChildren(String children) {
		this.children = children;
	}
	/**
	 * @return the infants
	 */
	public String getInfants() {
		return infants;
	}
	/**
	 * @param infants the infants to set
	 */
	public void setInfants(String infants) {
		this.infants = infants;
	}
    
}
