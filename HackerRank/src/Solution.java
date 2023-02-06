import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("int değerini giriniz: ");
        int T = inp.nextInt();

        String t1 = (T >= -128)&&(T <= 127) ? "T can be fitted in byte" : "T can't be fitted in byte";
        String t2 = (T <= 32.767)&&(T >= -32.768) ? "T can be fitted in short" : "T can't be fitted in short";
        String t3 = (T >= Math.pow(-2,31))&&(T <= Math.pow(2,31) -1) ? "T can be fitted in int" : "T can't be fitted in int";
        String t4 = (T <= Math.pow(2,63) - 1)&&(T >= Math.pow(-2, 63)) ? "T can be fitted in long" : "T can't be fitted anywhere.";

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);

    }
}
