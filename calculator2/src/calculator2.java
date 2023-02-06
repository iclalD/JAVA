import java.util.Scanner;

public class calculator2 {
    public static void main(String[] args) {

        Scanner hesapMakinesi = new Scanner(System.in);

        int n1,n2,select;

        System.out.print("İlk sayıyı giriniz: ");
        n1 = hesapMakinesi.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = hesapMakinesi.nextInt();

        System.out.println("1.Toplama\t2.Çıkarma\t3.Çarpma\t4.Bölme");
        System.out.print("Seçiniz:");
        select = hesapMakinesi.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam: " + n1+n2);
                break;
            case 2:
                System.out.println("Fark: " + (n1-n2));
                break;
            case 3:
                System.out.println("Çarpım: " + (n1*n2));
                break;
            case 4:
                switch (n2){
                    case 0:
                        System.out.println("Bir sayı 0'a bölünemez.");
                    default:
                        System.out.println("Bölüm: " + (n1/n2));
                        break;
                }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız, lütfen tekrar deneyiniz.");
                break;
        }
    }
}
