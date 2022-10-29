package ConditionalStatementsAndBlocks;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class P02_PasswordRequestAnCheck {
    public static void main(String[] args) {
        /*
        Ödev
        Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
        eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği
        ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
        şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
         sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
         */
        /*
        1 ask for username and password
        2 true> login false> ask for if wants to change password
        3 if you want let the password entered
        4 check if the passwwords is same as wrong entered one or previsous password if it is ask for again
        5 if everything checks out set the password
         */
        Scanner getIdentfication=new Scanner(System.in);
        String userName,password,YesOrNo,newPassword,setPassword="java123";
        System.out.print("Please enter Username: ");
        userName=getIdentfication.nextLine();
        System.out.print("Please enter password: ");
        password=getIdentfication.nextLine();
        if(userName.equals("java01")&&password.equals(setPassword)){
            System.out.println("You logged in.");
        }else if(userName.equals("java01")){



                do{
                    System.out.print("Would yuo like to change the password?(Y/N): ");
                    YesOrNo=getIdentfication.nextLine();
                }
                while(!(YesOrNo.equals("Y")||YesOrNo.equals("N")));

                if(YesOrNo.equals("Y")) {
                    System.out.print("Please enter new password(cant be same as previous one and wrong entered one): ");
                    newPassword = getIdentfication.nextLine();
                    while (newPassword.equals(password) || newPassword.equals(setPassword)) {
                        System.out.print("Password couldn't be set, Please enter another password: ");
                        newPassword = getIdentfication.nextLine();
                    }

                    setPassword = newPassword;
                    System.out.println("New password is set successfully!");
                }else{
                    System.out.println("You skipped to Password Changing settings.");
                }


        }
        else {
            System.out.println("User name is wrong.. Closing the Request.");
        }




    }
}
