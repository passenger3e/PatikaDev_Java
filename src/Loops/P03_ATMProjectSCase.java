package Loops;

import java.util.Scanner;

public class P03_ATMProjectSCase {
    public static void main(String[] args) {
        /*
        *User Name
        *password
        Hello, Welcome to Coding Bank!
        1-Cash Deposit
        2-Withdrawal
        3-Balance Inquiry
        4-Exit
        * Please enter the action you want to proceed
        * selection:
        * Amount of cash
        * Insufficient balance
        *
         */
        Scanner infoUser=new Scanner(System.in);
        String u_name="patika",u_password="dev123",userName,userPassword;
        int atm_Selection,u_Balance=1500,rigth=3;// you will have 3 times right that you are able to enter wrong password.
        int money;
        while(rigth>0){
            System.out.print("Please anter User Name: ");
            userName=infoUser.nextLine();
            System.out.print("Please enter the Password: ");
            userPassword=infoUser.nextLine();
            if (userName.equals(u_name)&&userPassword.equals(u_password)){
                System.out.println("Hello, Welcome to Coding Bank!");
                do{
                    System.out.println("1-Cash Deposit");
                    System.out.println("2-Withdrawal");
                    System.out.println("3-Balance Inquiry");
                    System.out.println("4-Exit");
                    System.out.println("Please enter the action you want to proceed: ");
                    atm_Selection=infoUser.nextInt();
                    switch (atm_Selection){
                        case 1: {
                            System.out.print("Amount of Cash: ");
                            money = infoUser.nextInt();
                            u_Balance += money;
                            System.out.println("Your new balance is: "+u_Balance);
                            break;
                        }
                            case 2: {
                                System.out.print("Amount of Cash: ");
                                money=infoUser.nextInt();
                                if(money>u_Balance){
                                    System.out.println("You don't have enough balance!");
                                }else{
                                u_Balance-=money;
                                }
                                break;
                        }
                        case 3: {
                            System.out.println("Your Balance is:  "+u_Balance);
                            break;
                        }

                    }

                }while(atm_Selection!=4);
                System.out.println("Hope to see you again!");
                break;
            }
            else{
                System.out.println("Entered User Name or Password is Wrong.\nPlease enter again!:");
                rigth--;
                if(rigth==0){
                    System.out.println("You entered your credentials wrong 3 times. your account has been blocked.\nPlease Contact With the Bank.");
                }
            }

        }


    }
}
