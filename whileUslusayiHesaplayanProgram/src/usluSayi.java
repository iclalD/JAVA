import java.util.Scanner;

public class usluSayi {
    public static void main(String[] args) {
        Scanner us = new Scanner(System.in);

        int a, b;

        System.out.print("Lütfen bir sayı giriniz: ");
        a = us.nextInt();
        System.out.print(a + " sayısının kaçıncı kuvveti: ");
        b = us.nextInt();

        int total = 1;

        for (int i = 1; i <= b; i++) {
            total *= a;
        }
        System.out.print(total);

        /*
        int i = 1, total = 1;

        while (i <= b) {
            total *= a;
            i++;
        }
        System.out.println(total);
        */


    }
}
