package com.src.test;

public class AmusementPark {
	
	public static void main(String[] args) {
		int slash = 350; 
		int ferryWheel = 250;
		int merryGoRound =100;		
		int[] family= {3,12,46,48,62};
		int i;
		int j = 0;
		int  bill;
		int totalSlashBill=0;
		int totalFerryWheelBill=0;
		int totalmerryGoRoundBill=0;
		
		//interested in slash and merry go
		
		String interestedInSlash = "Yes";
		String interestedInFerryWheel="No";
		String interestedInmerryGoRound="Yes";
		
		
		if (interestedInSlash.equalsIgnoreCase("Yes")) {
			//not allowed -> <5 and >60
			
			for (int age : family) {
				if(age<5 || age>60) {
					System.out.println("Family member not allowed for SLASH: "+family[j]);
				}else {
					System.out.println("Allowed family member for SLASH: " +family[j]);					
					totalSlashBill = totalSlashBill + slash;					
				}
				j++;							
			}		
			System.out.println("Total Slash Bill "+totalSlashBill);	
						
		}
		if(interestedInFerryWheel.equalsIgnoreCase("Yes")) {
			//not allowed- >65
			
			for (int age : family) {
				if(age>65) {
					System.out.println("Family member not allowed for Ferry Wheel");
				}else {
					System.out.println("Allowed family member for Ferry Wheel: " +family[j]);					
					totalFerryWheelBill = totalFerryWheelBill + ferryWheel;					
				}
				j++;	
				System.out.println("Total Ferry Wheel Bill "+totalFerryWheelBill );				
			}
			
		}	
		if(interestedInmerryGoRound.equalsIgnoreCase("Yes")) {
					
			
			for (i=1; i<=5; i++) {							
									
				totalmerryGoRoundBill = totalmerryGoRoundBill + merryGoRound;			
										
			}
			System.out.println("Total Merry Go Round Bill "+totalmerryGoRoundBill );	
			
		}		
		
		bill = totalSlashBill + totalFerryWheelBill + totalmerryGoRoundBill;
		System.out.println("Total Amusement park bill : "+bill);
				
	}

}
