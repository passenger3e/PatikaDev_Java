package Methods;

import java.util.Scanner;

public class P04_MethodByPattern {
    public static void main(String[] args) {
        Scanner getNumber=new Scanner(System.in);
        int number,count;
        do{
            count=0;
            System.out.print("Please enter a number: ");
            number=getNumber.nextInt();
            if(number<=0) break;
            else DoOperation(number,false,count);

            System.out.println();
        }while(true);
    }
    public static void DoOperation(int a,boolean increase,int cnt){

        if(a>0&&!increase){
            System.out.print(a+" ");
            DoOperation(a-5,(a-5)>0?false:true,++cnt);//you can't use cnt++,it won't increase.+
            // beacuse operation is done while sending but cnt++ means after it is used increase 'cnt' so it never adds 1
        }
        else if(increase&&cnt>=0){
            System.out.print(a+" ");
            DoOperation(a+5,true,(--cnt));
        }

    }
}
