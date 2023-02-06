import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int result = 1;
        int series1 = 0, series2 = 0;

        for (int i = 1; i <= t; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();

            for (int k = 1; k <= n; k++) {
                if (k == 1) {
                    result = 1;
                } else {
                    result *= 2;
                }
                series1 += result * b;
                series2 = a + series1;
                System.out.print(series2 + " ");
            }
            result = 1;
            series1 = 0;
            series2 = 0;
            System.out.println(" ");
        }
    }
}