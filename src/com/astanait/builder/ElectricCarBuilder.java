package com.astanait.builder;

public class ElectricCarBuilder implements CarBuilder {

    private String brand;
    private String model;
    private String engine;
    private String wheels;
    private String color;
    private boolean hasGps;
    private int numberOfDoors;
    public ElectricCarBuilder() {
        this.engine = "Electric Motor";
        this.wheels = "18-inch Alloy";
        this.color = "Silver";
        this.hasGps = true;
        this.numberOfDoors = 4;
    }
    @Override
    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }
    @Override
    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }
    @Override
    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    @Override
    public CarBuilder setWheels(String wheels) {
        this.wheels = wheels;
        return this;
    }
    @Override
    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }
    @Override
    public CarBuilder setGps(boolean hasGps) {
        this.hasGps = true; // электромобили всегда с GPS
        return this;
    }
    @Override
    public CarBuilder setDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }
    @Override
    public Car build() {
        if (brand == null || brand.isBlank()) {
            throw new IllegalStateException("Brand must be set before build().");
        }
        if (engine == null || !engine.contains("Electric")) {
            throw new IllegalStateException("Electric car engine must mention 'Electric'.");
        }
        return new Car(brand, model, engine, wheels, color, hasGps, numberOfDoors);
    }
}