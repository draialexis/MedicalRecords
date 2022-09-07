package medicalrecords;

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
