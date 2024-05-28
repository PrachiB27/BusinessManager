package Composition;

public class PurchaseManagemnet extends Supermart{
	
	public void buyProduct() {
		super.setProductPurchase(true);		
		
	}
	
	int discount;
	int total;
	int qty;
	int price;
	int discountPercent;
	
	public void totalBill() {
		
		if(super.getProductPurchase() == true) {
			
			if (super.getProduct().getPrice() >= 0 && super.getProduct().getPrice() <= 100) {
				super.getCustomer().getBill().setDiscount(5);
			}else if (super.getProduct().getPrice() >= 101 && super.getProduct().getPrice() <= 1000){
				super.getCustomer().getBill().setDiscount(10);
			}else {
				super.getCustomer().getBill().setDiscount(15);
			}
			
			discount = super.getCustomer().getBill().getDiscount();
			//System.out.println(discount);	
			qty = super.getProduct().getQuantity();				
			price = super.getProduct().getPrice();			
			discountPercent = (1 - (discount/100) );
			//System.out.println(discountPercent);	
			
			total = (qty*price) * discountPercent;
			
			System.out.println("Total Bill is "+total);			
			
			
		}else {
			System.out.println("Customer did not bought product");
		}
		
	}

}
