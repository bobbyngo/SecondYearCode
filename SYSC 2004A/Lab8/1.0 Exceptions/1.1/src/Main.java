import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.List;

public class Main {

    public static void method(List strings) {
      for (ListIterator it = strings.listIterator(); it.hasNext();) {
          //it.set("good");
          if (((Double) it.next()).equals(0.0)) {
            it.set("good");
         }
      }

   }


           //throw new IllegalStateException("");
            //throw new NullPointerException("The string is null");


    public static void main(String[] args) {
      List<String> strings = new ArrayList<>(Arrays.asList("I", "am", "bad","code"));

      //method(null);
      try  {
          method(null);
      }catch (Exception e) {
          System.out.println(e);
      }

    }


}