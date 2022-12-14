package Classes.SalaryCalculator;

public class Employee {
    String name;
    int hireYear;
    int salary;
    int workHours;
    Employee(String _name,int _hireYear,int _salary,int _workHours){
        this.name=_name;
        this.hireYear=_hireYear;
        this.salary=_salary;
        this.workHours=_workHours;

    }
    double tax(){
        return (this.salary>1000 ?(this.salary*0.03):0);
    }
    int bonus(){
        return this.workHours>40?(this.workHours-40)*30:0;
    }
    double raiseSalary(){
        double raise;
        if((2021-this.hireYear)>=20)
            raise=this.salary*0.15;
        else if((2021-this.hireYear)>=10)
            raise=this.salary*0.10;
        else raise=this.salary*0.05;

        return raise;
    }
    public String toString(){
        System.out.println("Name: "+this.name);
        System.out.println("Salary: "+this.salary);
        System.out.println("Working hour in a week: "+this.workHours);
        System.out.println("Starting Year: "+this.hireYear);
        System.out.println("Tax: "+tax());
        System.out.println("Bonuses: "+bonus());
        System.out.println("Salary increase: "+raiseSalary());
        System.out.println("Salary with tax and bonuses: "+(this.salary+bonus()-tax()));
        System.out.println("Total Salary: "+(this.salary+bonus()-tax()+raiseSalary()));
        System.out.println("-------------------------------");
        return null;
    }
}
