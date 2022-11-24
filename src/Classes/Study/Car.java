package Classes.Study;

public class Car { // you can create constructor methods while writing classes. even if you don't create one program defines a default one with non-parameter
    //Attributes
    String type,model,color;
    int speed,speedLimit;//better to do assign default value in constructor
    //Creating constructor method
    Car (String _type,String _model,String _color){ //Constructor should have same name as Class name
        //if you create a constructor you cant create object with default constructor
        this.type=_type;
        this.model=_model;
        this.color=_color;
        this.speedLimit=180;
    }
    Car(){
        System.out.println("Constructor has been created");

    }
    //Methods
    void increaseSpeed(int increment){

        if((speed+increment)<speedLimit){
            speed+=increment;
        }
    }
    void decreaseSpeed(int decrement){
        if(speed>0){
            speed-=decrement;
        }
    }
    void printSpeed(){
        System.out.println("Speed is:"+speed);
    }
    void printInfo(){
        System.out.println("Model\t:"+this.model);
        System.out.println("Type\t:"+this.type);
        System.out.println("Color\t:"+this.color);
        System.out.println("Speed\t:"+this.speed);
    }
}
