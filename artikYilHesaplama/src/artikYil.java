import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int artikyil;

        System.out.print("Please enter the year 'that you want to find out if it is leap year':");
        artikyil = input.nextInt();

        if ((artikyil % 4 == 0) && (artikyil % 100 != 0)) {
            System.out.println(artikyil + " is a leap year.");
        } else if ((artikyil % 100 == 0) && (artikyil % 400 == 0)) {
            System.out.println(artikyil + "is a leap year.");
        } else {
            System.out.println(artikyil + "is not a leap year.");
        }
    }
}
