import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, total = 1;
        System.out.print("Please enter a number to calculate its factorial: ");
        n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        System.out.println(n + " factorial: " + total);
    }
}
