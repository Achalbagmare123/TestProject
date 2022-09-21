package com.rentaldetail.model;

import java.util.Objects;

public class RentalDetail {
	private String issueDate;
	private String returnDate;
	private String rentalPrice;
	private String calculateDays;
	private String copies;
	public RentalDetail() {
		super();
	}
	public RentalDetail(String issueDate, String returnDate, String rentalPrice, String calculateDays, String copies) {
		super();
		this.issueDate = issueDate;
		this.returnDate = returnDate;
		this.rentalPrice = rentalPrice;
		this.calculateDays = calculateDays;
		this.copies = copies;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public String getRentalPrice() {
		return rentalPrice;
	}
	public void setRentalPrice(String rentalPrice) {
		this.rentalPrice = rentalPrice;
	}
	public String getCalculateDays() {
		return calculateDays;
	}
	public void setCalculateDays(String calculateDays) {
		this.calculateDays = calculateDays;
	}
	public String getCopies() {
		return copies;
	}
	public void setCopies(String copies) {
		this.copies = copies;
	}
	@Override
	public String toString() {
		return "RentalDetail [issueDate=" + issueDate + ", returnDate=" + returnDate + ", rentalPrice=" + rentalPrice
				+ ", calculateDays=" + calculateDays + ", copies=" + copies + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(calculateDays, copies, issueDate, rentalPrice, returnDate);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RentalDetail other = (RentalDetail) obj;
		return Objects.equals(calculateDays, other.calculateDays) && Objects.equals(copies, other.copies)
				&& Objects.equals(issueDate, other.issueDate) && Objects.equals(rentalPrice, other.rentalPrice)
				&& Objects.equals(returnDate, other.returnDate);
	}
	
	
	

}
