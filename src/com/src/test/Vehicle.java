package com.src.test;

public abstract class Vehicle {
	
	String vehicle;
	int model;
	
	public Vehicle(String vehicle, int model) {
		this.vehicle = vehicle;
		this.model = model;
	}
	
	
	public String start() {
		return "Starting Vehicle" +this.vehicle;
	}
	
	public String stop() {
		return "Vehicle Stopped" +this.vehicle;
	}
	
	public void getVehicleDetails() {
		
		if(this.vehicle.equalsIgnoreCase("car")) {
			System.out.println("This is car");
		}else {
			System.out.println("This is Bike");
		}
		
	}
	
	public abstract int move();
	
	public abstract int move(int speed);

}
