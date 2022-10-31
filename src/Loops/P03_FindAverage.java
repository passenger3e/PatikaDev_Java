package Loops;

import java.util.Scanner;

public class P03_FindAverage {
    public static void main(String[] args) {
        /*
        ask for number continuously until user enters odd number
        Find sum of the numbers that are even and be able to divided to 4 and print the these numbers.
        This homework gives wrong expression and decided to take assignment as finding only numbers able to be divided to 4
         */
        Scanner getNumber=new Scanner(System.in);
        int number,count=0;
        double total=0;
        boolean checkOdd=false;
        while(!checkOdd){
            System.out.print("Please enter number that look for even and multiple of 4 numbers\n(enter odd number to exit the application): ");

            if(getNumber.hasNextInt()){
                number=getNumber.nextInt();
                if(number%2==1){
                    checkOdd=true;
                    break;
                }
                else if(number%4==0){
                    count++;
                    total+=number;
                }
            }
            else{
                System.out.println("Please enter an Integer number");
            }
        }
        System.out.println("Sum of "+count+" numbers is: "+total);

    }
}
