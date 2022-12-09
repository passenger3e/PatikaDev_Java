package Classes.SIS;
import java.util.Scanner;

public class P05_StudentInfoSystem {
    public static void main(String[] args) {
        String name, branch, mpNo,selection,options;
        Scanner createPerson = new Scanner(System.in);
        int mathPercentage = 30, physicPercentage = 40, chemPercentage = 20;
        Course math = new Course("Math", "MAT01", "MTH", mathPercentage);//creating courses
        Course physic = new Course("Physic", "PHY01", "PHY", physicPercentage);
        Course chemistry = new Course("Chemistry", "CHM01", "CHM", chemPercentage);


        Teacher t1 = new Teacher("Ali", "MTH", "05555555");
        Teacher t2 = new Teacher("Jack", "PHY", "055050050");
        Teacher t3 = new Teacher("Martin", "CHM", "050002520");
        math.addTeacher(t1); //adding teachers to related branches
        physic.addTeacher(t2);
        chemistry.addTeacher(t3);
        SISManager manage=new SISManager(math,physic,chemistry);

        System.out.println("/******************/");
        options = """
                    0- Exit
                    1- Add Student
                    2- Student Info
                    3- Enter Exam Notes
                    4- Enter Verbal Notes
                    5- Modify Teacher Info
                    ^
                    """;
        do {
            System.out.println(options);
            System.out.print("Select an option!\nSelection: ");
            selection=createPerson.nextLine();
            if(selection.equals("0")){
                System.out.println("Exiting...!");
                break;
            }
            else if(selection.equals("1")||selection.equals("2")||selection.equals("3")||selection.equals("4")||selection.equals("5")){
                switch (selection){
                    case "1" -> {
                        System.out.println("Menu - Add Student");
                        manage.setStudent();
                    }
                    case "2" -> {
                        System.out.println("Menu - Student Info");
                        manage.getStudent();
                    }
                    case "3" -> {
                        System.out.println("Menu - Exam Notes");
                        manage.manageStudent("E");
                    }
                    case "4" -> {
                        System.out.println("Menu - Verbal Notes");
                        manage.manageStudent("V");
                    }
                    case "5" -> {
                        System.out.println("Menu - Modify Teacher Info");
                        manage.manageTeacher(t1,t2,t3);
                    }
                    default -> {}

                }
            }
        }while(true);
    }

}
