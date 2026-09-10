package com.astanait.builder;
public final class Car {
    private final String brand;
    private final String model;
    private final String engine;
    private final String wheels;
    private final String color;
    private final boolean hasGps;
    private final int numberOfDoors;
    Car(String brand, String model, String engine, String wheels,
        String color, boolean hasGps, int numberOfDoors) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.wheels = wheels;
        this.color = color;
        this.hasGps = hasGps;
        this.numberOfDoors = numberOfDoors;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getEngine() {
        return engine;
    }
    public String getWheels() {
        return wheels;
    }
    public String getColor() {
        return color;
    }
    public boolean hasGps() {
        return hasGps;
    }
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    @Override
    public String toString() {
        return brand + " " + model + " [engine=" + engine + ", doors=" + numberOfDoors + ", gps=" + hasGps + "]";
    }
}