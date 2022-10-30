package ConditionalStatementsAndBlocks;

import java.util.Scanner;

public class P02_ChineseZodiac {
    public static void main(String[] args) {
        int year;
        String sign="";
        Scanner getYear=new Scanner(System.in);
        System.out.print("Please enter year you were born: ");
        year=getYear.nextInt();
        switch (year % 12) {
            case 0 -> sign = "Monkey";
            case 1 -> sign = "Rooster";
            case 2 -> sign = "Dog";
            case 3 -> sign = "Pig";
            case 4 -> sign = "Rat";
            case 5 -> sign = "Ox";
            case 6 -> sign = "tiger";
            case 7 -> sign = "Rabbit";
            case 8 -> sign = "Dragon";
            case 9 -> sign = "Snake";
            case 10 -> sign = "Horse";
            case 11 -> sign = "Goat";
        }
        System.out.println("Your chinese Zodiac sign is: "+sign);
    }
}
