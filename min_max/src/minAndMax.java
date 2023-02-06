import java.util.Scanner;

public class minAndMax {
    public static void main(String[] args) {
        Scanner numb = new Scanner(System.in);

        System.out.print("How many numbers you'll enter: ");
        int number = numb.nextInt();
        int min = 0, max = 0;
        int add;
        int i = 1;

        while (i <= number) {
            if (i == 1) {
                System.out.print("Please enter 1. number:");
                add = numb.nextInt();
                min = add;
                max = add;
            } else if (i > 1) {
                System.out.print("Please enter " + i + ". number:");
                add = numb.nextInt();
                if (add < min) {
                    min = add;
                } else if (add > max) {
                    max = add;
                }
            }
            i++;
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}
