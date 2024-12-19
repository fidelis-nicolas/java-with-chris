package abstraction;

public abstract class Employee {
    //An abstract have abstract and non-abstract methods
    private String name;
    private int id;
    private String role;

    public abstract void duties();
    public abstract double calculateSalary();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
