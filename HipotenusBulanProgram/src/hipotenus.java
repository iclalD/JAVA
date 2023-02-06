import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args) {
        double aKenarı, bKenarı, cKenarı, alan, cevre;

        Scanner hipotenus = new Scanner(System.in);

        System.out.print("a kenarının uzunluğu: ");
        aKenarı = hipotenus.nextDouble();

        System.out.print("b kenarının uzunluğu: ");
        bKenarı = hipotenus.nextDouble();

        cKenarı = Math.sqrt((aKenarı*aKenarı) + (bKenarı*bKenarı));
        System.out.println("c kenarının uzunluğu: " +cKenarı);

        cevre = aKenarı+bKenarı+cKenarı;
        System.out.println("Çevre: " +cevre);
        alan = Math.sqrt((cevre/2)*(cevre/2-aKenarı)*(cevre/2-bKenarı)*(cevre/2-cKenarı));
        System.out.println("Alan: " +alan);
    }
}
