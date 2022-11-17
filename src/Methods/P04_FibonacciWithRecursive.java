package Methods;

import java.util.Scanner;

public class P04_FibonacciWithRecursive {
    public static void main(String[] args) {
        Scanner getNumber=new Scanner(System.in);
        int number=0;

        do{
            System.out.print("Enter a number: ");
            number=getNumber.nextInt();
            if(number!=0){
                System.out.println(number+". element fibonacci number is: "+GetFibonacci(number));
            }
            System.out.print("Fibonacci series is: ");
            GetFibSeries(number);
            System.out.println();
        }while(number!=0);
        //System.out.println("Fibonacci series is: "+GetFibSeries(number));

    }
    public static int GetFibonacci(int a){
        if(a==1||a==2) return 1;
        return GetFibonacci(a-1)+GetFibonacci(a-2);
    }
    public static void GetFibSeries(int a){
        if(a==1){
            System.out.println(1);        }
        else if(a==2) System.out.print("1, 1 ");
        else {
            System.out.print(GetFibonacci(a)+", ");
            GetFibSeries(a - 1);
        }
    }

}
