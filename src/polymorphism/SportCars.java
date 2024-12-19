package polymorphism;

public class SportCars extends Car{
    @Override
    public void brake(String name){
        System.out.println("Braking soft..");
    }
}
