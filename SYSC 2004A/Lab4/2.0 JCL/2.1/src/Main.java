import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

      Scanner myObj = new Scanner(System.in);

      String enterLine;
      System.out.println("Enter something");
      enterLine= myObj.nextLine();

      System.out.println(enterLine);
   }
}