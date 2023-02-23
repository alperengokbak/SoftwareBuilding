import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Employee hourEmployees = new HourEmployees("Alperen", "Gökbak", "123456678910");
        Employee salariedEmployee = new SalariedEmployees("Emine", "Timur", "1232435465786");
        Employee commissiEmployee = new CommissionEmployees("Jack", "Daniels", "554330293");

        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(hourEmployees);
        employeeList.add(salariedEmployee);
        employeeList.add(commissiEmployee);

        for(Employee e : employeeList){
            System.out.println(e.toString(40, 10000));
        }
    }
}
