import java.util.Scanner;

public class CiftSayiBulma {
    public static void main(String[] args) {
        int k;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz:");
        k = input.nextInt();

        int sum = 0, counter = 0;

        int i = 1;
        while (i <= k) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                sum += i;
            }
            i++;
            counter++;
        }


        /* Solution2
        int i = 1;
        do {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                sum += i;
            }
            i++;
            counter++;
        } while (i <= k);
        */


        /* Solution3
        for (int i = 1; i <= k; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                sum += i;
            }
            counter++;
        }
        */

        double average = sum / counter;
        if (sum != 0) {
            System.out.println("1'den " + k + " sayısına kadar olan (mod3,4=0) sayıların ortalaması: " + average);
        } else if (sum < 12) {
            System.out.println("1'den " + k + " sayısına kadar olan (mod3,4=0) sayıların içinde 3'e ve 4'e bölünebilen sayı yoktur.");
        } else {
            System.out.println("1'den " + k + " sayısına kadar olan (mod3,4=0) sayıların içinde 3'e ve 4'e bölünebilen sayı yoktur.");
        }
    }
}

