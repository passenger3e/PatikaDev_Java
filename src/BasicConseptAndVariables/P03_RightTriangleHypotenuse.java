package BasicConseptAndVariables;

import java.util.Scanner;

public class P03_RightTriangleHypotenuse {
    public static void main(String[] args) {
        /*
        Dik Üçgende Hipotenüs Bulan Program
        Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
        Ödev
        Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        Formül
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        𝑢 = (a+b+c) / 2
        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
         */
        double firstLength;
        double secondLength;
        double thirdLength;
        double halfCircumference;
        double areaTriangle;
        Scanner getLength=new Scanner(System.in);
        System.out.print("Please enter length of first leg of the triangle: ");
        firstLength=getLength.nextDouble();
        System.out.print("Please enter length of second leg of the triangle: ");
        secondLength=getLength.nextDouble();
        System.out.println("Hypotenuse of the triangle is: "+Math.hypot(firstLength,secondLength));
        //other approaches
        //System.out.println(Math.sqrt(Math.pow(firstLength,2)+Math.pow(secondLength,2)));
       // System.out.println(Math.sqrt(firstLength*firstLength+secondLength*secondLength));

        System.out.println("Let's Calculate Area ofa Triangle which 3 length is given..");
        System.out.print("Please enter first length: ");
        firstLength=getLength.nextDouble();
        System.out.print("Please enter second length: ");
        secondLength=getLength.nextDouble();
        System.out.print("And Please enter third length: ");
        thirdLength=getLength.nextDouble();
        halfCircumference=(firstLength+secondLength+thirdLength)/2;
        areaTriangle=Math.sqrt(halfCircumference*(halfCircumference-firstLength)*(halfCircumference-secondLength)*(halfCircumference-thirdLength));
        System.out.println("Area of the Triangle is: "+areaTriangle);

    }
}
