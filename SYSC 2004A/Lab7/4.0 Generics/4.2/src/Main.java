public class Main {

   // no touch
   public static int generateHash(String data) {
      int hash = (int) (2004L ^ (2004L >>> 32));
      hash = 31 * hash + data.hashCode();
      return hash;
   }

   public static void main(String[] args) {

      // do not modify ... make the errors go away by editing Block.java
      Block<String> b1 = new Block<>(generateHash("450570001234"), "450570001234");
      Block<Double> b2 = new Block<>(generateHash(String.valueOf(45.0)), 45.0);
      Block<Boolean> b3 = new Block<>(generateHash(String.valueOf(false)), false);

      b2.setNextBlock(b1);
      b3.setNextBlock(b2);

      Block<?> block = b3;
      while (block != null) {
         System.out.println(block.getData());
         block = block.getNextBlock();
      }
   }
}