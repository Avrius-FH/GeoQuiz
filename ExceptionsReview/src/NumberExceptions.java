import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberExceptions {
   private Scanner     userIn;
   private    PrintWriter userOut;
   private final int MIN = 1;
   private final int MAX = 10;

   public NumberExceptions() {
   }

   public NumberExceptions(InputStream inputStream, PrintStream stream) {
      userIn = new Scanner(inputStream);
      userOut = new PrintWriter(stream, true);  // true means autoflush
      int number = 0;

      while (number < MIN || MAX < number) {
         userOut.println("Please enter a number from " + MIN + " to " + MAX);
         try {
            number = userIn.nextInt();
         }
         catch (InputMismatchException e) {
            userOut.println("Please enter only an integer");
            userIn.nextLine();
         }
      }

      userOut.println(number + " is a valid choice");

      userOut.close();
      userIn.close();
   }

   public static void main(String[] args) {
      new NumberExceptions(System.in, System.out);
   }
}
