package abstraction;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee emp = new BasicEmployee();
        emp.duties();
        Employee emp2 = new Manager();
        emp2.duties();
    }
}
