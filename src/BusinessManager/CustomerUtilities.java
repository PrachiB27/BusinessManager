package BusinessManager;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CustomerUtilities {
	
	 Scanner sc = new Scanner(System.in);
	 AddressUtilities addressUtilities = null;
	 List<Customer> customerList = null;	 
	 

	public List<Customer> createCustomer(int custCount) throws InputMismatchException{
		// TODO Auto-generated method stub
		customerList = new ArrayList<>();
		for(int i=0; i<custCount; i++) {		
		Customer customer = new Customer();
		customer.setId(i+1);	
		System.out.println("Please enter Customer first Name : ");
		customer.setFirstName(sc.nextLine());
		System.out.println("Please enter Customer Last Name : ");  
		customer.setLastName(sc.nextLine());
		System.out.println("Please enter Customer Email : ");  
		customer.setPhoneNumber(sc.nextLine());
		System.out.println("Please enter Annual Income : ");  
		customer.setAnnualIncome(sc.nextInt());
		
		System.out.println("How many addresses do you have?");
		int addressCount = sc.nextInt();
		
		List<Address> addressList = new ArrayList<>();
		addressUtilities = new AddressUtilities();
     	try {
       	addressList = addressUtilities.createAddress(addressCount);   
     	}catch(InputMismatchException e) {
    		System.out.println("Please provide valid input");
    	}
           
        customer.setAddresses(addressList);
        customerList.add(customer);
		}		
        
		return customerList;
		
	}
	
	
	public void updateCustomer(List<Customer> list) throws InputMismatchException {
		
		for (int i=0; i<list.size(); i++) {
			Customer toUpdateCustomer = list.get(i);
			System.out.println("Please enter updated Customer first Name : ");
			toUpdateCustomer.setFirstName(sc.nextLine());
			System.out.println("Please enter updated Customer Last Name : ");  
			toUpdateCustomer.setLastName(sc.nextLine());
			System.out.println("Please enter updated Customer Email : ");  
			toUpdateCustomer.setPhoneNumber(sc.nextLine());
			System.out.println("Please enter updated Annual Income : ");  
			toUpdateCustomer.setAnnualIncome(sc.nextInt());		
			
			System.out.println("Do you want to update address for customer: (Yes/No)");
			String ans = sc.nextLine();
			
			if(ans.equalsIgnoreCase("Yes")) {
				try {
				addressUtilities.updateAddress(list.get(i).getAddresses());
				}catch(InputMismatchException e) {
            		System.out.println("Please provide valid input");
            	}
			}
			
		}			

	}
		

	public void deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		System.out.println("Please enter name of customer : "); 
		customerList.remove(customerId);
		
	}

}
