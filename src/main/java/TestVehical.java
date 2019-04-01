package main.java;

public class TestVehical {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehical v = new SmallCar("car1");
		System.out.println(v.name);
		v= (Car) v;
		System.out.println(v.name);
		v.getName();
	}

}
