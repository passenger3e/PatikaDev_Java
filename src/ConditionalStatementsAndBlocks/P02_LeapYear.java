package ConditionalStatementsAndBlocks;

import java.util.Scanner;

public class P02_LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner getYear=new Scanner(System.in);
        System.out.print("Please enter the year you want to check it is leap year or not: ");
        year=getYear.nextInt();
        if(year%4==0) {
            if (year % 100 == 0&&year%400==0){
                System.out.println("Year "+year+" is not a leap year!");
            }
            else System.out.println("Year "+year+" is a leap year.");
        }else System.out.println("Year "+year+" is not a leap year!");

    }
}
