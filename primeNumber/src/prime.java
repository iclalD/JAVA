import java.util.Scanner;

public class prime {
    static void iclal() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Sayı: ");
            int number = scan.nextInt();
            int b = 2;
            if ((number == 2) || (number == 3)) {
                System.out.println(number + " asal sayıdır!");
            } else {
                while (b < number) {
                    if (number <= 1) {
                        System.out.println("En küçük asal sayı 2'dir.");
                    } else if (number % b == 0) {
                        System.out.println(number + " asal sayı değildir!");
                        break;
                    } else {
                        System.out.println(number + " asal sayıdır!");
                        break;
                    }
                    b++;
                }
            }


        }
    }

    public static void main(String[] args) {
        iclal();
    }
}