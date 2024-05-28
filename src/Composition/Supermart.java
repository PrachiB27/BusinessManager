package Composition;

public class Supermart {
	
	private Product product;
	private Customer customer;
	private boolean productPurchase;
	
	
	public Product getProduct() {
			return product;			
	}
	
	public void setProduct(Product product) {
		this.product = product;	
	}
	
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public boolean getProductPurchase() {
		return productPurchase;
	}
	
	public void setProductPurchase(boolean productPurchase) {
		this.productPurchase = productPurchase;
	}

		
}
