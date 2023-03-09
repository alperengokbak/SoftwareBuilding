package Lab_3;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alperen", 23, "Male", "Izmir");
        Employee employee = new Employee("Emine", 23, "Female", "Izmir", 44500.444);
        Manager manager = new Manager("Angela", 45, "Female", "New York City", 50000, 40);

        System.out.println(person.getGender()); // Get the gender.
        System.out.println(employee.getName() + " has " + employee.getSalary() + " of amount.");
        
        employee.setSalary(49299.999); // Set the salary.
        System.out.println(employee.getName() + "'s new salary: " + employee.getSalary());

        employee.setAge(41); // Set the age.
        System.out.println(employee.getName() + " is " + employee.getAge() + " years old.");

        employee.calculateBonus(); // Displaying predetermined bonus salary .
        employee.calculateBonusInFile();
        employee.calculateSomething(13.20); // Adding defined bonus salary.

        System.out.println(employee.calculateCreditAmount(employee.getSalary())); // Calculate credit amount, does not affect amount of real salary.

        System.out.println(employee.getYearlySalary()); // Displaying total salary for the whole year. (salary* 12)

        manager.calculateBonus();
        
        System.out.println(manager.getNumberOfEmployee());

    }
}
