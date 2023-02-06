import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class GuessingNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Random rand = new Random();

        int right = 0;
        int number = rand.nextInt(100);
        int[] wrongList = new int[5];
        System.out.println(number);
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5) {
            System.out.print("GUESS: ");
            int guess = inp.nextInt();

            if (guess < 0 || guess > 100) {
                if (isWrong) {
                    right++;
                    wrongList[right] = guess;
                    System.out.println(5 - right + " guesses left, try again...");
                } else {
                    wrongList[right] = guess;
                    isWrong = true;
                    System.out.println("Please enter a number between 0 and 100.");
                    System.out.println("Next time you'll lose a move.");
                }
            } else {
                if (guess == number) {
                    System.out.println("Congrats, you guessed the number correctly! " + "*" + number + "*");
                    isWin = true;
                    break;
                } else {
                    wrongList[right++] = guess;
                    if (right < 4) {
                        System.out.println((5 - right) + " guesses left, try again...");
                    }
                    if (right == 4) {
                        System.out.println("Last chance!");
                        System.out.println((5 - (right)) + " guesses left, try again...");
                    }
                }
            }
        }
        if (!isWin) {
            System.out.print("You couldn't guess the number :(\nThe number was: " + number + "\nYour guesses: ");
            System.out.println(Arrays.toString(wrongList));
        }
    }
}
