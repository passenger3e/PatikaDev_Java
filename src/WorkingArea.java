import javax.security.auth.login.CredentialNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class WorkingArea {
    public static void main(String[] args) {


        Scanner readfile=new Scanner(System.in);
        int i=0;
        ArrayList arrayS=new ArrayList();
        boolean condition=false;
        boolean conLine=false;
        String  lLine="";
        String tmp=null;



        //----

        i=1;
        ArrayList array=new ArrayList();
        while(readfile.hasNext()){
            //System.out.println(i+" "+readfile.nextLine());
            array.add(readfile.nextLine());
            i++;
            if(i==3) break;
        }

        Object[] object=array.toArray();
        i=1;
        for(Object s:object){
            System.out.println(i+" "+s);
            i++;
        }
        //-----
//        while (readfile.hasNext())
//        {
//            tmp=readfile.next();
//            if(readfile.hasNextLine())
//            {
//                System.out.println("dede");
//                i++;
//            }
//            lLine=lLine+" "+tmp;
//        }
//        System.out.println(lLine+" deneme");

        //-----
        i=1;
        while(readfile.hasNext()){
            System.out.println(i+" "+readfile.nextLine());
            i++;
        }


        //----
        while(!condition){

            tmp=readfile.next();

            if(lLine.equals("")) {
                lLine = tmp;
            }else {
                lLine=lLine+" "+tmp;
            }

            //System.out.println(lLine);
            if (tmp.equals("end-of-line")){
                condition=true;
                arrayS.add(i,lLine);
                break;
            }
            if(readfile.hasNextLine()){
                arrayS.add(i,lLine);
                System.out.println(" 11 ");
                i++;
                lLine="";
            }


        }






//        System.out.println(lLine);
//        while(!condition){
//
//            //lLine=readfile.next();
//            while(!conLine){
//                tmp=readfile.next();
//                System.out.println(tmp);
//            }
//            if(lLine!="\n"){
//                tmp=lLine+tmp;
//                System.out.println(tmp);
//            }
//            //condition=lLine.;
//            if(lLine=="\n") {
//                arrayS.add(i, tmp);
//                i++;
//            }
//            if(lLine=="end-of-line"){
//                condition=true;
//            }
//           // System.out.println(i+" "+arrayS.get(i));
//            //System.out.println(readfile.nextLine());
//
//        }

//        for(int j=0;j<=i;j++){
//            System.out.println((j+1)+" "+arrayS.get(j));
//        }

    }
}
