import java.util.Scanner;
import java.util.Arrays;

import static java.lang.System.out;

public class Transpose {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        int a = scan.nextInt();
        int b = scan.nextInt();
        */

        int index, index1;

        int[][] arr = new int[2][3];
        int[][] transpose = new int[3][2];

        for (int i = 0; i < 2; i++) {
            for (int k = 0; k < 3; k++) {
                index = scan.nextInt();
                arr[i][k] = index;
                transpose[k][i] = index;
            }
        }

        System.out.println();
        for (int i = 0; i < 2; i++) {
            for (int k = 0; k < 3; k++) {
                out.print(arr[i][k] + " ");
            }
            out.println();
        }

        out.println("Transpose: ");
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 2; k++) {
                out.print(transpose[i][k] + " ");
            }
            out.println();
        }
    }
}
