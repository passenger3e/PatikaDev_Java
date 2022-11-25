package Classes.SIS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P05_StudentInfoSystem {
    public static void main(String[] args) {
        Scanner createPerson = new Scanner(System.in);
        int mathPercentage = 30, physicPercentage = 40, chemPercentage = 20;
        Course math = new Course("Math", "MAT01", "MTH", mathPercentage);//creating courses
        Course physic = new Course("Physic", "PHY01", "PHY", physicPercentage);
        Course chemistry = new Course("Chemistry", "CHM01", "CHM", chemPercentage);


        Teacher t1 = new Teacher("Ali", "MTH", "05555555");
        Teacher t2 = new Teacher("Jack", "PHY", "055050050");
        Teacher t3 = new Teacher("Martin", "CHM", "050002520");
        math.addTeacher(t1); //adding teachers to related branches
        math.printTeacher();
        physic.addTeacher(t2);
        physic.printTeacher();
        chemistry.addTeacher(t3);
        chemistry.printTeacher();
        Student s1 = new Student("Batuhan", "8144", 3, math, physic, chemistry); //creating students with default configured classes

        s1.addExamNote(90, 55, 65);//assigning course notes
        s1.verbalNotes(80, 80, 55);
        s1.isPass();
        String name, branch, mpNo;

        System.out.println("Enter '0' as Name to Exit!");
        //Map is interface,HashMAp is a class and we need a class
        Map<String, Teacher> map = new HashMap<>();//to create objects dynamically
        int i = 3;// up to t3, objects created above so this starts with 3
        do {
            ++i;
            System.out.print("Please enter Name: ");
            name = createPerson.nextLine();
            if (name.equals("0")) {
                --i;
                System.out.println("Exiting...!");
                break;
            }
            System.out.print("Please enter Branch (MTH/PHY/CHM): ");
            branch = createPerson.nextLine();
            System.out.print("Please enter Phone number: ");
            mpNo = createPerson.nextLine();
            map.put("t" + i, new Teacher(name, branch, mpNo));//creating a Teacher dynamically
            if (branch.equals("MTH"))
                math.addTeacher(map.get("t" + i)); //And assigning the teacher to the class
            if (branch.equals("PHY"))
                physic.addTeacher(map.get("t" + i));
            if (branch.equals("CHM"))
                chemistry.addTeacher(map.get("t" + i));


        } while (true);
        if (i > 3) { //Just checking if the Teacher is created
            System.out.println(map.get("t" + i).name);
            System.out.println(map.get("t" + i).branch);
            System.out.println(map.get("t" + i).phoneNumber);
            math.printTeacher();//So same class can't have two teacher and after second assignment teacher information has been changed
        }

    }

}
