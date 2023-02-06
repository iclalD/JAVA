import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner cross = new Scanner(System.in);

        System.out.print("Number of lines: ");
        int n = cross.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int l = 0; l < n - i; l++) {
                System.out.print(" ");
            }
            for (int m = 2 * i - 1; m > 0; m --) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
