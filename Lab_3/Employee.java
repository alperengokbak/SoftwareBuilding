package Lab_3;
import java.io.FileWriter;
import java.io.IOException;


public class Employee extends Person{
    private double salary;
    private double percentage = 0.10;
    
    public Employee(String name, int age, String gender, String address, double salary) {
        super(name, age, gender, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public double calculateBonus(){
        double newSalary = this.salary * ((this.salary * this.percentage) / 100);
        return newSalary;
    }
    public void calculateBonusInFile(){

        try {
            FileWriter myWriter = new FileWriter("BonusFile.txt");
            myWriter.write(Double.toString(calculateBonus()));
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }
        catch (IOException e) {
            System.out.println("Error!");
            e.printStackTrace();
        }
    }
    public void calculateSomething(double percentage){
        if (percentage > 0 && getAge() > 40){
            System.out.println(this.salary += (this.salary * percentage) / 100);
        }
    }
    public double calculateCreditAmount(double salary){
        return salary *= 3.5;
    }
    public double getYearlySalary(){
        return this.salary * 12;
    }
    
}
