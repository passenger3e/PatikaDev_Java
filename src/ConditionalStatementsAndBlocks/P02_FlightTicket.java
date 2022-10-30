package ConditionalStatementsAndBlocks;
import java.util.Scanner;
public class P02_FlightTicket {
    public static void main(String[] args) {
        double perKM=0.1,childDiscount=0.5,youngDiscount=0.1,olderDiscount=0.3,twoWay=0.2,totalPrice;
        int distance,age,way;
        Scanner getData=new Scanner(System.in);
        System.out.print("Please enter flying distance (km): ");
        distance=getData.nextInt();
        System.out.print("Please enter the Age of the passenger:");
        age=getData.nextInt();
        System.out.println("Please chose type of flight (1-->One Way  2-->Two Way): ");
        way=getData.nextInt();
        if(distance>0&&(way==2||way==1)&&age>0) {
            totalPrice = perKM * distance;
            if (age <= 12) totalPrice -= totalPrice * childDiscount;
            else if (age <= 24) totalPrice -= totalPrice * youngDiscount;
            else if (age >= 65) totalPrice -= totalPrice * olderDiscount;
            if (way == 2) totalPrice = (totalPrice - twoWay * totalPrice) * 2;
            System.out.println("Your Fligt ticket cost " + totalPrice + " TL");
        }else System.out.println("Unvalid data entry.");

    }
}
