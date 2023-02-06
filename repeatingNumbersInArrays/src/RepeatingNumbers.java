public class RepeatingNumbers {
    static boolean isThere(int[] array, int value) {
        for (int i: array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3, 7, 3, 4, 3, 2, 4, 9, 10, 4, 16, 16, 21, 1, 16, 33, 9, 16, 1};
        int[] dublicate = new int[list.length];
        int[] dublicate1 = new int[list.length];
        int firstIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isThere(dublicate, list[i])) {
                        dublicate[firstIndex++] = list[i];
                        break;
                    } else if (!isThere(dublicate1, list[i]) && (list[i]) % 2 == 0) {
                        dublicate1[firstIndex++] = list[i];
                        break;
                    }
                }
            }
        }

        System.out.println("\nRepeating even numbers in the array: ");
        for (int i: dublicate1) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nRepeating numbers in the array: ");
        for (int i: dublicate) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
