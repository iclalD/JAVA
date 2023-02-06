import java.util.Scanner;

public class fibonacci {
    static int fib(int n) {
        if ((n == 1) || (n == 2)) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = inp.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.println(fib(i));
        }
    }
}
