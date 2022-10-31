package Loops;

import java.util.Scanner;

public class P03_SubMultiple {
    public static void main(String[] args) {
        /*
        Find the average of the sub-multiple of 4 and 3 for given number
         */
        Scanner getNumber=new Scanner(System.in);
        int number1,total=0,count=0;

        number1=getNumber.nextInt();
        for(int i=12;i<=number1;i+=12){
            total+=i;
            count++;
        }
        System.out.println("First Case - Average is: "+((double)total)/count);
        count=0;
        total=0;

        for (int i=1;i<=number1;i++){
            if(i%3==0&&i%4==0){
                total+=i;
                count++;
            }
        }
        System.out.println("Second Case - Average is: "+((double)total)/count);
    }
}
