package BasicConseptAndVariables;

import java.util.Scanner;

public class P06_BodyMassIndex {
    public static void main(String[] args) {
        /*
        Vücut Kitle İndeksi Hesaplama
        Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
        Formül
        Kilo (kg) / Boy(m) * Boy(m)
         */
        double heigthM;
        double weightKG;
        double bodyMassIndex;
        Scanner getParam=new Scanner(System.in);
        System.out.print("Please enter your height (in meter) : ");
        heigthM=getParam.nextDouble();
        System.out.print("Please enter your weight (in kg) : ");
        weightKG=getParam.nextDouble();
        bodyMassIndex=weightKG/(heigthM*heigthM);
        System.out.println("Your body index is: "+bodyMassIndex);
    }
}
