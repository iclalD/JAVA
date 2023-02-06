import java.util.Scanner;

public class sayılar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen sayıyı giriniz:" );
        int number = input.nextInt();
        int tempnumber = number;
        int digit = 0;
        int value, a = 0;

        // a = sonuç, digit = basamak sayısı

        while (tempnumber != 0) {
            tempnumber /= 10;
            digit++;
        }

        tempnumber = number;
        while (tempnumber != 0) {
            value = tempnumber % 10;
            a += value;
            tempnumber /= 10;
        }
        System.out.println(a);
    }
}
