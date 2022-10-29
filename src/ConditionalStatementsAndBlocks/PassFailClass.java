package ConditionalStatementsAndBlocks;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class PassFailClass {
    public static void main(String[] args) {
        int math,turkish,physic,music,chemistry,temp;
        double average,count=5.0;
        Scanner getGrade=new Scanner(System.in);
        System.out.print("Enter Math Note: ");
        temp=getGrade.nextInt();
        math=(temp>0&&temp<=100)?temp:0;
        count=(math==0)?(count-1):count;
        System.out.print("Enter Turkish Note: ");
        temp=getGrade.nextInt();
        turkish=(temp>0&&temp<=100)?temp:0;
        count=(turkish==0)?(count-1):count;
        System.out.print("Enter Physic Note: ");
        temp=getGrade.nextInt();
        physic=(temp>0&&temp<=100)?temp:0;
        count=(physic==0)?(count-1):count;
        System.out.print("Enter Music Note: ");
        temp=getGrade.nextInt();
        music=(temp>0&&temp<=100)?temp:0;
        count=(music==0)?(count-1):count;
        System.out.print("Enter Chemistry Note: ");
        temp=getGrade.nextInt();
        chemistry=(temp>0&&temp<=100)?temp:0;
        count=(chemistry==0)?(count-1):count;

        average=(math+turkish+physic+music+chemistry)/count;
        if(average>=55){
            System.out.println("Congratulation! You passed the Class\nYour average is: "+average);
        }else{
            System.out.println("Your average is: "+average+" Sorry! You failed.");
        }
    }
}
