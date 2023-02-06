import java.util.Scanner;

public class kdvTutariHesaplama {
    public static void main(String[] args) {
        double kdvsizFiyat, kdvYuzdesi, kdvTutarı, kdvliFiyat;

        Scanner fiyat = new Scanner(System.in);
        System.out.print("Ürün Fİyatı: ");
        kdvsizFiyat = fiyat.nextDouble();

        kdvYuzdesi = (kdvsizFiyat <= 1000)? 0.18 : 0.08;
        kdvTutarı = kdvsizFiyat * kdvYuzdesi;
        kdvliFiyat = kdvsizFiyat + kdvTutarı;

        System.out.println("Ürünün KDVsiz fiyatı: " +kdvsizFiyat);
        System.out.println("Ürünün KDV yüzdesi: " +kdvYuzdesi);
        System.out.println("Ürünün KDV tutarı: " +kdvTutarı);
        System.out.println("Ürünün KDVli fiyatı: " +kdvliFiyat);

    }
}