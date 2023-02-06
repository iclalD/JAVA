import java.util.Scanner;

public class exponent {
    static void data() {
        Scanner inp = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the base: ");
            int base = inp.nextInt();
            System.out.print("Enter the exponent: ");
            int exponent = inp.nextInt();
            int result = 1;

            for (int i = 1; i <= exponent; i++) {
                result *= base;
            }
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        data();
    }
}
