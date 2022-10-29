package ConditionalStatementsAndBlocks;

import java.util.Scanner;

public class CalculatorWithSCase {
    public static void main(String[] args) {
        //Write a calculator code by using the Switch case
        Scanner scanner = new Scanner(System.in);
        double total;
        System.out.print("Please enter first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Please enter second number: ");
        double secondNumber = scanner.nextDouble();
        System.out.println("Please enter what operation do you want to apply: ");
        int count = "3- Multiplication".length();
        System.out.print("-".repeat(count) + "\n");
        System.out.println("1- Sum\n2- Subtraction\n3- Multiplication\n4- Division");
        System.out.print("Operator: ");
        int operator = scanner.nextInt();

        System.out.println("You've just chosen the "+ (operator==1?"Sum operator":(operator==2?"Subtraction operator":(operator==3?"Multiplication operator":"Division operator")))   );
        System.out.println("-".repeat(count));
        switch (operator) {
            case 1:
                total = firstNumber + secondNumber;
                System.out.println("Result is: " + total);
                break;
            case 2:
                total = firstNumber - secondNumber;
                System.out.println("Result is: " + total);
                break;
            case 3:
                total = firstNumber * secondNumber;
                System.out.println("Result is: " + total);
                break;
            case 4:
                total = firstNumber / secondNumber;
                System.out.println("Result is: " + total);
                break;
            default:
                System.out.println("You have to chose one fo the operator 1,2,3 or 4 to make calculation");
        }
    }
}
