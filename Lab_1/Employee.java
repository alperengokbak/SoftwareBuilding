
public abstract class Employee {
    private String firstName;
    private String lastName;
    private String SSN;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String sSN) {
        SSN = sSN;
    }

    public Employee(String firstName, String lastName, String sSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = sSN;
    }
    

    public abstract double earnings(double hour, double wage);
    public abstract String toString(double hour, double wage);
}