/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package GUIDED;

import java.util.Scanner;

/**
 *
 * @author tuf
 */
public class Main {

    public static void main(String[] args) {
        // Declate the variable
        int a,b,c;
        // Create Scanner object
        Scanner input = new Scanner (System.in);
        // input integer
        System.out.print("Hasil inputan a: ");
        // Read the next integer from the screen 
        a = input.nextInt();
        System.out.print("Hasil inputan b: ");
        // Read the next integer from the screen
        b = input.nextInt();
        // perhitungan sederhana
        c=a+b;
        // Display the integer
        System.out.println("Hasil inputan a: "+a+"Hasil inputan b: "+b);
        System.out.println("Hasil jumlah a+b: "+c);
            
    }
}
