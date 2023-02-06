import java.util.Scanner;

public class calculator {
    static void addition() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scan.nextInt();
        System.out.print("Enter the second number: ");
        int b = scan.nextInt();

        int result = a + b;
        System.out.println("RESULT = " + result);
    }

    static void subtraction() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scan.nextInt();
        System.out.print("Enter the second number: ");
        int b = scan.nextInt();

        int result = a - b;
        System.out.println("RESULT = " + result);
    }

    static void multiplication() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scan.nextInt();
        System.out.print("Enter the second number: ");
        int b = scan.nextInt();

        int result = a * b;
        System.out.println("RESULT = " + result);
    }

    static int division() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scan.nextInt();
        System.out.print("Enter the second number: ");
        int b = scan.nextInt();

        if (b == 0) {
            return 0;
        }
        int result = a / b;
        System.out.println("RESULT = " + result);
        return result;
    }

    static void exponentiation() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scan.nextInt();
        System.out.print("Enter the second number: ");
        int b = scan.nextInt();

        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("RESULT = " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int a = scan.nextInt();

        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println("RESULT = " + result);
    }

    static void modula() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scan.nextInt();
        System.out.print("Enter the second number: ");
        int b = scan.nextInt();
        int result = a % b;
        System.out.println("RESULT = " + result);
    }

    static void perimeterArea() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first side length: ");
        int a = scan.nextInt();
        System.out.print("Enter the second side length: ");
        int b = scan.nextInt();

        int perimeter = 2 * (a + b);
        int area = a * b;

        System.out.println("PERIMETER = " + perimeter + "\nAREA = " + area);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String menu = "1. Addition\n" +
                "2. Subtraction\n" +
                "3. Multiplication\n" +
                "4. Division\n" +
                "5. Exponentiation\n" +
                "6. Factorial\n" +
                "7. Modulo\n" +
                "8. Perimeter and Area of the rectangle\n" +
                "0. Quit";
        System.out.println(menu);

        while (true) {
            System.out.print("Please select the transection you want to make: ");
            int select = scan.nextInt();
            if (select == 0) {
                break;
            } else if ((select < 0) || (select > 8)) {
                System.out.println("Please select a value between 0-8.");
            }

            switch (select) {
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    if (division() == 0) {
                        System.out.println("Numbers can not be divided by zero.");
                    }
                    break;
                case 5:
                    exponentiation();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modula();
                    break;
                case 8:
                    perimeterArea();
                    break;
            }
        }
        System.out.println("Have a wonderful day!");
    }
}
