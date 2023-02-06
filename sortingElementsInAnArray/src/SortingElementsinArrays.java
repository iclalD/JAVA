import java.util.Arrays;
import java.util.Scanner;

public class SortingElementsinArrays {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("\nEnter the array length: ");
        int length = inp.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter the " + (i + 1) + ". element of the array: ");
            int element = inp.nextInt();
            array[i] = element;
        }

        Arrays.sort(array);

        System.out.println("\nSorted array:");
        for (int i: array) {
            System.out.print(i + " ");
        }
    }
}