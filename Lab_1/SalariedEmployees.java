public class SalariedEmployees extends Employee{

    public SalariedEmployees(String firstName, String lastName, String sSN) {
        super(firstName, lastName, sSN);
    }

    @Override
    public double earnings(double hour, double wage) {
        return hour * wage;
    }

    @Override
    public String toString(double hour, double wage) {
        return (getFirstName() + " " + getLastName() + " earns " + earnings(hour, wage));
    }
    
}
