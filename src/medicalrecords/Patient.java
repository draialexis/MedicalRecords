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
    /**
     * <em>required</em>
     */
    private final String lastName;
    /**
     * <em>required</em>
     */
    private final String firstName;

    public Patient(String firstName, String lastName) 
            throws IllegalArgumentException {
        //TODO add validation (cannot be empty or null...)
        if(firstName == null || firstName.isBlank() 
                || lastName == null || lastName.isBlank()){
            throw new IllegalArgumentException("!!>> both names need to be registered");
        }
        this.firstName = firstName;
        this.lastName = lastName;
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
