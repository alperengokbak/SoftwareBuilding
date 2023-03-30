package Lab_5;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
// Alperen Gökbak-21070006205
public class EmployeeReader {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        String line;
        int index = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader("Lab_5/employee-data.txt"))) {
            while ((line = br.readLine()) != null) {
                if (index >= 10) {
                    throw new ArrayIndexOutOfBoundsException("Index Out Of Bounds!!");
                }
    
                String[] parts = line.split(",");
    
                if (parts.length != 4) {
                    throw new IllegalArgumentException("Line does not contain four parts");
                }
                String firstName = parts[0].trim();
                String lastName = parts[1].trim();
    
                if (firstName.matches(",,54") || lastName.matches(",,54")) {
                    throw new IllegalArgumentException("First name and last name cannot contain numbers");
                }
    
                int age = Integer.parseInt(parts[2].trim());
                double salary = Double.parseDouble(parts[3].trim());
                
                if (age < 0|| salary < 0) {
                    throw new InputMismatchException("Age and salary cannot be negative");
                }
                Employee employee = new Employee(firstName, lastName, age, salary);
                employees[index] = employee;
                index++;
            }
        } catch(IOException e) {
            e.getMessage();
        } catch(NumberFormatException e) {
            System.out.println((index+1) + ". employee's " + e.getMessage());
        } catch(IllegalArgumentException e){
            System.out.println((index+1) + ". employee's " + e.getMessage());
        } catch(InputMismatchException e) {
            System.out.println((index+1) + ". employee's " + e.getMessage());
        } catch(ArrayIndexOutOfBoundsException  e){
            System.out.println((index+1) + ". employee's " + e.getMessage());
        }
        
        for (Employee employee : employees) {
            if(employee != null){
                System.out.println(employee.getFirstName() + " " + employee.getLastName() + " " + employee.getAge() + " " + employee.getSalary());
            }
        }
    }
}
