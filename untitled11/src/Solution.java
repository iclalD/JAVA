import java.util.*;
import java.io.*;
import java.util.Arrays;

public class Solution {
    public static String LetterCapitalize(String str) {
        // code goes here
        String a = "";
        String[] divide = str.split(" ");
        System.out.println(Arrays.toString(divide));
        System.out.println("divide length: " + divide.length);

        for(int i = 0; i < divide.length; i++) {
            String noun = divide[i];
            noun = noun.substring(0, 1).toUpperCase() + noun.substring(1).toLowerCase();
            a += noun + " ";

        }
        return a;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.print(LetterCapitalize(str));
    }

}
