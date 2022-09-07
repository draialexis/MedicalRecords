package medicalrecords;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PatientManager {
    private final List<Patient> patients;

    public PatientManager() {
        this.patients = new ArrayList<>();
    }
    
    /**
     * Get all patients from the list
     * @return an unmodifiable view of the list of all patients
     */
    public List<Patient> getAll(){
        return Collections.unmodifiableList(this.patients);
    }
    
    public void createOne(Patient newPatient){
        this.patients.add(newPatient);
    }
}
