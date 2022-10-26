package BasicConseptAndVariables;

import java.util.Scanner;

public class P07_GreengrocerReceipt {
    public static void main(String[] args) {
        /*
        Meyveler ve KG Fiyatları
        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL
         */
        double pear,apple,tomato,banana,aubergine;
        double pricePear=2.14,priceApple=3.67,priceTomato=1.11,priceBanana=0.95,priceAubergine=5.0;
        Scanner getWeight=new Scanner(System.in);
        System.out.print("How much kg of Pear: ");
        pear=getWeight.nextDouble();
        System.out.print("How much kg of Pear: ");
        apple=getWeight.nextDouble();
        System.out.print("How much kg of Pear: ");
        tomato=getWeight.nextDouble();
        System.out.print("How much kg of Pear: ");
        banana=getWeight.nextDouble();
        System.out.print("How much kg of Pear: ");
        aubergine=getWeight.nextDouble();
        System.out.println("Total price is: "+(pear*pricePear+apple*priceApple+tomato*priceTomato+banana*priceBanana+aubergine*priceAubergine)+" TL.");

    }
}
