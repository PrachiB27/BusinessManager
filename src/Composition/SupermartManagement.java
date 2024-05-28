package Composition;

public class SupermartManagement {
	
	public static void main(String[] args) {
	
		
		Product p = new Product();
		p.setProductName("Pen");
		p.setPrice(20);
		p.setQuantity(5);
		
		Bill b = new Bill();
		b.setBillNumber(1001);
		//b.setDiscount(5);
		b.setGenerateBill(true);
		
		Customer c = new Customer();
		c.setCustomerName("ABC");
		c.setCustomerId(1);
		c.setBill(b);
		
		PurchaseManagemnet s = new PurchaseManagemnet();
		s.setCustomer(c);
		s.setProduct(p);
		s.setProductPurchase(true);
		
		
		s.totalBill();
		
		
		
	}

}
