package Methods;

import java.util.Scanner;
public class P04_ExponentialNumbersRecursive {
    static Scanner getNumber=new Scanner(System.in);
    public static void main(String[] args) {

        int base,powerOf;
        do {
            System.out.print("Please enter base number: ");
            base = getNumber.nextInt();
            if(base<0) break;
            System.out.print("Please enter the power: ");
            powerOf = getNumber.nextInt();
            System.out.println("Result is: "+GetExponential(base, powerOf));
        }while(true);

    }
    public static double GetExponential(int b,int p){

        if(p==0) return 1;
        else return b*GetExponential(b,(p-1));
    }
}
