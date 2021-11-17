public class Main {
   public static void main(String[] args) {

      // a try-catch-finally block
      int i = 0;
      int diver = 0;

      try {
         i = i / diver;
      } catch (ArithmeticException ae) {
         System.err.println("ae");

         try {
            i = i / (diver - 1);
         } catch (Exception e) {
            System.err.println("e");
         }

      } catch (NullPointerException npe) {
         System.err.println("npe");
      } catch (Exception e) {
         System.err.println("e");
      } finally {
         System.out.println("finally");
         i = i + 1;
      }
   }
}