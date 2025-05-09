package com.elc.exa;

public class CarDetails {

	public static void main(String[] args) {
		Car car = new Car();
		car.setCarDetails("Swift", "Maruti",600000.0);
		String res = car.getCarDetails();
		System.out.println(res);

	}

}
