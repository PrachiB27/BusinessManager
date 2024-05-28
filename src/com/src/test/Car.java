package com.src.test;

public class Car extends Vehicle{
	
	int speed;

	public Car(String vehicle, int model, int speed) {
		super(vehicle, model);
		this.speed =speed;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int move() {
		// TODO Auto-generated method stub
		
		return 2;
		
	}

	@Override
	public int move(int speed) {
		// TODO Auto-generated method stub
		
		if (super.vehicle.equalsIgnoreCase("car") && (this.speed >0 && this.speed <11)) {
			return 1;
		}else if (super.vehicle.equalsIgnoreCase("car") && (this.speed >10 && this.speed <21)) {
			return 2;
		}else if (super.vehicle.equalsIgnoreCase("car") && (this.speed >20 && this.speed <31)) {
			return 3;
		}else if (super.vehicle.equalsIgnoreCase("car") && (this.speed >30 && this.speed <41)) {
			return 4;
		}else if (super.vehicle.equalsIgnoreCase("car") && (this.speed >40 && this.speed <51)) {
			return 5;
		}else {
			return 2;
		}			
		
		
	}
	
	//public abstract void move();

	
	public int changeGear(int speed) {
		
		System.out.println(this.speed);
		System.out.println(speed);
		
		if (this.move(this.speed) == 1) {
			return 1;
		} else if (this.move(this.speed) == 2) {
			return 2;
		}else {
			return 2;
		}
		
	}
	
}
