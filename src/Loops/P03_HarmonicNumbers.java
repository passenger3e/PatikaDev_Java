package Loops;

import java.util.Scanner;

public class P03_HarmonicNumbers {
    public static void main(String[] args) {
        Scanner getValue=new Scanner(System.in);
        double total=0;
        int i=1,value=0;
        while (value<=0){
            System.out.print("Please Enter an Integer value: ");
            value=getValue.nextInt();
        }
        for(i=1;i<=value;i++){
            total+=1f/i;
        }
        System.out.println(value+". Harmonic value of the entered number is: "+total);
    }
}
