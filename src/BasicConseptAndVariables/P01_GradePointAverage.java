package BasicConseptAndVariables;

import java.util.Scanner;

public class P01_GradePointAverage {
    public static void main(String[] args) {
        /*
        Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan
         ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
         Ödev Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" ,
          küçük ise "Sınıfta Kaldı" yazsın.
         */
        double mathGrade, physicGrade, chemGrade, turkishGrade, historyGrade, musicGrade;

        System.out.println("This is a tool for calculate the average your grade and print out if you passed the class or failed");
        System.out.println("Please enter your Grades for every class...");
        Scanner getGrade = new Scanner(System.in);
        System.out.print("Please enter your grade for \"Math\" class: ");
        mathGrade = getGrade.nextDouble();
        System.out.print("Please enter your grade for \"Physic\" class: ");
        physicGrade = getGrade.nextDouble();
        System.out.print("Please enter your grade for \"Chemistry\" class: ");
        chemGrade = getGrade.nextDouble();
        System.out.print("Please enter your grade for \"Turkish\" class: ");
        turkishGrade = getGrade.nextDouble();
        System.out.print("Please enter your grade for \"History\" class: ");
        historyGrade = getGrade.nextDouble();
        System.out.print("Please enter your grade for \"Music\" class: ");
        musicGrade = getGrade.nextDouble();
        double finalGrade = (mathGrade + physicGrade + chemGrade + turkishGrade + historyGrade + musicGrade) / 6;
        System.out.println(finalGrade>60? "You passed the Class":"you failed the Class");

    }
}
