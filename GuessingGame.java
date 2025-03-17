import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
   public static void main(String[] var0) {
      Random var1 = new Random();
      Scanner var2 = new Scanner(System.in);
      int var4 = 0;
      int var5 = var1.nextInt(1, 100);
      System.out.println("Number guessing game");
      System.out.println("Guess number between 1 to 100:");

      int var3;
      do {
         System.out.print("guess the number: ");
         var3 = var2.nextInt();
         ++var4;
         if (var3 < var5) {
            System.out.println("Too Low, try again");
         } else if (var3 > var5) {
            System.out.println("Too High, try again");
         } else {
            System.out.println("CORRECT! The number was " + var5);
            System.out.println("# of attempts " + var4);
         }
      } while(var3 != var5);

      var2.close();
   }
}
