package Question2;

public class Employee {
    String name;
    double salary;

    public Employee(){
        this.name   = "";
        this.salary = 0.0;
    }
    public Employee(String name, double salary){
        this.name   = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
