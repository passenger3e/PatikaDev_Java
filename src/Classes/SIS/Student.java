package Classes.SIS;

public class Student {
    int classes;
    double average;
    String name,stuNo;
    Course math,physic,chemistry;
    boolean isPass;
     Student(String name,String stuNo,int classes,Course math,Course physic,Course chemistry){
        this.name=name;
        this.stuNo=stuNo;
        this.math=math;
        this.physic=physic;
        this.chemistry=chemistry;
        this.classes=classes;

        this.isPass=false;
    }
    public void isPass(){
        calculateNote();
         if(this.math.note==0||this.math.verbalNote==0||this.physic.note==0||this.physic.verbalNote==0||this.chemistry.note==0||this.chemistry.verbalNote==0){
             System.out.println("Some notes were not entered the system!");
         }else{
             this.isPass=checkPass();
             printNote();
             System.out.println("Average is : "+this.average);
             if(isPass){
                 System.out.println("Passed the class!");
             }else
                 System.out.println("Failed the class!");
         }
    }
    public void calculateNote(){
                this.math.note=this.math.examNote*(1-this.math.percentage)+this.math.verbalNote*this.math.percentage;
                this.physic.note=this.physic.examNote*(1-this.physic.percentage)+this.physic.verbalNote*this.physic.percentage;
                this.chemistry.note=this.chemistry.examNote*(1-this.chemistry.percentage)+this.math.verbalNote*this.chemistry.percentage;
                averageNotes();
    }
    public void addExamNote(int math,int physic,int chemistry){ //setting the written exam notes
        this.math.examNote=math; //adding notes related to classes
        this.physic.examNote=physic;
        this.chemistry.examNote=chemistry;

    }
    public void verbalNotes(int math,int physic,int chemistry){ //setting the verbal notes
        this.math.verbalNote=math;
        this.physic.verbalNote=physic;
        this.chemistry.verbalNote=chemistry;
    }
    public void averageNotes(){
         this.average=(this.math.note+this.physic.note+this.chemistry.note)/3.0;
    }
    public boolean checkPass(){

         return this.average>55;
    }
    public void printNote(){
        System.out.println("-----------");
        System.out.println("Student "+this.name+" with student number "+this.stuNo);
        System.out.println("Math note \t\t="+this.math.note);
        System.out.println("Physic note \t="+this.physic.note);
        System.out.println("Chemistry note \t="+this.chemistry.note);
    }


}
