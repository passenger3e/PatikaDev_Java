package ConditionalStatementsAndBlocks;

import java.util.Scanner;

public class SortingThreeNumbers {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner getNumber=new Scanner(System.in);
        System.out.print("Enter 1. number: ");
        num1=getNumber.nextInt();
        System.out.print("Enter 2. number: ");
        num2=getNumber.nextInt();
        System.out.print("Enter 3. number: ");
        num3=getNumber.nextInt();
        if(num1<num2&&num1<num3){
            System.out.print(num1+"<");
            if(num2<num3){
                System.out.print(num2+"<"+num3);
            }else System.out.print(num3+(num2==num3?"=":"<")+num2);
        }else if(num2<num3){
            System.out.print(num2);
            System.out.print(num1==num2?"=":"<");
            System.out.print(num1==num3?(num1+"="+num3):(num1<num3?num1+"<"+num3:num3+"<"+num1));
        }else if(num3<num2)
        {
            System.out.print(num3);
            System.out.print(num1==num3?"=":"<");
            System.out.print(num1==num2?(num1+"="+num2)
                    :(num1<num2?(num1+"<"+num2):num2+"<"+num1));

        }else System.out.print(num1>num2?num2+"="+num3+"<"+num1:num1+"="+num2+ "="+num3);
    }
}
