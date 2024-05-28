package com.src.test;

public class NetworkCarrier {

	String registerSim;
	String networkBand;
	String call;
	
	public String registerSim(){
		
		if(this.registerSim.equalsIgnoreCase("Yes")){
			return"Sim is registered";
		}else {
			return "Not registered Sim";
		}
				
	}
	
	public String getNetworkBand() {
		
		return networkBand; 
		
	}
	
	public String makeCall() {
		
		return call;
		
	}
	
	
}
