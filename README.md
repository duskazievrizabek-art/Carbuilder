# Car Builder Pattern - Assignment #1

## About the Project
This repository contains the implementation of the **Builder creational design pattern** in Java. It is developed for Assignment #1 of the Software Design Patterns course.

### What the Product Is
The product being constructed is a `Car`. A car is a complex object with multiple properties such as brand, model, engine type, wheels, color, GPS availability, and the number of doors.
The Builder pattern is used to encapsulate the complex construction logic and state validations outside of the `Car` class itself.

### How to Build Each Representation
The construction process uses a step-by-step approach with method chaining (a fluent API).
* **Builder Interface (`CarBuilder`):** Declares all the common construction steps (`setBrand`, `setEngine`, etc.) and the final `build()` method.
* **Concrete Builders:** 
  * `GasCarBuilder`: Builds traditional gasoline cars with specific default values (e.g., 2.0L Gasoline Engine, 16-inch Steel wheels).
  * `ElectricCarBuilder`: Builds electric cars with its own defaults (e.g., Electric Motor, mandatory GPS).
  * Both builders include state validation inside the `build()` method (e.g., checking for blank brands or ensuring electric cars actually contain "Electric" in their engine description).
* **Director (`CarDirector`):** Orchestrates the builder steps to quickly create predefined, reusable car configurations: `StandardGasCar`, `SportsGasCar`, `StandardElectricCar`, and `LuxuryElectricCar`.
