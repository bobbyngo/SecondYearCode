public class Main {
   public static void main(String[] args) {

      // a try-catch-finally block
      int i = 0;
      int diver = 0;

      try {
         i = i/diver;
      } catch (ArithmeticException ae) {
         System.err.println("div by zero");
      } finally {
         i = i + 1;
      }
   }
}