import java.util.Scanner;

public class sıralama {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sayılar = new Scanner(System.in);

        System.out.print("Enter the first number, a: ");
        a = sayılar.nextInt();

        System.out.print("Enter the second number, b: ");
        b = sayılar.nextInt();

        System.out.print("Enter the third number, c: ");
        c = sayılar.nextInt();

        if ((a < b) & (a < c)) {
            if (b < c) {
                System.out.print("a < b < c");
            } else {
                System.out.print("a < c < b");
            }
        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.print("b < a < c");
            } else {
                System.out.print("b < c < a");
            }
        }else {
            if (a < b) {
                System.out.print("c < a < b");
            }else {
                System.out.print("c < b < a");
            }
        }
    }
}
