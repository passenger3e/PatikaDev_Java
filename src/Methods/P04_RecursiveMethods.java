package Methods;

public class P04_RecursiveMethods {
    public static void main(String[] args) {
        int result=recMethod(4);
        System.out.println("result: "+result);
        System.out.println("Basamak toplami: "+basamaklarToplami(45612));
//2+1+6+
        //6
    }
    public static int recMethod(int k){
        if(k>0){
            return k+recMethod(k-2); //calls itself until k<=0
        }else return 0;
    }
    static int basamaklarToplami(int sayi){
        if (sayi == 0){
            return 0;
        }else
            return sayi % 10 + basamaklarToplami(sayi / 10);
    }


}
