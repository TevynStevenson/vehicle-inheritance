package com.pluralsight;

public class VehicleApp extends Vehicle{
    public static void main(String[] args) {

        //Make new moped
        Moped slowRide = new Moped();
        slowRide.setYear(2026);
        slowRide.setMake("Honda");
        slowRide.setModel("Moped");
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(100);

        Hovercraft hovercraft = new Hovercraft();
        hovercraft.setYear(2026);
        hovercraft.setMake("Honda");
        hovercraft.setModel("Hovercraft");
        hovercraft.setColor("Black");
        hovercraft.setFuelCapacity(20000);

        SemiTruck semiTruck = new SemiTruck();
        semiTruck.setYear(2026);
        semiTruck.setMake("Honda");
        semiTruck.setModel("Semitruck");
        semiTruck.setColor("Black and Red");
        semiTruck.setFuelCapacity(10000);

        Car car = new Car();
        car.setYear(2026);
        car.setMake("Honda");
        car.setModel("Car");
        car.setColor("White");
        car.setFuelCapacity(50);

        System.out.println(hovercraft.getStatus());
        System.out.println(car.getStatus());
        System.out.println(slowRide.getStatus());
        System.out.println(semiTruck.getStatus());

    }
}
