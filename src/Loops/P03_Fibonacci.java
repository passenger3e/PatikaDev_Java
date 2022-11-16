package Loops;

import java.util.Scanner;

public class P03_Fibonacci {
    public static void main(String[] args) {
        Scanner getCount=new Scanner(System.in);
        System.out.print("Please enter how many elements will be included in Fibonacci series: ");
        int count=getCount.nextInt();
        int firstNumber=0,secondNumber=1,resultNumber;
        System.out.print(count+" elements Fibonacci series  are: ");
        System.out.print(0+", ");
        for(int i=1;i<=count;i++){
            resultNumber=firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber=resultNumber;
            System.out.print(firstNumber+", ");
        }
        System.out.println("\b\b");
    }
}
