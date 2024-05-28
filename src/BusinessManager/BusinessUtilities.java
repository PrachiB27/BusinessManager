package BusinessManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Collection.Product;

public class BusinessUtilities {

    Scanner sc = new Scanner(System.in);

    List<Business> businessList = new ArrayList<>(); 
    Business business = new Business();
    CustomerUtilities customerUtilities = null;
    int businessId =1;
    

    public Business createBusiness() throws InputMismatchException {
        
    		
    	int custCount = 0;    
    	
        business.setId(businessId);
        List<Customer> customerList = new ArrayList<>();
        System.out.println("Please enter Business Name : ");
        business.setBusinessName(sc.nextLine());
        System.out.println("Please enter Business Sector : ");
        business.setBusinessSector(sc.nextLine());
        System.out.println("Please enter Legal Entity : ");
        business.setLegalEntity(sc.nextLine());
        System.out.println("How many customers does this business have");
        custCount = sc.nextInt(); 
         
        customerUtilities = new CustomerUtilities();
        try {
       	customerList = customerUtilities.createCustomer(custCount); 
        }catch(InputMismatchException e) {
    		System.out.println("Please provide valid input");
    	}
          
        System.out.println(customerList);
        System.out.println(customerList.get(0).getAddresses());
        
        business.setCustomers(customerList);
        businessList.add(business);    
        businessId++;
        
        return business;
    }
    
    
	public void readBusiness() {
		// TODO Auto-generated method stub
		
		for (int i=0; i<businessList.size(); i++) {
			System.out.println("##Business details as below :");
			System.out.println("Business Name : "+businessList.get(i).getBusinessName()+
							   " /Business Sector: "+businessList.get(i).getBusinessSector()+
							   " /Business Entity: "+businessList.get(i).getLegalEntity());
			System.out.println("***************************************************************");
			
			System.out.println("##Business has "+businessList.get(i).getCustomers().size()+" customers and details are as below: ");			
				for (int j=0; j<businessList.get(i).getCustomers().size(); j++) {				
					System.out.println("Customer Details : ");
					System.out.println(businessList.get(i).getCustomers());
					System.out.println("Customer Name :"+businessList.get(i).getCustomers().get(j).getFirstName()+" "+businessList.get(i).getCustomers().get(j).getLastName()+
							"/Contact Details :"+businessList.get(i).getCustomers().get(j).getEmail()+" "+businessList.get(i).getCustomers().get(j).getPhoneNumber());
					System.out.println("***************************************************************");
					
					System.out.println("##Customer has "+businessList.get(i).getCustomers().get(j).getAddresses().size()+" addresses and details are as below: ");					
					for (int k=0; k<businessList.get(i).getCustomers().get(j).getAddresses().size(); k++) {						
						System.out.println("Address Details :");
						System.out.println("/Address Street :"+businessList.get(i).getCustomers().get(j).getAddresses().get(k).getStreet()+","+" "+businessList.get(i).getCustomers().get(j).getAddresses().get(k).getLocality()+","+" "+businessList.get(i).getCustomers().get(j).getAddresses().get(k).getCity()+","+" "+businessList.get(i).getCustomers().get(j).getAddresses().get(k).getState()+","+" "+businessList.get(i).getCustomers().get(j).getAddresses().get(k).getCountry());
					}
					
				}
							
		}
	
	}

	
	public void updateBusiness() throws InputMismatchException {
		System.out.println("Provide business id to update ");
		int id=sc.nextInt();
		
		for (int i=0; i<businessList.size(); i++) {
			
			if (businessList.get(i).getId() == id) {
			
				System.out.println("Please update Business Name : ");
		        business.setBusinessName(sc.nextLine());
		        System.out.println("Please update Business Sector : ");
		        business.setBusinessSector(sc.nextLine());
		        System.out.println("Please update Legal Entity : ");
		        business.setLegalEntity(sc.nextLine());
		        
		        System.out.println("Do you want to update Customer Details: (Yes/No)");
				String ans = sc.nextLine();
				
				if (ans.equalsIgnoreCase("Yes")) {
					
					try {
					customerUtilities.updateCustomer(businessList.get(i).getCustomers());
					}catch(InputMismatchException e) {
                		System.out.println("Please provide valid input");
                	}
					
				}else {
					
				}
			}        
        
		}
		
	}


	public void deleteBusiness() {
		// TODO Auto-generated method stub
		
		System.out.println("Provide business id to be deleted ");
		int id=sc.nextInt();
		System.out.println("Do you want to delete complete Business or Customer (Business/Customer)");
		String ans = sc.nextLine();
		if (ans.equalsIgnoreCase("Business")) {
			businessList.remove(id);
		}else if(ans.equalsIgnoreCase("Customer")) {
			System.out.println("Provide customer id to be deleted ");
			int customerId = sc.nextInt();
			customerUtilities.deleteCustomer(customerId);
		}else {
			System.out.println();
		}
		
	}
    
}