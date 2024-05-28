package com.src.test;

public class CustomerTransaction {
	public static void main (String[] args) {
		
		String[] customers = {"Sid", "Bhabani", "Vishal"};
		
		int[][] transaction = { {100, 200, 400}, {130}, {150, 160, 170, 900} };
		
		int total=0;
		
		for (String c : customers) {
				
			for (int i=0; i<transaction.length; i++) {
				for (int j=0; j<transaction[i].length; j++) {
				
					total = total + transaction[i][j];
									
				}
				
				System.out.println("Total expenditure of "+customers[i]+" is "+total);
				total =0;
			}
			break;
			
		}
		
		System.out.println("################################");
		System.out.println("OR");
		System.out.println("Other Way");
		System.out.println("################################");
		
		for (int k=0; k<customers.length; k++) {
			for (int l=0; l<transaction.length; l++) {
				for (int m=0; m<transaction[l].length; m++) {
					total = total + transaction[l][m];
				}
				System.out.println("Total expenditure of "+customers[k]+" is "+total);
				total =0;
				k++;
			}
		}
		
		
		
	}

}
