/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalrecords;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author aldrai
 */
public class Displayer {

    private final PatientManager patientManager;
    private final Scanner scanner;

    public Displayer() {
        this.patientManager = new PatientManager();
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {
        boolean isQuitting = false;
        while (!isQuitting) {
            int choice;
            System.out.println("0........to quit this program");
            System.out.println("1........to register a patient");
            System.out.println("2........to display all patients");
            choice = scanner.nextInt();
            switch (choice) {
                case (1) -> {
                    String firstName, lastName;
                    firstName = requestString("enter FIRST name (no spaces allowed)");
                    lastName = requestString("enter LAST name (no spaces allowed)");
                    if (firstName != null && lastName != null) {
                        Patient newPatient = new Patient(firstName, lastName);
                        registerPatient(newPatient);
                    }
                }
                case (2) -> {
                    showAllPatients();
                }
                case (0) -> {
                    isQuitting = true;
                }
                default -> {
                    System.out.println("you must choose between 1 and 2, or quit with 0");
                }
            }
        }
    }

    private void showAllPatients() {
        List<Patient> displayed = this.patientManager.getAll();
        System.out.println("list of patients:");
        for (Patient patient : displayed) {
            System.out.println(patient);
        }
    }

    private void registerPatient(Patient newPatient) {
        this.patientManager.createOne(newPatient);
    }

    private String requestString(String msg) {
        String input;
        System.out.println(msg);
        input = scanner.next();
        scanner.nextLine();
        return input;
    }
}
