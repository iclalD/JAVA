import java.util.Scanner;
import java.lang.String;

public class KullanıcıGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username, password, choose,yesorno, newpassword;


        System.out.print("Username: ");
        username = input.nextLine();

        System.out.print("Password: ");
        password = input.nextLine();

        if (username.equals("KullanıcıGirisi") && password.equals("java456")) {
            System.out.println("Logged in succesfully.");
        } else {
            System.out.println("Incorrect password.\nWould you like to reset the password? (yes or no)");
            yesorno=input.nextLine();

            if (yesorno.equals("no")) {
                System.out.println("Have a nice day!");
            } else if (yesorno.equals("yes")) {
                System.out.println("Please enter your new password: ");
                newpassword=input.nextLine();
                if (newpassword.equals(password) || newpassword.equals("java456")) {
                    System.out.print("New password can not be same with your old password or the password you just entered incorrectly.\nPlease try something else:");
                    newpassword = input.nextLine();
                    if (newpassword.equals(password) || newpassword.equals("java456")) {
                        System.out.println("New password can not be same with your old password or the password you just entered incorrectly.\nPlease try something else.");
                    } else {
                        System.out.println("New password created succesfully.");
                    }
                } else {
                    System.out.println("New password created succesfully.");
                }
            }
        }
    }
}
