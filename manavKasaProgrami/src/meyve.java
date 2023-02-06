import java.util.Scanner;

public class meyve {
    public static void main(String[] args) {
        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5;
        double a,e,d,m,p;

        Scanner manav = new Scanner(System.in);
        System.out.print("Armut (kg): " );
        a = manav.nextDouble();
        System.out.print("Elma (kg): ");
        e = manav.nextDouble();
        System.out.print("Domates (kg): ");
        d = manav.nextDouble();
        System.out.print("Muz (kg): ");
        m = manav.nextDouble();
        System.out.print("Patlıcan (kg): ");
        p = manav.nextDouble();

        double toplam = (a*armut) + (e*elma) + (d*domates) + (m*muz) + (p*patlican);
        System.out.println("Toplam Tutar: " +toplam);
    }
}
