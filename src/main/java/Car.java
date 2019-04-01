package main.java;

public class Car extends Vehical{
	String model;
	
	public Car(String name) {
		super("super vehical car");
		this.name=  name;
	}
	public void getName(){
		System.out.println("car model"+ model);
	}
}
