import java.util.Scanner;
public class daire {
    public static void main(String[] args) {
        Scanner daire = new Scanner(System.in);

        int r, a;
        double pi=3.14, daireAlan, daireCevre;


        System.out.print("Dairenin yarıçapını giriniz: ");
        r = daire.nextInt();

        daireAlan = r * pi * r;
        daireCevre = 2*pi*r;

        System.out.println("Dairenin Çevresi: " + daireCevre);
        System.out.println("Dairenin Alanı: " + daireAlan);
        System.out.print("Daire Diliminin açısını giriniz: ");
        a = daire.nextInt();

        double daireDilimiAlani = (pi*( r * r )* a)/360;

        System.out.println("Daire Diliminin Alanı: " +daireDilimiAlani);
    }
}