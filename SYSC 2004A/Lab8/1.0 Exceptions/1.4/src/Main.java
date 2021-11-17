public class Main {

   public static void thrower() throws Exception {
      throw new Exception("Oh no!");
   }

   public static void main(String[] args) {
      thrower();
   }
}