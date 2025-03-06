/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNGUIDED;

/**
 *
 * @author tuf
 */
public class Main {
    public static void main(String[] args) {
        Transmission transmission = new Transmission("Automatic", 6);
        Engine engine = new Engine(250, "Gasoline");
        Mobil car = new Mobil("Toyota", "Supra", transmission, engine);

        System.out.println(car);
    }
}
