package abstraction;

public class BasicEmployee extends Employee implements EmployeeFunctions{
    @Override
    public void duties() {
        System.out.println("Basic duties");
    }

    @Override
    public double calculateSalary() {
        return 0;
    }


    @Override
    public void attendMeetings() {
        System.out.println("Meeting every Monday");
    }
}
