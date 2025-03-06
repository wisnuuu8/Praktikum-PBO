/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIDED;

/**
 *
 * @author tuf
 */
public class PhoneAction {
    
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.brand = "Nokia";
        phone1.yearRelease = 2001;
        Phone phone2 = new Phone();
        phone2.brand = "Apple";
        phone2.yearRelease = 2005;
        
        System.out.println("Phone 2 Branda " + phone1.brand);
        System.out.println("Phone 2 Branda " + phone1.yearRelease);
        System.out.println("Phone 1 Branda " + phone2.brand);
        System.out.println("Phone 2 Branda " + phone2.yearRelease);

    }
    
}
