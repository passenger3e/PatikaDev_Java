package Loops;

import java.util.Scanner;

public class P03_FindPrimeNumbers {
    public static void main(String[] args) {
        Scanner getNumber=new Scanner(System.in);
        int number=0;
        boolean isPrime;
        System.out.println("This finds the prime numbers between 1 and entered number.");
        do{
            System.out.println("--------------------------------");
            System.out.print("From 1 to what number are you looking for(zero '0' to Exit): ");
            number=getNumber.nextInt();

            System.out.print("Prime numbers between 1 and "+number+" are: ");
            for(int i=2;i<=number;i++){
                    isPrime=true;
                for(int j=2;j<=Math.sqrt(i);j++){
                    if(i%j==0){
                    isPrime=false;
                    }
                }
                if(isPrime) System.out.print(i+", ");
            }
            System.out.println();
        }while(number!=0);
    }
}
