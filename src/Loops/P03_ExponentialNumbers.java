package Loops;

import java.util.Scanner;

public class P03_ExponentialNumbers {
    public static void main(String[] args) {
        Scanner getNumber=new Scanner(System.in);
        int number,exponent,exponential=1;
        System.out.print("Please enter the number to calculate exponential of: ");
        number=getNumber.nextInt();
        System.out.print("Please enter the exponent number: ");
        exponent=getNumber.nextInt();
        for(int i=1;i<=exponent;i++){
            exponential*=number;
        }
        System.out.println(number+" to the powers of  "+exponent+" is: "+exponential);
    }
}
