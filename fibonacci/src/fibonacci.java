import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter the number of components in the series: ");
        int number = inp.nextInt();
        int k = 0;
        int a = 1;
        int result = 0;

        System.out.println("Fibonacci series with " + number + " components:");
        System.out.print("0 1 ");
        for (int i = 0; i < number - 2; i++) {
            result = k + a;
            k = a;
            a = result;
            System.out.print(result + " ");
        }
    }
}
