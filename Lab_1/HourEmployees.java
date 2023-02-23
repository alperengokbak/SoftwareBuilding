public class HourEmployees extends Employee{

    public HourEmployees(String firstName, String lastName, String sSN) {
        super(firstName, lastName, sSN);
    }

    @Override
    public double earnings(double hour, double wage) {
        if (hour < 168){
            if (hour <= 40){
                return wage * hour;
            }
            else{
                return ((hour - 40) * wage * 1.5) + (hour * wage);
            }
        } else{
            return wage;
        }
    }

    @Override
    public String toString(double hour, double wage) {
        return (getFirstName() + " " + getLastName() + " is working " + hour + " hours and his salary is " + earnings(hour, wage));
    }
    
}
