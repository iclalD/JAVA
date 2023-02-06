import java.util.Scanner;

public class _4ve5inKuvvetleriniBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Please enter a number: ");
        n = input.nextInt();

        System.out.println("Exponents of 4");
        for (int i = 1; i <= n; i *= 4) {
            System.out.print(i + ", ");
        }

        System.out.println("\nExponents of 5");
        for (int i = 1; i <= n; i *= 5) {
            System.out.print(i + ", ");
        }
    }
}
