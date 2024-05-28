package BusinessManager;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AddressUtilities {
	

	 Scanner sc = new Scanner(System.in);
	
	 List<Address> addressList = null;

	public List<Address> createAddress(int addressCount) throws InputMismatchException{
		// TODO Auto-generated method stub
		addressList = new ArrayList<>();
		for(int j=0; j<addressCount; j++) {
			Address address = new Address();
			address.setId(j+1);
    		System.out.println("Provide "+(j+1)+" address details");   
			System.out.println("Please enter your locality :");
			address.setLocality(sc.nextLine());
			System.out.println("Please enter street :");
			address.setStreet(sc.nextLine());
			System.out.println("Please enter city :");
			address.setCity(sc.nextLine());
			System.out.println("Please enter state :");
			address.setState(sc.nextLine());
			addressList.add(address);
		}			
			
		return addressList;		
		
	}

	
	public void updateAddress(List<Address> list) throws InputMismatchException{
		// TODO Auto-generated method stub
		
		for (int i=0; i<list.size(); i++) {
			
			Address addresstoUpdtae = list.get(i);
			  
			System.out.println("Please enter updated locality :");
			addresstoUpdtae.setLocality(sc.nextLine());
			System.out.println("Please enter updated street :");
			addresstoUpdtae.setStreet(sc.nextLine());
			System.out.println("Please enter updated city :");
			addresstoUpdtae.setCity(sc.nextLine());
			System.out.println("Please enter updated state :");
			addresstoUpdtae.setState(sc.nextLine());
			//addressList.add(address);
			
		}
		
	}

}
