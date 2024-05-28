package com.src.test;

public class Run {
	
	public static void main(String[] args) {
		
	
		Car car = new Car("car", 43,21);
		
		
		//System.out.println(car.changeGear(0));
		
		//System.out.println(car.move(21));
		
		System.out.println(car.changeGear(car.move(9)));
		
		
		
	
		
	}

}
