package Classes.SIS;

public class Course {
    String name,code,prefix;
    int examNote,verbalNote;
    double note,percentage;
    Teacher teacher;//every course has a teacher and will be added with a method below.
     Course(String name,String code,String prefix,int percentage){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
        this.verbalNote=0;
        this.examNote=0;
        this.percentage=percentage*0.01;


    }
    public void addTeacher(Teacher t){ //Adding a teacher to related branch
        if(this.prefix.equals(t.branch)){
            this.teacher=t;
            System.out.println("Teacher Successfully added");
        }
        else
            System.out.println("This Teacher can't be added!.");
    }
    public void printTeacher(){ //will print the teacher info related to the branch
        if(teacher!=null){
            System.out.println(this.name+" class teacher: "+teacher.name);
        }
        else System.out.println(this.name+" has No assigned Teacher for the class yet");
    }
}
