import java.util.Scanner;
import java.util.Arrays;

public class ClosestMaxMin {
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        System.out.print("Please enter a number: ");
        int number = java.nextInt();

        int distance = 0;
        int distance2 = 0;

        for (int i : list) {
            if (number > i) {
                distance = number - i;
            } else if (i > number) {
                distance2 = i - number;
                break;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + (number - distance));
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + (number + distance2));
    }
}
