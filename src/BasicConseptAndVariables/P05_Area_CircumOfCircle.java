package BasicConseptAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class P05_Area_CircumOfCircle {
    public static void main(String[] args) {
        /*
        Dairenin Alanını ve Çevresini Hesaplayan Program
        Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
        Alan Formülü : π * r * r;
        Çevre Formülü : 2 * π * r;
        Ödev
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        𝜋 sayısını = 3.14 alınız.
        Formül : (𝜋 * (r*r) * 𝛼) / 360
         */
        Scanner getRadius=new Scanner(System.in);
        int radius;
        double areaCircle;
        double circumferenceCircle;
        double pi=3.14;
        System.out.print("Please enter the radius of the circle to calculate Area and Circumference of the circle: ");
        radius=getRadius.nextInt();
        circumferenceCircle=2*pi*radius;
        //areaCircle=pi*radius*radius;
        areaCircle= (BigDecimal.valueOf(pi).multiply(BigDecimal.valueOf(radius))).multiply(BigDecimal.valueOf(radius)).doubleValue();
        System.out.println("Area of the Circle is: "+areaCircle+"\nand Circumference of the Circle is: "+circumferenceCircle);
    }
}
