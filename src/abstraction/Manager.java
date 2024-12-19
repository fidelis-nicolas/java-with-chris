package abstraction;

public class Manager extends Employee implements EmployeeFunctions, ManagerFunctions{

    @Override
    public void duties() {
        System.out.println("Manger duties");
    }

    @Override
    public double calculateSalary() {
        return 0;
    }


    @Override
    public void attendMeetings() {
        System.out.println("Meeting every Friday");
    }

    @Override
    public void supervise() {

    }
}
