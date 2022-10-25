package Question2;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee("Hasitha Welikannage",2000.0);

        System.out.println("\nEmployee 1 : \n"+"Name : "+e1.getName()+"\nSalary : "+e1.getSalary());
        System.out.println("\nEmployee 2 : \n"+"Name : "+e2.getName()+"\nSalary : "+e2.getSalary());
    }
}
