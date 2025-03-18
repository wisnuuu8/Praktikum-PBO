/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author tuf
 */
// Class untuk merepresentasikan data Diagnosis
public class Diagnosis {
    private int id; // ID unik untuk diagnosis
    private Patient patient; // Pasien yang terkait dengan diagnosis
    private Doctor doctor; // Dokter yang membuat diagnosis
    private String diagnosis; // Deskripsi diagnosis

    // Constructor untuk inisialisasi data diagnosis
    public Diagnosis(int id, Patient patient, Doctor doctor, String diagnosis) {
        this.id = id;
        this.patient = patient;
        this.doctor = doctor;
        this.diagnosis = diagnosis;
    }

    // Method untuk menampilkan informasi diagnosis dalam bentuk string
    @Override
    public String toString() {
        return "Diagnosis [ID: " + id + ", Patient: " + patient.getName() + ", Doctor: " + doctor.getName() + ", Diagnosis: " + diagnosis + "]";
    }
}
