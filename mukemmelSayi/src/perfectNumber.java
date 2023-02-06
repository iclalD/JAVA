import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = inp.nextInt();
        int a = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                a += i;
            }
        }
        if (a == number) {
            System.out.println( number + " is a perfect number.");
        } else {
            System.out.println( number + " is not a perfect number.");
        }
    }
}
