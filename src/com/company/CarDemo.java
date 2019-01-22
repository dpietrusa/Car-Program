package com.company;

public class CarDemo {

    public static void main(String[] args) {
	// write your code here
        Car myCar = new Car();

        myCar.setYear(2003);
        myCar.setMake("Honda");
        myCar.setColor("Grey");

        System.out.println("My car is a " + myCar.getColor() + " " + myCar.getYear() + " " + myCar.getMake() + "!");
    }
}
