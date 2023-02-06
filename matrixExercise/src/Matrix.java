import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] array = new int[5][3];

        System.out.println("Please enter " + array.length + " rows and " + array[0].length + " columns.");

        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                System.out.print("[" + x + "][" + y + "]: ");
                array[x][y] = scan.nextInt();
            }
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                System.out.print("[" + array[i][k] + "]");
            }
            System.out.println();
        }
    }
}
