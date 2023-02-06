import java.util.Scanner;

public class NotOrtalama {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz:");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz:");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuz:");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuz:");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuz:");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;

        System.out.println("Ortalamanız: " +sonuc);

        boolean kosul = sonuc >= 60;
        String gectiMi = kosul ? "Sınıfı geçti." : "Sınıfta kaldı.";
        System.out.println(gectiMi);
    }
}
