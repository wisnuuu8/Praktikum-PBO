/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author tuf
 */
// Class untuk merepresentasikan data Pasien
public class Patient {
    private int id; // ID unik untuk pasien
    private String name; // Nama pasien
    private String dateOfBirth; // Tanggal lahir pasien

    // Constructor untuk inisialisasi data pasien
    public Patient(int id, String name, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    // Getter untuk ID pasien
    public int getId() {
        return id;
    }

    // Getter untuk nama pasien
    public String getName() {
        return name;
    }

    // Getter untuk tanggal lahir pasien
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    // Method untuk menampilkan informasi pasien dalam bentuk string
    @Override
    public String toString() {
        return "Patient [ID: " + id + ", Name: " + name + ", Date of Birth: " + dateOfBirth + "]";
    }
}