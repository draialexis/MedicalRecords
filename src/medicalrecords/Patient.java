/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalrecords;

/**
 *
 * @author aldrai
 */
public class Patient {
    private String lastName;
    private String firstName;

    public Patient(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    
    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}
