import java.util.Scanner;

public class etkinlikOnerme {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        int heat;

        System.out.print("Please enter a temperature value: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.print("Kayak yapabilirsiniz.");
        } else if ( heat <= 25 ) {
            if (heat <= 15) {
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            if ( heat >= 10 ) {
                System.out.println("Piknik yapmaya gidebilirsiniz.");
            }
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
