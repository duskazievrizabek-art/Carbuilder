package com.astanait.builder;

public class CarDirector {

    public Car buildStandardGasCar(CarBuilder builder) {
        return builder
                .setBrand("Toyota")
                .setModel("Corolla")
                .setEngine("1.6L Gasoline Engine")
                .setWheels("16-inch Steel")
                .setColor("White")
                .setDoors(4)
                .setGps(false)
                .build();
    }
    public Car buildSportsGasCar(CarBuilder builder) {
        return builder
                .setBrand("Ford")
                .setModel("Mustang GT")
                .setEngine("5.0L V8 Gasoline Engine")
                .setWheels("19-inch Alloy")
                .setColor("Red")
                .setDoors(2)
                .setGps(true)
                .build();
    }
    public Car buildStandardElectricCar(CarBuilder builder) {
        return builder
                .setBrand("Nissan")
                .setModel("Leaf")
                .setEngine("Electric Motor 110kW")
                .setWheels("17-inch Alloy")
                .setColor("Blue")
                .setDoors(4)
                .build();
    }
    public Car buildLuxuryElectricCar(CarBuilder builder) {
        return builder
                .setBrand("Tesla")
                .setModel("Model S")
                .setEngine("Dual Electric Motor 350kW")
                .setWheels("21-inch Alloy")
                .setColor("Black")
                .setDoors(4)
                .build();
    }
}