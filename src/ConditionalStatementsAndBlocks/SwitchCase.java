package ConditionalStatementsAndBlocks;

public class SwitchCase {
    public static void main(String[] args) {
        int number1=5;
        switch(number1){
            case 1:; //no need semicolon
            case 2:
                System.out.println("case 2");
            case 3:
                System.out.println("case 3");//break;
            case 4:
                System.out.println("case4");
            case 5:
                System.out.println("case 5"); //break; //if you do not use "break;" where condition is true, every case's will be started to be executed
            case 6:
                System.out.println("case 6");
            default:
                System.out.println("default");
        }
    }
}
