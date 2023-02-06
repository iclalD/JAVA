
public class Matrix {
    public static void main(String[] args) {

        int[][] array = new int[3][4];

        System.out.println();

        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                array[x][y] = (int) (Math.random() * 100);
                System.out.print("[" + array[x][y] + "] ");
            }
            System.out.println("\n");
        }
    }
}
