package inheritance;

public class HumanApp {
    public static void main(String[] args) {
        Human americans = new Americans(10, "Fidelis", "USA", "American");

        NothernAmerican northAmericans = (NothernAmerican) new Americans(10, "Chris", "USA", "Boston Ascent");

        System.out.println(americans instanceof Human);
        System.out.println(americans.getName());
    }
}
