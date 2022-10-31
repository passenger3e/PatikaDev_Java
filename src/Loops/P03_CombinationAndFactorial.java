package Loops;

import java.util.Scanner;

public class P03_CombinationAndFactorial {
    public static void main(String[] args) {
        /*
        C(n,r) = n! / (r! * (n-r)!)
         */
        Scanner getvalue = new Scanner(System.in);
        System.out.print("Enter a number to calculate the factorial of tha number: ");
        int factorNumber = getvalue.nextInt();
        int factorial = 1;
        for (int i = 1; i <= factorNumber; ++i) {
            factorial *= i;
        }
        System.out.println("Factorial of " + factorNumber + " is " + factorial);
        int numberofElement, selecNumber, nFactorial = 1, rFactorial = 1, nrFactorial = 1, combination;
        System.out.print("Enter number of elements to be computed combination: "); //You can't enter bigger than 12 otherwise factorial will exceed tha integer boundary
        numberofElement = getvalue.nextInt();
        System.out.print("Enter the seleciton number: ");
        selecNumber = getvalue.nextInt();
        for (int i = 1; i <= numberofElement; i++) {
            nFactorial *= i;
            // System.out.println(nFactorial);
        }
        for (int i = 1; i <= selecNumber; i++) {
            rFactorial *= i;
        }
        for (int i = 1; i <= (numberofElement - selecNumber); i++) {
            nrFactorial *= i;
        }
        System.out.println(nFactorial + " " + rFactorial);
        combination = nFactorial / (rFactorial * nrFactorial);
        System.out.println("Combination of " + numberofElement + " elements in " + selecNumber + " selection is: " + combination);

    }
}
