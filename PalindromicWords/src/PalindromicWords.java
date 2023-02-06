package PatikaDev;

import java.util.Scanner;

public class PalindromicWords {
    static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str) {
        StringBuilder reverse = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }
        return str.equals(reverse.toString());
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String a = inp.nextLine();
        System.out.println("Is '"+ a + "' palindromic?");
        System.out.println(isPalindrome(a));
        System.out.println(isPalindrome2(a));
    }
}
