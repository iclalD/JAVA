import java.util.Arrays;

public class ArrayFrequency {
    public static boolean isThere(int[] arr, int val) {
        for (int i: arr) {
            if (i == val) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] duplicate = new int[array.length];
        int index = 0;

        System.out.println("Array: " + Arrays.toString(array));
        System.out.print("\nFrequency of the elements: \n");

        for (int i = 0; i < array.length; i++) {
            int repeat = 1;
            for (int k = 0; k < array.length; k++) {
                if ((i != k) && (array[i] == array[k])) {
                    repeat++;
                }
            }
            if (!isThere(duplicate, array[i])) {
                System.out.print("\n" + array[i] + " repeated " + repeat + " times.");
                duplicate[index++] = array[i];
            }
        }
    }
}
