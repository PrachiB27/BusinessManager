package Composition;

public class Customer {
	
	private Bill bill;	
	private String customerName;
	private int customerId;
	
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	public Bill getBill() {
		return bill;
	}
	
	public void setBill(Bill bill) {
		this.bill = bill;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int customerID) {
		this.customerId = customerId;
	}

}
