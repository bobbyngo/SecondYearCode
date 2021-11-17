import java.util.ArrayList;
import java.util.Arrays;

public class Main {
   public static void main(String[] args) {
      ArrayList<Virus> virus = new ArrayList<>();

      CoronaVirus cv1 = new CoronaVirus(12, "[die, as]");
      virus.add(cv1);

     String[] a = new String[2];
     String[] b = {"a", "c", "a", "as"};



      virus.get(0).addSymptoms(a);


      ArrayList<Diagnosable> diag = new ArrayList<>();
      diag.add(cv1);

      //diag.get(0).evolve();
   }
}