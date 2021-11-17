import java.util.ArrayList;
import java.util.Arrays;

public class Main {
   public static void main(String[] args) {

      // fix this!
      Corona c1 = new Corona(
              0.007,
              2019,
              1.5,
              new ArrayList<String>(Arrays.asList("sniffles", "fever", "cough", "shortness of breath"))
      );

      Corona c2 = new Corona(
              0.3,
              2014,
              new ArrayList<String>(Arrays.asList("fever", "cough", "shortness of breath"))
      );

      // for validation
      System.out.println(c1.getSpecies());
      System.out.println(c2.getSpecies());
   }
}