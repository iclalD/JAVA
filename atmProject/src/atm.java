import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner project = new Scanner(System.in);

        String userName, password;
        int right = 3;
        int balance = 10000;
        int price;

        while (right > 0) {
            System.out.print("Username: ");
            userName = project.nextLine();
            System.out.print("Password: ");
            password = project.nextLine();

            if (userName.equals("iclal") && password.equals("developer")) {
                System.out.println("WELCOME TO THE HANDKERCHIEF BANK! ");
                int select;
                do {
                    System.out.println("1. Withdrawal\n" +
                            "2. Deposit\n" +
                            "3. Balance check\n" +
                            "4. Card refund");
                    System.out.print("Please select: ");
                    select = project.nextInt();
                    if ((select <= 0) || (select >= 5)) {
                        System.out.println("1, 2, 3 and 4 are your options.");
                    } else if (select == 1) {
                        System.out.print("Amount: ");
                        price = project.nextInt();
                        if (price > balance) {
                            System.out.println("You can not require money over your balance.");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 2) {
                        System.out.print("Amount: ");
                        price = project.nextInt();
                        balance += price;
                    } else if (select == 3) {
                        System.out.println("Balance: " + balance);
                    } else if (select == 4) {
                        System.out.println("Have a nice day :).");
                    }
                } while (select != 4);
                break;
            } else {
                right--;
                if (right < 1) {
                    System.out.println("Your remaining trial: " + right + "Your account has been blocked.");
                } else {
                    System.out.println("Your remaining trial: " + right + "\n(clue: username: iclal\npassword: developer)");
                }
            }
        }
    }
}
