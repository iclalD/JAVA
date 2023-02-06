import java.util.Scanner;

public class CiftveDordunKatiToplama {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);

        int p, total = 0;

        do {
            System.out.print("Enter a number: ");
            p = numbers.nextInt();
            if (p % 4 == 0) {
                total += p;
            }
        } while (p % 2 == 0);

        System.out.println("TOTAL:" + total);
    }
}
