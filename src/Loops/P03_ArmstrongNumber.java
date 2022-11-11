package Loops;

import java.util.Scanner;

public class P03_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner getNumber=new Scanner(System.in);
        int baseNumber,temp,digitCount=0,total=0,temp2=1,base=1,sum=0;
        System.out.print("Please enter a number to check if it is Armstrong number: ");
        baseNumber=getNumber.nextInt();
        boolean isZero=false;
        temp=baseNumber;
        temp2=baseNumber;
        while(!isZero){

            temp/=10;
            digitCount++;
            if(temp==0){ //counting until making zero the digits
                isZero=true;
            }
        }

        for(int i=1;i<=digitCount;i++){
            base=temp2%10;
            int j=1;
            temp=1;
            for( j=1;j<=digitCount;j++){ //finding power of each digit
                temp*=base;

            }
            sum+=base;
            temp2/=10;
            total=total+temp;
        }
        if(baseNumber==total) {
            System.out.println("Given number '"+baseNumber+"' is a Armstrong number");
        }
        else System.out.println("Given number is not a Armstrong number.");
        System.out.println("Sum of the digits of the number '"+baseNumber+"' is "+sum);

    }
}
