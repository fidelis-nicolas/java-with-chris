import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
            Numbers
            Integer
            Short - 1 - 3 digits
            Long - 9 digits


            Float - Long decimal points
            Double - Short decimal points


            Char -
            String -

            Boolean
         */
        //Simple calculator.

        System.out.print("Enter the first Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second Number: ");
        int num2 = input.nextInt();

        System.out.println("Enter an operator + - / *");
        String operator = input.next();

        int total = 0;

        switch (operator){
            case "+":
                total = num2+num1;
                System.out.println(total);
                break;
            case "-":
                total = num1 - num2;
                System.out.println(total);
                break;
            default:
                System.out.println("Invalid operator");


        }


    }
}
