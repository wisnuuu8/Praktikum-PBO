/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author tuf
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Class utama untuk mengelola sistem manajemen rumah sakit
public class HospitalManagementSystem {
    private List<Doctor> doctors; // List untuk menyimpan data dokter
    private List<Patient> patients; // List untuk menyimpan data pasien
    private List<Appointment> appointments; // List untuk menyimpan data janji temu
    private List<Diagnosis> diagnoses; // List untuk menyimpan data diagnosis

    // Constructor untuk inisialisasi list
    public HospitalManagementSystem() {
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
        appointments = new ArrayList<>();
        diagnoses = new ArrayList<>();
    }

    // Method untuk menambahkan dokter ke dalam list
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Method untuk menambahkan pasien ke dalam list
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Method untuk menambahkan janji temu ke dalam list
    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    // Method untuk menambahkan diagnosis ke dalam list
    public void addDiagnosis(Diagnosis diagnosis) {
        diagnoses.add(diagnosis);
    }

    // Method untuk menampilkan semua dokter
    public void displayDoctors() {
        System.out.println("List of Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }
    }

    // Method untuk menampilkan semua pasien
    public void displayPatients() {
        System.out.println("List of Patients:");
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

    // Method untuk menampilkan semua janji temu
    public void displayAppointments() {
        System.out.println("List of Appointments:");
        for (Appointment appointment : appointments) {
            System.out.println(appointment);
        }
    }

    // Method untuk menampilkan semua diagnosis
    public void displayDiagnoses() {
        System.out.println("List of Diagnoses:");
        for (Diagnosis diagnosis : diagnoses) {
            System.out.println(diagnosis);
        }
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        HospitalManagementSystem system = new HospitalManagementSystem();
        Scanner scanner = new Scanner(System.in);

        // Contoh data dummy
        Doctor doctor1 = new Doctor(1, "Dr. Wisnu", "Cardiologist");
        Doctor doctor2 = new Doctor(2, "Dr. Boyke", "Neurologist");
        system.addDoctor(doctor1);
        system.addDoctor(doctor2);

        Patient patient1 = new Patient(1, "Frengki", "2006-02-28");
        Patient patient2 = new Patient(2, "Elsha", "2004-08-24");
        system.addPatient(patient1);
        system.addPatient(patient2);

        Appointment appointment1 = new Appointment(1, doctor1, patient1, "2025-03-18 10:00");
        system.addAppointment(appointment1);

        Diagnosis diagnosis1 = new Diagnosis(1, patient1, doctor1, "High blood pressure");
        system.addDiagnosis(diagnosis1);

        // Menampilkan data
        system.displayDoctors();
        system.displayPatients();
        system.displayAppointments();
        system.displayDiagnoses();

        scanner.close();
    }
}
