import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1,n2,selection;

        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.println("1. Toplama\t2. Çıkarma\t3. Çarpma\t4. Bölme");
        System.out.print("Seçiniz: ");
        selection = input.nextInt();

        if (selection==1) {
            System.out.print("Toplam: " + (n1 + n2));
        } else if (selection==2) {
            System.out.print("Fark: " + (n1 - n2));
        } else if (selection==3) {
            System.out.print("Çarpım: " + (n1*n2));
        } else if (selection==4) {
            if (n2 == 0) {
                System.out.print("Bir sayı 0'a bölünemez.");
            } else {
                System.out.print("Bölüm: " + (n1 / n2));
            }
        } else {
            System.out.print("Yanlış seçim yaptınız, tekrar deneyiniz.");
        }
    }
}