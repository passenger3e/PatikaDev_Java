package Methods;

import java.util.Scanner;

public class P04_PalindromeNumbers {
    public static void main(String[] args) {
        Scanner getNumber=new Scanner(System.in);
        int number=1;
        while(number!=0) {
            System.out.print("Enter a number to see if it is a palindrome number or not: ");
            number = getNumber.nextInt();
            System.out.println("Number entered is " + IsPalindrome(number));
            System.out.println("According to the second method it is " +(IsPalindrome(number,true)?" a Palindrome number.":" not a Palindrome number."));
        }
    }
    static String IsPalindrome(int p){
        String condition=" not a Palindrome number";

          int temp, lastNumber,reversedNumber=0;
          temp=p;
          while(temp!=0){
              lastNumber=temp%10;
              reversedNumber=reversedNumber*10+lastNumber;
              temp/=10;
          }
          if(reversedNumber==p) condition=" a Palindrome number";

        return condition;
    }
    static boolean IsPalindrome(int k,boolean b){
        int count=CountDigits(k);
        //you can use Integer to char converter
        String separator=String.valueOf(k);
        char[] digits=separator.toCharArray();

        if(k/10==0) b=true;
        else {
            for (int i = 0, j=count-1; i < count && j>=0; i++,j--) {
                if(i!=j) {
                    if (digits[i] != digits[j]) b = false;
                }
                else break;
            }

        }
        return b;
    }
    static int CountDigits(int value){
        int count=0;
        while(value!=0){
            value/=10;
            count++;
        }
        return count;
    }
}
