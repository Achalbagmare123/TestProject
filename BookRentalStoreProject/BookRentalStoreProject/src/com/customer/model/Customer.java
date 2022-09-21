package com.customer.model;

import java.util.Objects;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerPhoneNumber;
	private String customerAddress;
	public Customer() {
		super();	
	}
	public Customer(int customerId, String customerName, String customerPhoneNumber, String customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPhoneNumber = customerPhoneNumber;
		this.customerAddress = customerAddress;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPhoneNumber="
				+ customerPhoneNumber + ", customerAddress=" + customerAddress + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(customerAddress, customerId, customerName, customerPhoneNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(customerAddress, other.customerAddress) && customerId == other.customerId
				&& Objects.equals(customerName, other.customerName)
				&& Objects.equals(customerPhoneNumber, other.customerPhoneNumber);
	}
}