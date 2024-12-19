package polymorphism;

public class Car {
    private String name;
    private int year;

    public void brake(String name){
        System.out.println("Braking hard....");
    }

    public void accelerate(){
        System.out.println("Accelerating");
    }
    public void accelerate(int speed){
        System.out.println("Accelerating");
        speed++;
    }
    public void accelerate(String speed){
        System.out.println("Accelerating");
    }
    public void accelerate(int speed, double turbo){
        System.out.println("Accelerating");
        speed++;
    }
    public void accelerate( double turbo, int speed){
        System.out.println("Accelerating");
        speed++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
