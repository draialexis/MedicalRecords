/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalrecords;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author aldrai
 */
public class PatientManager {
    private final List<Patient> patients;

    public PatientManager() {
        this.patients = new LinkedList<>();
    }
    
    
    
    public List<Patient> getAll(){
        //TODO make it readonly
        return this.patients;
    }
    
    public void CreateOne(Patient newPatient){
        this.patients.add(newPatient);
    }
}
