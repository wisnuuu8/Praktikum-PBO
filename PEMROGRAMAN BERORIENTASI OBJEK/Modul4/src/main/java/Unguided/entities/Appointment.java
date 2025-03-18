/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author tuf
 */
// Class untuk merepresentasikan data Janji Temu
public class Appointment {
    private int id; // ID unik untuk janji temu
    private Doctor doctor; // Dokter yang terkait dengan janji temu
    private Patient patient; // Pasien yang terkait dengan janji temu
    private String dateTime; // Tanggal dan waktu janji temu

    // Constructor untuk inisialisasi data janji temu
    public Appointment(int id, Doctor doctor, Patient patient, String dateTime) {
        this.id = id;
        this.doctor = doctor;
        this.patient = patient;
        this.dateTime = dateTime;
    }

    // Method untuk menampilkan informasi janji temu dalam bentuk string
    @Override
    public String toString() {
        return "Appointment [ID: " + id + ", Doctor: " + doctor.getName() + ", Patient: " + patient.getName() + ", Date/Time: " + dateTime + "]";
    }
}