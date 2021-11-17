
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

   // this is the method to modify
   public static void customThrower(String email) throws MyCustomException {
      List<String> registeredEmail = Arrays.asList("@gmail", "@cmail");

      if (!registeredEmail.contains(email)) {
         throw new MyCustomException("Not valid Email");
      }

   }

   public static void main(String[] args) throws MyCustomException {
      // run some tests here
      /* TODO */
     try {
         customThrower("@yahoo");
      } catch (Exception e) {
         System.out.println(e);
      }

   }
}
