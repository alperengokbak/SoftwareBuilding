public class CommissionEmployees extends Employee{
    double percentage = 10;

    public CommissionEmployees(String firstName, String lastName, String sSN) {
        super(firstName, lastName, sSN);
    }

    @Override
    public double earnings(double hour, double wage) {
        return (hour * wage) + ((percentage * wage) / 100);
    }

    @Override
    public String toString(double hour, double wage) {
        return (getFirstName() + " " + getLastName() + " earns " + earnings(hour, wage) + " with " + percentage + " percentage.");
    }
    
}
