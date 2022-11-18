package Methods;

import java.util.Scanner;

public class P04_PrimeNumberRecursive {
    static int i = 2;

    public static void main(String[] args) {
        Scanner getNumber = new Scanner(System.in);
        int pNumber;
        do {
            System.out.print("Please enter the number: ");
            pNumber = getNumber.nextInt();
            if (pNumber <= 0) break;
            System.out.println(pNumber + " is " + (IsPrime(pNumber) ? "a prime number." : " not a prime number."));
            i = 2;
        } while (true);
    }

    public static boolean IsPrime(int a) {
        if (a == 1 || a == 2 || a == 3) return true; //if the numbers are 1,2 or 3 it returns true
        if (a % i == 0) { //by increasing i checking every steps if it finds a divider or not
            return false;
        }
        i++;
        if (i < a) {
            return IsPrime(a); //until reaching to the number 'a' this calls the method very time if previous number i is not a divider
        } else {
            return true; // until 'a' if there is no divider methods returns this true
        }
    }
}
