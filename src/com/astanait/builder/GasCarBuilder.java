package com.astanait.builder;

public class GasCarBuilder implements CarBuilder {

    private String brand;
    private String model;
    private String engine;
    private String wheels;
    private String color;
    private boolean hasGps;
    private int numberOfDoors;
    public GasCarBuilder() {
        this.engine = "2.0L Gasoline Engine";
        this.wheels = "16-inch Steel";
        this.color = "White";
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
        this.hasGps = hasGps;
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
        if (model == null || model.isBlank()) {
            throw new IllegalStateException("Model must be set before build().");
        }
        return new Car(brand, model, engine, wheels, color, hasGps, numberOfDoors);
    }
}