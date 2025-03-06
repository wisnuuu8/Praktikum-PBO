/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNGUIDED;

/**
 *
 * @author tuf
 */
public class Transmission {
    private final String type;
    private final int gears;

    public Transmission(String type, int gears) {
        this.type = type;
        this.gears = gears;
    }

    @Override
    public String toString() {
        return "Transmission: " + type + ", " + gears + " gears";
    }
}
    