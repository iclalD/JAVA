import java.util.Scanner;

public class flight {
    public static void main (String[] args) {

        Scanner flight = new Scanner(System.in);

        int km, age, flightType;

        System.out.print("Please enter the distance: ");
        km = flight.nextInt();

        System.out.print("Please enter your age: ");
        age = flight.nextInt();

        System.out.print("Please enter the flight type (1: One way 2: Round-trip): ");
        flightType = flight.nextInt();

        double totalFee = km*0.10, discountedFee, discount;

        if ((km <= 0) || (age <= 0) || ((flightType != 1) && (flightType != 2))) {
            System.out.println("You have entered an incorrect info.");
        } else {
            if (age < 12) {
                discountedFee = totalFee - totalFee*0.5;
            } else if ((age >= 12) && (age <=24)) {
                discountedFee = totalFee - totalFee*0.1;
            } else if (age >= 65) {
                discountedFee = totalFee - totalFee*0.3;
            } else {
                discountedFee = totalFee;
            } if (flightType == 1) {
                System.out.println(discountedFee);
            } else if (flightType == 2) {
                System.out.println((discountedFee - (discountedFee*0.2))*2);
            }
        }
    }
}
