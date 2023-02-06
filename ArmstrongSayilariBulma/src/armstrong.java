import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int number = numbers.nextInt();

        int tempnumber = number;
        int digit = 0;
        int pow, value, result = 0;

        while (tempnumber != 0) {
            tempnumber /= 10;
            digit++;
        }

        tempnumber = number;
        while (tempnumber != 0) {
            value = tempnumber % 10;
            pow = 1;
            for (int i = 1; i <= digit; i++) {
                pow *= value;
            }
            result += pow;
            tempnumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " bir Armstrong sayı değildir.");
        }
    }
}