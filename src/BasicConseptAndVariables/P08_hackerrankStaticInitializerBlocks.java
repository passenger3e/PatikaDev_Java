package BasicConseptAndVariables;

import java.util.Scanner;

public class P08_hackerrankStaticInitializerBlocks {

         static int b,h,area;
        static boolean flag=false;
        static {
            Scanner scan =new Scanner(System.in);
            b=scan.nextInt();
            h=scan.nextInt();
            if(b<=0||h<=0){
                System.out.println("java.lang.Exception: Breadth and height must be positive");
                //throw new Exception("java.lang.Exception: Breadth and height must be positive");
            }else{
                flag=true;
                area=b*h;
                System.out.println(area);
            }
        }

    public static void main(String[] args) {

    }
}



//import java.io.*;
//        import java.util.*;
//        import java.text.*;
//        import java.math.*;
//        import java.util.regex.*;
//public class Solution {
//
//    public class StaticInit{
//        static int b,h;//=scan.nextInt();
//
//        static int area;
//
//        static {
//            Scanner scan=new Scanner(System.in);
//            b=scan.nextInt();
//            h=scan.nextInt();
//            if(b<=0||h<=0){
//                System.out.println("java.lang.Exception: Breadth and height must be positive");
//                //throw new Exception("java.lang.Exception: Breadth and height must be positive");
//            }else{
//                area=b*h;
//                System.out.println(area);
//            }
//        }
//        public static void main(String[] args) throws Exception {
//            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//            //public static int b,h,area;
//
//
//
//
//        }
//    }
//}


