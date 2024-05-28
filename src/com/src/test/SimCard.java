package com.src.test;

public class SimCard extends NetworkCarrier{
	
	static double simNumber= 908765412;
	String simType="Vodaphone";
	//private String simNumebr;
	
	
	public double getSimNumber(double simNumber){
		
		return simNumber;
		
	}
	
	public String getSimType(){
		if(this.simType(equalsIgnoreCase("Vodafone"))) {
			return "This is Vodafone SIM";
		}else {
			return "This is Airtel SIM";
		}
		
	}
	
	
	private boolean simType(Object equalsIgnoreCase) {
		// TODO Auto-generated method stub
		return false;
	}

	private Object equalsIgnoreCase(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		
		SimCard simcard = new SimCard();
		
			double scard = simcard.getSimNumber(simNumber);
			System.out.println("Sim Number is "+scard);			
			
			System.out.println(""+simcard.getSimType());
			
			simcard.registerSim = "Yes";
			simcard.networkBand = "VI";
			simcard.call="Outgoing";
			
			
			System.out.println(simcard.registerSim());
			
			System.out.println(simcard.getNetworkBand() );
			
			System.out.println(simcard.makeCall());
			
			
			
		
		
		
	}
}
