import java.util.Scanner;

public class asal {
    static int asal(int n) {
        int sonuc = 0, a = 2;
        if ((n == 2) || (n == 3)) {
            sonuc = 1;
            return sonuc;
        } else if (n < 2) {
            sonuc = 2;
            return sonuc;
        } else {
            boolean q = true;
            while (a < n) {
                if (n % a == 0) {
                    q = false;
                    sonuc = 0;
                    break;
                }
                a++;
            }
            if (q) {
                sonuc = 1;
            }
        }
        return sonuc;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        while (true) {
            System.out.print("Sayı giriniz:");
            int sayı = inp.nextInt();
            if (asal(sayı) == 1) {
                System.out.println(sayı + " asal sayıdır!");
            } else if (asal(sayı) == 0) {
                System.out.println(sayı + " asal sayı değildir!");
            } else if (asal(sayı) == 2) {
                System.out.println("En küçük asal sayı 2'dir!");
            }
        }
    }
}
