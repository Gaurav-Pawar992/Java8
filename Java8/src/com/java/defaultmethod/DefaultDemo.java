package com.java.defaultmethod;

interface Vehicle{
	
	String getBrand();
	
	String speedUp();
	
	String slowDown();
	
	default String turnAlarmOn() {
		return "Turning Vehicle Alarm On";
	}
	
	default String turnAlarmOff() {
		return "Turning Vehicle Alarm Off";
	}
}

class Car implements Vehicle{

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return "BMW";
	}

	@Override
	public String speedUp() {
		// TODO Auto-generated method stub
		return "The car is speeding up";
	}

	@Override
	public String slowDown() {
		// TODO Auto-generated method stub
		return "The car is slowing down";
	}
	
}

public class DefaultDemo {
	
	public static void main(String[] args) {
		
		Vehicle vehicle = new Car();
		
		System.out.println(vehicle.getBrand());
		System.out.println(vehicle.speedUp());
		System.out.println(vehicle.slowDown());
		
		System.out.println(vehicle.turnAlarmOn());
		System.out.println(vehicle.turnAlarmOff());
		
	}

}
