package BasicConseptAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class P04_Taximeter {
    public static void main(String[] args) {
        /*
        Taksimetre Programı
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
         */

        Scanner getDistance=new Scanner(System.in);
        BigDecimal distance;
        BigDecimal pricePerKM= new BigDecimal("2.2");// make it precision you should use string in BigDecimal
        BigDecimal ilk= new BigDecimal(10);
        BigDecimal totalAmount;

        System.out.print("Please enter the distance driven in km: ");
        distance=BigDecimal.valueOf(getDistance.nextDouble());
        totalAmount=distance.multiply(pricePerKM);
        //System.out.println(pricePerKM);
        totalAmount=totalAmount.add(ilk);
        if(totalAmount.doubleValue()>=20){
            System.out.println("Total price is: "+(totalAmount)+"TL"); // for the value of 6 result will give 223.200000000000001..
            // if you don't use BigDecimal and even if you do pricePerKM should be as String*/
        }else{
            System.out.println("Total price is: "+ 20.0+"TL");
        }

    }
}
