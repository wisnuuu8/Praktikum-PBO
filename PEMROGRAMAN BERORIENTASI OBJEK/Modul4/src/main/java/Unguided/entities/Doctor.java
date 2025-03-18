/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author tuf
 */
// Class untuk merepresentasikan data Dokter
public class Doctor {
    private int id; // ID unik untuk dokter
    private String name; // Nama dokter
    private String specialization; // Spesialisasi dokter

    // Constructor untuk inisialisasi data dokter
    public Doctor(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    // Getter untuk ID dokter
    public int getId() {
        return id;
    }

    // Getter untuk nama dokter
    public String getName() {
        return name;
    }

    // Getter untuk spesialisasi dokter
    public String getSpecialization() {
        return specialization;
    }

    // Method untuk menampilkan informasi dokter dalam bentuk string
    @Override
    public String toString() {
        return "Doctor [ID: " + id + ", Name: " + name + ", Specialization: " + specialization + "]";
    }
}
