package Composition;

public class Bill {
	
	private int billNumber;
	private boolean generateBill;
	private int discount;
	
	public int getBillNumber() {
		return billNumber;
	}
	
	public void setBillNumber(int billNumber) {
		this.billNumber = billNumber;
	}

	
	public boolean generateBill() {
		return generateBill;
	}
	
	public void setGenerateBill(boolean generate) {
		this.generateBill = generate;
	}
	
	public int getDiscount() {
		return discount;
	}
	
	public void setDiscount(int discount) {
		this.discount = discount;
	}
}
