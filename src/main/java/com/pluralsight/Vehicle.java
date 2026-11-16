package com.pluralsight;

public class Vehicle {

    //Add variable shared by all classes
    private String color;
    private int numberOfPassengers;
    private int cargoCapacity;
    private int fuelCapacity;
    private int year;
    private String make;
    private String model;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        if (cargoCapacity >= 0) {
            this.cargoCapacity = cargoCapacity;
        }

    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        if (fuelCapacity >= 0) {
            this.fuelCapacity = fuelCapacity;
        }

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStatus(){
        return String.format("This Vehicle is a %d, %s, %s, with a fuel capacity of %d", getYear(), getMake(), getModel(), getFuelCapacity());
    }
}
