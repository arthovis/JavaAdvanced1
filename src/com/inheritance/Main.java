package com.inheritance;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(130,false);
        Vehicle myCarVehicle = new Car(210,true);

        Vehicle vehicle = new Vehicle(85);
        System.out.println(vehicle);

        System.out.println(myCar);
        System.out.println(myCarVehicle);
    }
}
