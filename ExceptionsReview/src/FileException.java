import java.io.*;
import java.util.Scanner;

public class FileException {

   private Scanner     userIn;
   private PrintWriter userOut ;

   public FileException() {
   }

   public FileException(InputStream inputStream, PrintStream stream)  {
      FileInputStream fileInputStream ;
      userIn = new Scanner(inputStream) ;
      userOut = new PrintWriter(stream, true) ; // auto flush second arg
      Scanner inFile ;

      userOut.println("Enter the name of a file to read");
      String line ;

      try {
         fileInputStream = new FileInputStream(userIn.next()) ;
         inFile = new Scanner ( fileInputStream) ;
         while ( inFile.hasNext()){
            line = inFile.nextLine();
            userOut.println(line);

         }

      }
      catch (FileNotFoundException e) {
         System.out.println( e.getMessage()) ;
      }
   }

   public static void main(String[] args)  {
      new FileException(System.in, System.out) ;
   }
}
