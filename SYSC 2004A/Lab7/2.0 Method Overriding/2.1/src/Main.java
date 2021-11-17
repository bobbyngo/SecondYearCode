public class Main {
   public static void main(String[] args) {
      // run code here

      Car[] cars = {new KiaRio(), new TeslaS(), new FordBronco()};

      for (Car c : cars) {
         System.out.print(c.getClass() + " goes: ");
         c.goes();
      }
   }
}