package Methods;

public class P04_RecursiveMethods {
    public static void main(String[] args) {
        int result=recMethod(4);
        System.out.println("result: "+result);
        System.out.println("Sum of Digits: "+SumDigits(45612));

    }
    public static int recMethod(int k){
        if(k>0){
            return k+recMethod(k-2); //calls itself until k<=0
        }else return 0;
    }
    static int SumDigits(int number){
        if (number == 0){
            return 0;
        }else
            return number % 10 + SumDigits(number / 10);
    }


}
