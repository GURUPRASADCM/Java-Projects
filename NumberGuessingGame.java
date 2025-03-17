import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
   public static void main(String[] var0) {
      Random random = new Random();
      Scanner scanner = new Scanner(System.in);
      int attempts = 0;
      int RandomNumber = random.nextInt(1, 100);
      System.out.println("Number guessing game");
      System.out.println("Guess number between 1 to 100:");

      int guess;
      do {
         System.out.print("guess the number: ");
         guess = scanner.nextInt();
         ++attempts;
         if (guess < RandomNumber) {
            System.out.println("Too Low, try again");
         } else if (guess > RandomNumber) {
            System.out.println("Too High, try again");
         } else {
            System.out.println("CORRECT! The number was " + RandomNumber);
            System.out.println("# of attempts " + attempts);
         }
      } while(guess != RandomNumber);

      scanner.close();
   }
}
