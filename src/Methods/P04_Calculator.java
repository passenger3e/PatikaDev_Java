package Methods;

import java.util.Scanner;

public class P04_Calculator {
    static Scanner getNumber = new Scanner(System.in);

    public static String GetMenu() {
        String menu;
        return menu = """
                1- Sum Operation.
                2- Subtraction Operation.
                3- Division Operation.
                4- Multiplier Operation.
                5- Calculate Power of.
                6- Calculate Factorial.
                7- Calculate Modulo.
                8- Calculate Area of the rectangle.
                9- calculate Circumference of the rectangle
                0- Exit.
                """;
        //You can use text block instead of merging the lines
    }

    public static String GetOperation(int s, int firstNumber, int secondNumber) {
        String operation = "";
        switch (s) {
            case 1 -> operation = "Sum of " + firstNumber + " and " + secondNumber + " is: ";
            case 2 -> operation = "Subtraction of " + firstNumber + " and " + secondNumber + " is: ";
            case 3 -> operation = "Division of " + firstNumber + " by " + secondNumber + " is: ";
            case 4 -> operation = "Multiplication of " + firstNumber + " and " + secondNumber + " is: ";
            case 5 -> operation = secondNumber + "to the power of " + firstNumber + " is: ";
            case 6 -> operation = "Factorial " + firstNumber + "! is: ";
            case 7 -> operation = firstNumber + " Mod " + secondNumber + " 'mod(" + firstNumber + "," + secondNumber + ")'" + " is: ";
            case 8 -> operation = "Area of the rectangular is: ";
            case 9 -> operation = "Circumference of the rectangular is: ";
            default -> {
            }
        }
        return operation;
    }

    public static void main(String[] args) {
        Scanner getSelection = new Scanner(System.in);
        int select;
        do {
            System.out.print("Please press enter to continue...");
            getNumber.nextLine();
            System.out.println(GetMenu());
            System.out.print("Please select Operation from above: ");
            select = getSelection.nextInt();
            DoOperation(select);

        } while (select != 0);
        getNumber.close();
        getSelection.close();
    }

    public static void DoOperation(int selection) {

        int cnt = 20;
        switch (selection) {
            case 1 -> {
                System.out.println("*".repeat(cnt));
                SumOperation();
            }
            case 2 -> {
                System.out.println("*".repeat(cnt));
                SubtractionOperation();
            }
            case 3 -> {
                System.out.println("*".repeat(cnt));
                DivisionOperation();
            }
            case 4 -> {
                System.out.println("*".repeat(cnt));
                MultiplierOperation();
            }
            case 5 -> {
                System.out.println("*".repeat(cnt));
                PowerOfOperation();
            }
            case 6 -> {
                System.out.println("*".repeat(cnt));
                FactorialOperation();
            }
            case 7 -> {
                System.out.println("*".repeat(cnt));
                ModuloOperation();
            }
            case 8 -> {
                System.out.println("*".repeat(cnt));
                AreaOperation();
            }
            case 9 -> {
                System.out.println("*".repeat(cnt));
                CircumferenceOperation();
            }
            case 0 -> System.out.println("You are Exiting from Calculator...");
            default -> System.out.println("Wrong selection. Select between 0-9");


        }
    }

    public static void SumOperation() {
        int a, b, sum;
        System.out.println("Please enter what numbers you would like to Sum:");
        System.out.print("First Number: ");
        a = getNumber.nextInt();
        System.out.print("Second Number: ");
        b = getNumber.nextInt();
        getNumber.nextLine();
        sum = a + b;
        System.out.println(GetOperation(1, a, b) + sum);
    }

    public static void SubtractionOperation() {
        int a, b;
        System.out.println("Please enter what numbers you would like to Subtract:");
        System.out.print("First Number: ");
        a = getNumber.nextInt();
        System.out.print("Second Number: ");
        b = getNumber.nextInt();
        getNumber.nextLine();
        int subtract = a - b;
        System.out.println(GetOperation(2, a, b) + subtract);

    }

    public static void DivisionOperation() {
        int a, b;
        double divided = 0;
        do {
            System.out.println("Please enter what numbers you would like to Divide:");
            System.out.print("First Number: ");
            a = getNumber.nextInt();
            System.out.print("Second Number: ");
            b = getNumber.nextInt();
            getNumber.nextLine();

            if (b != 0) {
                divided = (double) a / b;
                System.out.println(a + " / " + b);
            } else {
                System.out.println("You can't enter second number as zero");

            }
        } while (b == 0);
        System.out.println(GetOperation(3, a, b) + divided);

    }

    public static void MultiplierOperation() {
        int a, b;
        System.out.println("Please enter what numbers you would like to Multiply:");
        System.out.print("First Number: ");
        a = getNumber.nextInt();
        System.out.print("Second Number: ");
        b = getNumber.nextInt();
        getNumber.nextLine();
        int product = a * b;
        System.out.println(GetOperation(4, a, b) + product);

    }

    public static void PowerOfOperation() {
        int a, b ;
        System.out.println("Please enter what numbers you would like to get Power of:");
        System.out.print("First Number: ");
        a = getNumber.nextInt();
        System.out.print("Second Number: ");
        b = getNumber.nextInt();
        getNumber.nextLine();
        double pow = Math.pow(a, b);
        System.out.println(GetOperation(5, a, b) + pow);

    }

    public static void FactorialOperation() {
        int a, b = 0;
        System.out.println("Please enter what number you would like to get Factorial:");
        System.out.print("Number: ");
        a = getNumber.nextInt();
        getNumber.nextLine();
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;

        }
        System.out.println(GetOperation(6, a, b) + fact);

    }

    public static void ModuloOperation() {
        int a, b;
        System.out.println("Please enter what numbers you would like to get Modulo:");
        System.out.print("First Number: ");
        a = getNumber.nextInt();
        System.out.print("Second Number: ");
        b = getNumber.nextInt();
        getNumber.nextLine();
        int mod = a % b;
        System.out.println(GetOperation(7, a, b) + mod);

    }

    public static void AreaOperation() {
        int a, b;
        System.out.println("Please enter what numbers you would like to Calculate area:");
        System.out.print("Length: ");
        a = getNumber.nextInt();
        System.out.print("Width: ");
        b = getNumber.nextInt();
        getNumber.nextLine();
        double area = ((double) a * b);
        System.out.println(GetOperation(8, a, b) + area);

    }

    public static void CircumferenceOperation() {
        int a, b;
        System.out.println("Please enter what numbers you would like to Calculate the Circumference of the Rectangle:");
        System.out.print("Length: ");
        a = getNumber.nextInt();
        System.out.print("Width: ");
        b = getNumber.nextInt();
        getNumber.nextLine();
        int circum = 2 * a + 2 * b;
        System.out.println(GetOperation(9, a, b) + circum);

    }


}
