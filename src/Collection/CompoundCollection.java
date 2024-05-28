	package Collection;

import java.util.HashMap;
import java.util.Map;

public class CompoundCollection {

		public static void main(String[] args) {
			
			Map<Integer, Product> productMap = new HashMap<>();
			
			Product firstProduct = new Product();
			
			firstProduct.setId(1);;
			firstProduct.setCategory("Phone");
			firstProduct.setProductName("Iphone 5");
			firstProduct.setColor("White");
			firstProduct.setSize(15);
			firstProduct.setQty(1);
			firstProduct.setPrice(70000);
			
			Product secondProduct = new Product();
			
			secondProduct.setId(2);;
			secondProduct.setCategory("Phone");
			secondProduct.setProductName("Samsung");
			secondProduct.setColor("Blue");
			secondProduct.setSize(20);
			secondProduct.setQty(2);
			secondProduct.setPrice(55000);
			
			Product thirdProduct = new Product();
			
			thirdProduct.setId(3);;
			thirdProduct.setCategory("Cosmetic");
			thirdProduct.setProductName("Compact");
			thirdProduct.setColor("Pint tone");
			thirdProduct.setSize(10);
			thirdProduct.setQty(1);
			thirdProduct.setPrice(2000);
			
			productMap.put(1, firstProduct);
			productMap.put(2, secondProduct);
			productMap.put(3, thirdProduct);
			
			
			System.out.println(productMap);		
			
			System.out.println(thirdProduct.toString());
			
			
			int totalqty = 0;
			
			for (int i=1; i<=productMap.size(); i++) {
				if (productMap.get(i).getCategory().equalsIgnoreCase("phone")) {					
					
					totalqty++;
										
				}				
			}	
			
			System.out.println("Total Quatity of Category Phone is " +totalqty);			
			
		}
		
}
