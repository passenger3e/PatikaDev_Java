import java.util.Scanner;

public class GreatestCDLeastCM {
    public static void main(String[] args) {
        Scanner getNumber = new Scanner(System.in);


        int num1, num2, dnum1 = 1, dnum2 = 1, greatestCD = 1, leastCM = 1;
        System.out.print("Enter first number: ");
        num1 = getNumber.nextInt();
        System.out.print("Enter second number: ");
        num2 = getNumber.nextInt();
        if (num1 < num2) {
            dnum1 = num1;
            dnum2 = num2;
        } else if (num1 > num2) {
            dnum1 = num2;
            dnum2 = num1;
        }else{
            dnum1=num1;
            dnum2=num2;
        }
        int k = 2,l=0;
        while (k <=dnum1) {
            while (num1 % k == 0 || num2 % k == 0) {
                if (num1 % k == 0 && num2 % k == 0) greatestCD *= k;
                leastCM *= k;
                if (num1 % k == 0) num1 /= k;

                if (num2 % k == 0) num2 /= k;
                l++;
            }
            if (k == 2) k++;
            else k += 2;
           // k++;
        }
        System.out.println("Greatest Common divisor: " + greatestCD);
        System.out.println("Least Common Multiple: " + leastCM * num2 * num1);
    }
}
