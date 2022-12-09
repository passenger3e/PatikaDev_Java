package Classes.SIS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SISManager {
    String name, branch, mpNo,classes,stuNo;
    Course math,physic,chemistry;
    //boolean isEnteredExam=false,isEnteredVerbal=false;
    int i=1;
    Scanner scan=new Scanner(System.in);
    //Map is interface.HashMAp is a class and we need a class
    Map<String, Teacher> map = new HashMap<>();//to create objects dynamically
    Map<String, Student> mapStudent = new HashMap<>();
        SISManager (Course math,Course physic,Course chemistry){
        this.math=math;
        this.physic=physic;
        this.chemistry=chemistry;
        }
        SISManager(){

        }
        public void setStudent(){ //String name,String stuNo,int classes,Course math,Course physic,Course chemistry

            do {


                System.out.print("Please enter Name: ");
                name = scan.nextLine();
                //new SISManager();
                System.out.print("Please enter Student Number: ");
                stuNo = scan.nextLine();
                System.out.print("Please enter Class: ");
                classes = scan.nextLine();

                mapStudent.put("s" + i, new Student(name, stuNo, classes,math,physic,chemistry));//creating a Teacher dynamically
                System.out.print("Would you like to add another Student?(Y/N): ");
                if(scan.nextLine().equals("N")) break;
                else System.out.println("---------------");
                ++this.i;
            }while (true);
        }
        public void getStudent(){
            if(mapStudent.isEmpty()){
                System.out.println("There is no Student in the classes at the moment!");
            }
            else {
                mapStudent.forEach((k, v) -> mapStudent.get(k).printNote());// prints all students' notes from map
                System.out.println("--");
            }
        }
        //Modify the teacher
        public void manageTeacher(Teacher t1,Teacher t2,Teacher t3){ // String name,String branch,String mpNo
            String tName="",cnt="t1";
            Teacher t=t1;
            boolean isCourse=false;
            do{
                System.out.print("Enter the branch(MTH,PHY,CHM): ");
                branch=scan.nextLine();
                switch (branch) {
                    case "MTH" -> {
                        tName = t1.name;
                        cnt = "t1";
                        isCourse = true;
                    }
                    case "PHY" -> {
                        tName = t2.name;
                        cnt = "t2";
                        t = t2;
                        isCourse = true;
                    }
                    case "CHM" -> {
                        tName = t3.name;
                        cnt = "t3";
                        t = t3;
                        isCourse = true;
                    }
                    default -> System.out.println("Enter correctly!");
                }
            }while(!isCourse);

                System.out.print("Please enter Name: ");
                name = scan.nextLine();
                t.name=name;
                new SISManager();
                System.out.print("Please enter Phone number: ");
                mpNo = scan.nextLine();
                t.phoneNumber=mpNo;
                map.put(cnt,t); //I can update the anything related to teacher because of getting all created teachers passed
            System.out.println("Teacher "+tName+" has been modified with "+t.name);
        }
        public void manageStudent(String n) { //Takes Course notes
            mapStudent.forEach((k,v)-> System.out.println("Student name and Number is: "+mapStudent.get(k).name+" - "+mapStudent.get(k).stuNo)) ;//prints all students in map
            Student st;
            String stNumber;

            int math,physic,chemistry;
            boolean isVerbal=false;

            if (n.equals("E")){ //to take Exam notes
                System.out.print("Enter student number to enter exam notes:");
                stNumber=scan.nextLine();
                System.out.println("Enter Exam Notes.");
                for (Map.Entry<String, Student> entry : mapStudent.entrySet()) {
                    if(mapStudent.get(entry.getKey()).stuNo.equals(stNumber)){
                        System.out.print("Math: ");
                        math=scan.nextInt();
                        System.out.print("Physic: ");
                        physic=scan.nextInt();
                        System.out.print("Chemistry: ");
                        chemistry=scan.nextInt();
                        scan.nextLine();
                        st=entry.getValue();
                        st.addExamNote(math,physic,chemistry);
                        mapStudent.put(entry.getKey(),st);
                        //mapStudent.get(entry.getKey()).addExamNote(math,physic,chemistry);
                        System.out.print("Would you like to enter verbal notes(Y/N): ");
                        stNumber= scan.nextLine();
                        isVerbal=stNumber.equals("Y");

                    }
                    //System.out.println(entry.getKey() + "/" + entry.getValue());
                }
            }
            if(n.equals("V")|| isVerbal){ //to take verbal notes this is also executed directly when it is decided in exam note entry section without going main menu
                System.out.print("Enter student number to enter verbal notes:");
                stNumber=scan.nextLine();
                System.out.println("Enter Verbal Notes.");
                for (Map.Entry<String, Student> entry : mapStudent.entrySet()) {//searches all students to enter the notes
                    //System.out.println("No:"+mapStudent.get(entry.getKey()).stuNo);
                    //System.out.println(mapStudent.get(entry.getKey()).math.examNote);
                    //depending on the expected key, map brings the desired student object and compares the student number
                    if(entry.getValue().stuNo.equals(stNumber)){//directly brings the student object and compares
                    //if(mapStudent.get(entry.getKey()).stuNo.equals(stNumber)){ //depends on the student number, excepts the notes
                        System.out.print("Math: ");
                        math=scan.nextInt();
                        System.out.print("Physic: ");
                        physic=scan.nextInt();
                        System.out.print("Chemistry: ");
                        chemistry=scan.nextInt();
                        scan.nextLine();
                       // mapStudent.put(entry.getKey(),)
                        st=entry.getValue();//sets student object
                        st.verbalNotes(math,physic,chemistry);
                        mapStudent.put(entry.getKey(),st);//puts the student object which notes' are entered
                       // mapStudent.get("s1").verbalNotes(math,physic,chemistry);

                    }
                    //System.out.println("-"+entry.getKey()+"-");
                }
            }
            //mapStudent.forEach((k,v)-> System.out.println("Student name and Number is: "+mapStudent.get(k).stuNo+" -e "+mapStudent.get(k).math.examNote+" -v "+mapStudent.get(k).math.verbalNote+" -n "+mapStudent.get(k).math.note)) ;
        }


    }
