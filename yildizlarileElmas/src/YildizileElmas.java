import java.util.Scanner;

public class YildizileElmas {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n = klavye.nextInt();
        int tempn = n;

        for (int i = 1; i <= n ; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println( );
        }

        for (int i = n - 1; i >= 1 ; i--) {
            for (int t = 1; t <= n - i; t++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= 2*i - 1; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}