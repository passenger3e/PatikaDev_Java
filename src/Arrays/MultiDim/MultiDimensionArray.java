package Arrays.MultiDim;

import java.util.Arrays;

public class MultiDimensionArray {
    public static void main(String[] args) {
        int[][] matrix=new int[4][4];
        matrix[0][0]=0;
        matrix[0][1]=100;
        matrix= new int[][]{
                {1, 2, 3, 5},
                {5, 6, 8, 7},
                {7, 3, 6, 8},
                {10, 5, 9, 7}

        };
        System.out.println("number of rows: "+matrix.length);
        System.out.println("number of columns:  "+matrix[0].length);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=(i*2+j*3);
            }
        }
        for(int[] s:matrix) { //This doesnt work like the one-dimension. you have to insert another loop inside.So it will pull an array from matrix
            for (int k:s) {//with this, loop prints all content from that "one array (s)"
                //System.out.println(Arrays.toString(s).substring(1)); //this prints the array string
            System.out.print(k);
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println("***************");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }

    }
}
