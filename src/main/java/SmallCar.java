package main.java;

public class SmallCar extends Car{
	int size;
	public SmallCar(String name) {
		super("super car");
//		this.name=  name;
	}
	public void getName(){
		System.out.println("small car model"+ model);
	}
}
