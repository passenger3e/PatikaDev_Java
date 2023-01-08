package Arrays.OneDimension;

public class OneDimensionArray {
    public static void main(String[] args) {
        //double[] list={1,3,3,3,};
        double[] list=new double[5];
        list[4]=5;
        list[1]=81;
        list[0]=0;
        System.out.println(list[4]+list[1]);
        String[] days={"monday","tuesday","wednesday","thursday","friday"};
        String[] weekendDays=new String[]{"sunday","saturday"};
        System.out.println("A week has "+(days.length+weekendDays.length)+" days");
        System.out.println("week days are: ");
        for(int i=0; i<days.length;i++){
            System.out.println(days[i]);
        }
        //another way of for loop for the arrays
        for(String d:days){
            System.out.println(d);
        }
    }
}
