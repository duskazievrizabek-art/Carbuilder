package com.astanait.builder;

public interface CarBuilder {

    CarBuilder setBrand(String brand);
    CarBuilder setModel(String model);
    CarBuilder setEngine(String engine);
    CarBuilder setWheels(String wheels);
    CarBuilder setColor(String color);
    CarBuilder setGps(boolean hasGps);
    CarBuilder setDoors(int numberOfDoors);

    Car build();
}