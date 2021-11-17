import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
   public static void main(String[] args) {
      // example
      List<Car> cars = new ArrayList<>(
              Arrays.asList(
                      new FordBronco("sport", 50000, 8),
                      new FordBronco("turbo", 58000, 10),
                      new FordBronco("turbo-sport", 55000, 9.2),
                      new TeslaS("sedan", 65000, 0),
                      new TeslaS("sedan", 68000, 0),
                      new TeslaS("sport", 75000, 0),
                      new TeslaS("sport", 70000, 0),
                      new KiaRio("hatchback", 18000, 5.1),
                      new KiaRio("hatchback", 18000, 5.100000000000000000000000001),
                      new KiaRio("hatchback", 15000, 5.8),
                      new KiaRio("sedan", 18000, 5.1),
                      new KiaRio("sedan", 19000, 5.3),
                      new KiaRio("turbo", 25000, 15.1)
              )
      );

      AutoAutoSalesman aas = new AutoAutoSalesman(cars);

      //System.out.println(aas.getReco(true));
      System.out.println(aas.getReco(20000,20000));
   }
}