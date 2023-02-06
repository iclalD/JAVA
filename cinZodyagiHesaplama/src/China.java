import java.util.Scanner;

public class China {
    public static void main (String[] args) {

        Scanner zodiac = new Scanner(System.in);

        int birthYear;

        System.out.print("Enter the year you were born: ");
        birthYear = zodiac.nextInt();
        System.out.print("Your Chinese zodiac is  ");

        if (birthYear % 12 == 0) {
            System.out.println("MONKEY");
        } else if (birthYear % 12 == 1) {
            System.out.println("ROOSTER");
        } else if (birthYear % 12 == 2) {
            System.out.println("DOG");
        } else if (birthYear % 12 == 3) {
            System.out.println("PIG");
        } else if (birthYear % 12 == 4) {
            System.out.println("RAT");
        } else if (birthYear % 12 == 5) {
            System.out.println("BULLOCK");
        } else if (birthYear % 12 == 6) {
            System.out.println("TIGER");
        } else if (birthYear % 12 == 7) {
            System.out.println("RABBIT");
        } else if (birthYear % 12 == 8) {
            System.out.println("DRACO");
        } else if (birthYear % 12 == 9) {
            System.out.println("SNAKE");
        } else if (birthYear % 12 == 10) {
            System.out.println("HORSE");
        } else if (birthYear % 12 == 11) {
            System.out.println("SHEEP");
        }
    }
}
