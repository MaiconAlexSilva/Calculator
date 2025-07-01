package Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = 0;
        System.out.println("Enter the values for the calculation: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        do {
            System.out.println("What operation do you want  to perform? ");
            System.out.println("1-Addition (+), 2-Subtraction (-), 3-Division (/), 4-Multiplication (*)");
            try {
                option = input.nextInt();
            }catch (InputMismatchException e){
                System.out.println("ERROR: Only numbers one(1) to four(4) are accepted.");
                input.next();
            }
            switch (option){
                case 1:
                    System.out.println("Result: "+(a+b));
                    break;
                case 2:
                    System.out.println("Result: "+(a-b));
                    break;
                case 3:
                    System.out.println("Result: "+(a/b));
                    break;
                case 4:
                    System.out.println("Result: "+(a*b));
                    break;
                default:
                    System.out.println("Choose one of the 4 options provided above!");
            }
        }while (option < 1 || option >= 5);
        System.out.println("Completed");
    }
}
