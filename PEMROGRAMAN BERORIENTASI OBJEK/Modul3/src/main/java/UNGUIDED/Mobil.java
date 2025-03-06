/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNGUIDED;

/**
 *
 * @author tuf
 */
public class Mobil {
    private final String brand;
    private final String model;
    private final Transmission transmission;
    private final Engine engine;

    public Mobil(String brand, String model, Transmission transmission, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.transmission = transmission;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car: " + brand + " " + model + "\n" + transmission + "\n" + engine;
    }

}