import java.util.Scanner;

public class harmony {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        double n = inp.nextInt();
        double a = 0;
        double b = 1;

        for (int i = 1; i <= n; i++) {
            b /= i;
            a += b;
            b = 1;
            System.out.println(a);
        }
    }
}
