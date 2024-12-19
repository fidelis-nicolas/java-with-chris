import oopintro.Computer;

public class LaptopApp {
    public static void main(String[] args) {
        Computer gamingPC = new Computer();

        Computer laptop = new Computer("Mac", 4, "Qwerty", 8, true);
        Computer laptop1 = new Computer("HP", 6, "UK", 9, false);
        laptop.setName("Dell");
        System.out.println(laptop1.getName());
//        laptop1.computerInfo();
//        laptop.computerInfo();



        laptop1.playMusic("Burna: Last last");

        int calculate = laptop1.addNumber(45, 90);
        System.out.println(calculate);



    }
}
