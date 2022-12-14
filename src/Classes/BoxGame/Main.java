package Classes.BoxGame;

public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("Ali",15,100,70,80);
        Fighter f2=new Fighter("Burak",15,95,75,60);
        Match match1=new Match(f1,f2,50,100);
        match1.start();
    }
}
