import java.util.Scanner;

public class sinif {
    public static void main (String[] args) {

        Scanner inp = new Scanner(System.in);

        int mat,fiz,turk,kim,muz,toplam=0,included=0;

        System.out.print("Matematik notunu giriniz: ");
        mat = inp.nextInt();
        if ((mat>=0)&&(mat<=100)) {
            toplam += mat;
            included ++;
        }else{
            System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz: ");
        }

        System.out.print("Fizik notunu giriniz: ");
        fiz = inp.nextInt();
        if ((fiz>=0)&&(fiz<=100)) {
            toplam += fiz;
            included ++;
        }else {
            System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz: ");
        }

        System.out.print("Türkçe notunu giriniz: ");
        turk = inp.nextInt();
            if ((turk>=0)&&(turk<=100)) {
                toplam += turk;
                included ++;
            }else{
                System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz: ");
            }

        System.out.print("Kimya notunu giriniz: ");
        kim = inp.nextInt();
                if ((kim>=0)&&(kim<=100)) {
                    toplam += kim;
                    included ++;
                }else{
                    System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz: ");
                }

        System.out.print("Müzik notunu giriniz: ");
        muz = inp.nextInt();
                    if ((muz>=0)&&(muz<=100)) {
                        toplam += muz;
                        included ++;
                    }else{
                        System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz: ");
                    }

        double average = toplam/included;

        if (average < 55) {
            System.out.println("Sınıfta kaldınız :(");
        }else {
            System.out.println("Sınıfı geçtiniz, tebrikler!");
        }
        System.out.print("Ortalamanız: " + average);
    }
}