package com.astanait.builder;

public class Main {

    public static void main(String[] args) {
        CarDirector director = new CarDirector();
        Car standardGas = director.buildStandardGasCar(new GasCarBuilder());
        Car sportsGas = director.buildSportsGasCar(new GasCarBuilder());
        Car standardElectric = director.buildStandardElectricCar(new ElectricCarBuilder());
        Car luxuryElectric = director.buildLuxuryElectricCar(new ElectricCarBuilder());
        System.out.println(standardGas);
        System.out.println(sportsGas);
        System.out.println(standardElectric);
        System.out.println(luxuryElectric);
        Car customCar = new GasCarBuilder()
                .setBrand("Honda")
                .setModel("Civic")
                .setEngine("1.5L Turbo")
                .setDoors(4)
                .setGps(true)
                .build();
        System.out.println(customCar);
    }
}