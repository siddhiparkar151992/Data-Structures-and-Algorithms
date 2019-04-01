package main.java;



public class Vehical implements Movable, Repairable{
	
	String name;
	int id;
	
	public Vehical(String name) {
		this.name=  name;
	}
	public void getName(){
		System.out.println("vehical name"+ name);
	}

}
