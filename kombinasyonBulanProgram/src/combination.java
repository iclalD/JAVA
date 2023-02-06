import java.util.Scanner;

public class combination {
    public static void main(String[] args) {
        Scanner comb = new Scanner(System.in);

        int n, r;

        System.out.print("Kombinasyon ifadesinin gösterimi, C(n,r) şeklindedir.\nLütfen 'n' sayısını giriniz: ");
        n = comb.nextInt();
        System.out.print("Lütfen 'r' sayısını giriniz: ");
        r = comb.nextInt();

        int t1 = 1, t2 = 1, t3 = 1;

        for (int i = 1; i <= n; i++) {
            t1 *= i;
        }

        for (int k = 1; k <= r; k++) {
            t2 *= k;
        }

        for (int l = 1; l <= (n-r); l++) {
            t3 *= l;
        }

        System.out.println("C(" + n + "," + r + "):" + t1 / (t2 * t3));
    }
}
