import java.util.Scanner;

public class pattern {
    static void function(int n, boolean trueFalse, int temp) {

        if ((trueFalse == true) && (n <= temp) && (n > 0)) {
            System.out.print(n + " ");
            n -= 5;
            if (n <= 0) {
                function(n, false, temp);
            } else {
                function(n, true, temp);
            }
        } else if ((trueFalse == false) && (n <= temp)) {
            System.out.print(n + " ");
            n += 5;
            function(n, false, temp);
        }


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int num = input.nextInt();
        int temp = num;
        function(num, true, temp);
    }
}
