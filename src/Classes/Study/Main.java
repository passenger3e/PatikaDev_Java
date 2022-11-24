package Classes.Study;

public class Main {
    public static void main(String[] args) {
        String _model,_type,_color;
        _model="bmw iX";
        _type="SUV";
        _color="Metallic Grey";
        Car empty=new Car();
        Car bmw=new Car(_model,_type,_color); //this Car() represents the Constructor Method belongs to class
//        bmw.model="bmw iX";
//        bmw.type="SUV";
        bmw.increaseSpeed(20);
        System.out.println("Car is "+bmw.type+" "+bmw.model+" with speed of "+bmw.speed);
        bmw.printSpeed();
        Car mercedes=new Car(_model,_type,_color);
        mercedes.model="S-Series";
        bmw.printInfo();
        Main test=new Main(10);
        new Main();


    }
    public Main(){
        System.out.println("Called Main method");
    }
    public Main(int a){
        new Main();
    }
}
