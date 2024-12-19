package exception_handling;

public class UsingThrow {
    public static void main(String[] args) {
        checkAge(20);
        try {
            checkCountry("England");
        } catch (MyException e) {
            throw new RuntimeException(e);
        }
    }
    public static void checkAge(int age){
        if(age<18){
            throw new RuntimeException("You are not an adult");
        }
    }

    public static void checkCountry(String country) throws MyException{
        if(!country.equalsIgnoreCase("usa")){
            throw new MyException("You are not from America");
        }
    }
}
