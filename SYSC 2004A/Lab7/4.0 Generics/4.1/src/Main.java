import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

   public static void method(List broncos) {
      for (Iterator it = broncos.iterator(); it.hasNext();) {
         ((FordBronco)it.next()).loadUp(new KiaRio());
      }
   }


   public static void main(String[] args) {

      List<Car> cars = new ArrayList<>(Arrays.asList(new FordBronco(), new FordBronco(), new KiaRio()));

      method(cars);
   }
}