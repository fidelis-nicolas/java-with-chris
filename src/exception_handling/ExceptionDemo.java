package exception_handling;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        File file = new File("Demo.txt");


        int a =10;
        int b = 0;
        try {
            file.createNewFile();

            int number = in.nextInt();
            System.out.println("The number is: " + number);
            System.out.println(a / b);
        }

        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }catch (InputMismatchException e){
            System.out.println("You are expected to enter a number");
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
