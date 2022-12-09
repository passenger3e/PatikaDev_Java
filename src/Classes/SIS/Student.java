package Classes.SIS;

public class Student {
    //int classes;
    double average;
    String name,stuNo,classes;
    Course math,physic,chemistry;
    boolean isPass;
     Student(String name,String stuNo,String classes,Course math,Course physic,Course chemistry){
        this.name=name;
        this.stuNo=stuNo;
        this.math=math;
        this.physic=physic;
        this.chemistry=chemistry;
        this.classes=classes;

        this.isPass=false;
    }
     void isPass(){
        calculateNote();
         if(this.math.note==0||this.math.verbalNote==0||this.physic.note==0||this.physic.verbalNote==0||this.chemistry.note==0||this.chemistry.verbalNote==0){
             System.out.println("Some notes were not entered the system!");
         }else{
             this.isPass=checkPass();
            // printNote();
             System.out.println("Average is : "+this.average);
             if(isPass){
                 System.out.println("Passed the class!");
             }else
                 System.out.println("Failed the class!");
         }
    }
     void calculateNote(){
                this.math.note=this.math.examNote*(1-this.math.percentage)+this.math.verbalNote*this.math.percentage;
                this.physic.note=this.physic.examNote*(1-this.physic.percentage)+this.physic.verbalNote*this.physic.percentage;
                this.chemistry.note=this.chemistry.examNote*(1-this.chemistry.percentage)+this.math.verbalNote*this.chemistry.percentage;
                averageNotes();
    }
     void addExamNote(int _math,int _physic,int _chemistry){ //setting the written exam notes
        math.examNote=_math; //adding notes related to classes
        physic.examNote=_physic;
        chemistry.examNote=_chemistry;
        calculateNote();

    }
     void verbalNotes(int math,int physic,int chemistry){ //setting the verbal notes
        this.math.verbalNote=math;
        this.physic.verbalNote=physic;
        this.chemistry.verbalNote=chemistry;
        calculateNote();
    }
     void averageNotes(){
         this.average=(this.math.note+this.physic.note+this.chemistry.note)/3.0;
    }
     boolean checkPass(){

         return this.average>55;
    }
     void printNote(){
        System.out.println("------------------------");
        System.out.println("Student -"+this.name+"- with student number -"+this.stuNo+"-");
        System.out.println("Math note \t\t="+this.math.note);
        System.out.println("Physic note \t="+this.physic.note);
        System.out.println("Chemistry note \t="+this.chemistry.note);
        isPass();
    }

}