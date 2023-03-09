package Lab_3;

public class Manager extends Employee{
    private int numberOfEmployee;
    private double percentage = 0.20;

    public Manager(String name, int age, String gender, String address, double salary, int numberOfEmployee) {
        super(name, age, gender, address, salary);
        this.numberOfEmployee = numberOfEmployee;
    }
    public int getNumberOfEmployee() {
        return numberOfEmployee;
    }
    public void setNumberOfEmployee(int numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }
    public double getPercentage() {
        return percentage;
    }
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double calculateBonus(){
        double newSalary = getSalary() * ((getSalary() * this.percentage) / 100) * this.numberOfEmployee;
        System.out.println("Bonus added salary " + newSalary);
        return newSalary;
    }
}
