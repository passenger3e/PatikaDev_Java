package Loops;

import java.util.Scanner;

public class P03_ReverseTriangle {
    public static void main(String[] args) {
        Scanner getRow=new Scanner(System.in);
        System.out.print("Enter row number to design a reverse triangle: ");
        int rowNum=getRow.nextInt();
        int tmp=rowNum;
        for(int i=1;i<=rowNum;i++){
            for(int s=0;s<(i);s++){
                System.out.print(" ");
            }
            for(int k=(tmp*2-1);k>0;k--){
                System.out.print("*");
            }
            tmp--;
            System.out.println();
        }
    }
}
