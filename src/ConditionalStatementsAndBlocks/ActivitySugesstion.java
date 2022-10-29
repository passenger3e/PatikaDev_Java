package ConditionalStatementsAndBlocks;

import java.util.Scanner;

public class ActivitySugesstion {
    public static void main(String[] args) {
        int temp;
        Scanner getTemp=new Scanner(System.in);
        System.out.print("Please enter Temperature: ");
        temp=getTemp.nextInt();
        if(temp<=5)
            System.out.println("You can go Skiing.");
        if(temp>5&&temp<=15)
            System.out.println("You can go to Cinema.");
        if(temp>10&&temp<=25)
            System.out.println("You can go to Picnic.");
        if(temp>25)
            System.out.println("You can go to Swimming.");

    }
}
