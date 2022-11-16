package Loops;

import java.util.Scanner;

public class P03_MinMax {
    public static void main(String[] args) {
        Scanner getValue=new Scanner(System.in);
        int value,minValue=0,maxValue=0,count,i=1;
        System.out.print("PHow many numbers will you enter: ");
        count=getValue.nextInt();
        while(i!=(count+1)){
            System.out.print("Please enter "+i+". number: ");
            if(i==1){
                minValue=getValue.nextInt();
            }
            else {
                value=getValue.nextInt();
                if(value<minValue){
                    minValue=value;
                }else maxValue=value;
            }
            i++;

        }
        System.out.println("Smallest value is: "+minValue);
        System.out.println("Largest value is: "+maxValue);

    }
}
