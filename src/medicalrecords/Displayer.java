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
    private final Scanner in;

    public Displayer() {
        this.patientManager = new PatientManager();
        this.in = new Scanner(System.in);
    }

    public void showMenu(){
        while(true){
            int choice;
            System.out.println("1) to register a patient");
            System.out.println("2) to display all patients");
            choice = in.nextInt();
            //flush?
            switch(choice){
                case(1) -> { 
                    String firstName, lastName;
                    System.out.println("enter FIRST name");
                    firstName = in.nextLine();
                    //flush?
                    System.out.println("enter LAST name");
                    lastName = in.nextLine();
                    //flush?
                    Patient newPatient = new Patient(firstName, lastName);
                    registerPatient(newPatient);
                }
                    
            }
            //...
            // break if user exits, if critical error, etc.
            // in.close()
        }
    }
    
    private void showAllPatients(){
        List<Patient> displayed = this.patientManager.getAll();
        for(Patient patient: displayed){
            System.out.println(patient);
        }
    }
    
    private void registerPatient(Patient newPatient){
        this.patientManager.createOne(newPatient);
    }
    
}
