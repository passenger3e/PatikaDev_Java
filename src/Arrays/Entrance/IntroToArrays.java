package Arrays.Entrance;
public class IntroToArrays {
    public static void main(String[] args) {
        int array[]= new int[]{1, 2, 3, 4, 5};// array can be declared like this
        double[] d;//=new double[array.length];
        d=call(array);
        System.out.println("0: "+d[0]+" 1: "+d[1]);
        //foreach:
        for (int i:reverse(array)){
            System.out.println(i);
        }


    }
    public static double[] call(int[] a){
        double[] dbl= new double[a.length];
        for (int i=0;i<a.length;i++){
            dbl[i]=a[i]; //no need an explicit casting
        }
        //dbl= Arrays.stream(a).asDoubleStream().toArray(); //Create an IntStream, mapToDouble to get a DoubleStream, and convert back with toArray().
        //this is a performance hog
        return dbl;
    }
    public static int[] reverse(int[] arr){
        int[] r=new int[arr.length];
        for(int i=0,j=arr.length-1;i<arr.length;i++,--j){
            r[j]=arr[i];
        }
        return r;
    }
}
