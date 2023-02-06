import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Icinde bulundugunuz yili giriniz: ");
        int year = inp.nextInt();

        Employee e1 = new Employee("Kemal", 2000, 45, 1985, year);
        Employee e2 = new Employee("Omer", 8000, 42, 1994, year);

        e1.printInfo();
        e2.printInfo();
    }
}