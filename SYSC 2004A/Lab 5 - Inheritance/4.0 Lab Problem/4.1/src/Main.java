import java.util.ArrayList;
import java.util.Arrays;

public class Main {
   public static void main(String[] args) {


      Corona c1 = new Corona(
              0.007,
              2019,
              1.5,
              new ArrayList<String>(Arrays.asList("sniffles", "fever", "cough", "shortness of breath"))
      );


      InfectedPerson ip1 = new InfectedPerson("Steve", 20,
              new ArrayList<String>(Arrays.asList("sniffles")),
              new ArrayList<String>(Arrays.asList("fever", "shortness of breath")));

      System.out.println("Should be false");
      System.out.println(ip1.isSymptomatic(c1));

      ip1.addSymptom("fever");
      System.out.println("Should be false");
      System.out.println(ip1.isSymptomatic(c1));

      ip1.addSymptom("cough");
      System.out.println("Should be true");
      System.out.println(ip1.isSymptomatic(c1));

      System.out.println(ip1.getSymptoms());
      System.out.println(ip1.getUnderlyingConditions());


   }
}