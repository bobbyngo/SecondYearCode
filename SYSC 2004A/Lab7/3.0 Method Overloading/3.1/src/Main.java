public class Main {
   public static void main(String[] args) {

      FordBronco bronco = new FordBronco();
      KiaRio rio = new KiaRio();
      TeslaS s = new TeslaS();

      // write your solution here

      /* TODO */
      bronco.loadUp("skis", rio );
      s.loadUp("123456");

      System.out.println(bronco.getCargo());
      System.out.println(rio.getCargo());
      System.out.println(s.getCargo());
   }
}