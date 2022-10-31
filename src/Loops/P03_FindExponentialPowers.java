package Loops;

import java.util.Scanner;

public class P03_FindExponentialPowers {
    public static void main(String[] args) {
        Scanner getNumber=new Scanner(System.in);
        int number,firstTotal=1,secondTotal=1;
        System.out.print("Please enter a number: ");
        if(getNumber.hasNextInt()) {
            number = getNumber.nextInt();
            getNumber.nextLine();
            System.out.print("Power of 4's are: ");
            while(firstTotal<number){
                System.out.print(firstTotal+" ");
                firstTotal*=4;

            }
            System.out.print("\nPower of 5's are: ");

            while (secondTotal<number){
                System.out.print(secondTotal+" ");

                secondTotal*=5;
            }

        }
    }
}
