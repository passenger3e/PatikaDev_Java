package Methods;

import java.util.Scanner;
public class P04_ExponentialNumbersRecursive {
    static Scanner getNumber=new Scanner(System.in);
    public static void main(String[] args) {

        int base,powerOf;
        System.out.print("Please enter base number: ");
        base=getNumber.nextInt();
        System.out.print("Please enter the power: ");
        powerOf=getNumber.nextInt();
        System.out.println(GetExponential(base,powerOf));

    }
    public static double GetExponential(int b,int p){

        if(p==0) return 1;
        else return b*GetExponential(b,(p-1));
    }
}
