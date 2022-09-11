package medicalrecords;

import java.util.List;
import java.util.Scanner;

public class CLI {

    private final PatientManager patientManager;
    private final Scanner scanner;

    public CLI() {
        this.patientManager = new PatientManager();
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {
        boolean isQuitting = false;
        while (!isQuitting) {
            System.out.println("0........to quit this program");
            System.out.println("1........to register a patient");
            System.out.println("2........to display all patients");
            switch (scanner.nextLine()) {
                case ("1") -> {
                    String firstName, lastName;
                    firstName = requestLine("enter FIRST name");
                    lastName = requestLine("enter LAST name");
                    if (firstName != null && lastName != null) {
                        Patient newPatient = new Patient(firstName, lastName);
                        registerPatient(newPatient);
                    }
                }
                case ("2") -> {
                    showAllPatients();
                }
                case ("0") -> {
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
        this.patientManager.addOne(newPatient);
    }

    private String requestLine(String msg) {
        String input;
        System.out.println(msg);
        input = scanner.nextLine();
        return input;
    }
}
