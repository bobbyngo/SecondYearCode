import java.util.ArrayList;
import java.util.Arrays;

public class Main {
   public static void main(String[] args) {

      // demonstration
      Corona covid = new Corona();

      // before
      System.out.println("Before evolve symptoms:");
      for (String s : covid.getSymptoms()) {
         System.out.print(s + "\n");
      }

      // updating private fields here
      covid.evolve(2.0, new ArrayList<>(Arrays.asList("cold", "fever")));

      // they changed!
      System.out.println("After evolve symptoms:");
      for (String s : covid.getSymptoms()) {
         System.out.print(s + "\n");
      }
   }
}