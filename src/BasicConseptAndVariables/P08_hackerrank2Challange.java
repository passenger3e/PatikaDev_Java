package BasicConseptAndVariables;

import java.util.ArrayList;
import java.util.Scanner;

public class P08_hackerrank2Challange {
    public static void main(String[] args) {
        /*
        Input Format
        Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.
        Output Format
        For each line, print the line number, followed by a single space, and then the line content received as input.
        Sample Input
         */

        Scanner readfile=new Scanner(System.in);
        int  i=1;
        ArrayList array=new ArrayList();
        while(readfile.hasNext()){
            /*
            Challenge says: "read  lines of input until you reach EOF" then print
            so get all inputs auntil EOF
            */

            //System.out.println(i+" "+readfile.nextLine()); //without code block 2, this code line can be run to serve same purpose in a different behavior
            array.add(readfile.nextLine());
            i++;
            /* //you can add this code block to see the result because loop won't end in terminal Inputs.
            if(i==4){
                break;
            }
            */

        }
        //Code block 2
        Object[] object=array.toArray();
        i=1;
        for(Object s:object){
            System.out.println(i+" "+s);
            i++;
        }
    }
}
