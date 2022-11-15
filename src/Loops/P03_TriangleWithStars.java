package Loops;

import java.util.Scanner;

public class P03_TriangleWithStars {
    public static void main(String[] args) {
        Scanner getRow=new Scanner(System.in);
        System.out.print("Please enter number of row you would like to design as Diamond: ");
        int rowNum=getRow.nextInt();
        int midle=(rowNum-1),initial=1;
        for(int d=1;d<=(rowNum*2-1);d++) { //controls the rows, prints the starts lastly after spaces are put.
            for (int i = 1; i <= midle; i++) {
                System.out.print(" "); //adding space to in front of the star.
            }

            for(int stars=1;stars<=initial;stars++){
                System.out.print("*");
            }
            if(d<rowNum) {
                initial = d * 2 + 1;
                midle--;
            }
            else {
                initial -= 2;
                midle++;
            }

            System.out.println();
        }
    }
}
