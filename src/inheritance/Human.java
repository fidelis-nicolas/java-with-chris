package inheritance;

public class Human {
    private String name;
    private int age;
    private String nationity;

    public Human(int age, String name, String nationity) {
        this.age = age;
        this.name = name;
        this.nationity = nationity;
    }

    public Human(){

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationity() {
        return nationity;
    }

    public void setNationity(String nationity) {
        this.nationity = nationity;
    }
}
