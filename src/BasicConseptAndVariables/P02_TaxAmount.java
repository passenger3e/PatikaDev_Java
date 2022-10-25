package BasicConseptAndVariables;

import java.util.Scanner;

public class P02_TaxAmount {
    public static void main(String[] args) {
        /*
        KDV Tutarı Hesaplayan Program
      Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
        (Not : KDV tutarını 18% olarak alın)
        KDV'siz Fiyat = 10;
        KDV'li Fiyat = 11.8;
        KDV tutarı = 1.8;
        Odev
        Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
         */
        System.out.println("This tool is to calculate the Tax Amount and Total Amount");
        Scanner getMoney=new Scanner(System.in);
        double sumOfMoney;
        double taxAmount;
        double taxPercentage1=(18.0/100);
        double taxPercentage2=(8.0/100);
        System.out.println("|Description                    | Amount |");
        System.out.println("------------------------------------------");
        System.out.print("Please enter the Amount:         ");
        sumOfMoney=getMoney.nextDouble();
        double taxPercentage=(sumOfMoney>0&&sumOfMoney<=1000? taxPercentage1:taxPercentage2);
        System.out.println("------------------------------------------");
        taxAmount=sumOfMoney*taxPercentage;
        System.out.println("Amount without tax is:           " +taxAmount);
        System.out.println("------------------------------------------");
        System.out.println("Tax Amount is:                   " +taxAmount +
                "\n------------------------------------------\nAnd Total Amount with tax is:    "+(taxAmount+sumOfMoney));

    }
}
