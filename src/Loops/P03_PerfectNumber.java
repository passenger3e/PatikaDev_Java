package Loops;

import java.util.Scanner;

public class P03_PerfectNumber {
    public static void main(String[] args) {
        Scanner getNumber=new Scanner(System.in);
        int number,totalNum=0;
        String isPerfect=" a perfect number.",notPerfect=" not a perfect number.",isIT;
        boolean condition=true;

        do{
            System.out.print("Number you would like to check if it si Perfect number or not( zero '0' for to exit): ");
            number=getNumber.nextInt();
            if(number==0){
                condition=false;
                break;
            }else{
                for(int i=1;i<number;i++){
                    if(number%i==0){
                        totalNum+=i;
                    }
                }
                if(totalNum==number){

                    isIT=isPerfect;
                }
                else {

                    isIT=notPerfect;
                }
                System.out.println("Given Number "+number+" is"+isIT);
                totalNum=0;
            }

        }while(condition);
        System.out.println("You exit the Console! ");
    }
}
