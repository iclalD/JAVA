import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        double minTutar=20, perKM=2.20, gidilenYol, toplam=10;

        Scanner taksimetre = new Scanner(System.in);

        System.out.print("Kaç KM yol gidildi: " );
        gidilenYol = taksimetre.nextDouble();
        toplam += perKM*gidilenYol;


        double total = (toplam <= minTutar)? minTutar : toplam;
        System.out.println("Ödenecek tutar: " +total);
    }
}
