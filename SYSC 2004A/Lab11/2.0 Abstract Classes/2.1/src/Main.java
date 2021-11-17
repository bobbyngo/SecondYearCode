import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
   public static void main(String[] args) {
      List<Shape> shapes = new ArrayList<>(
              Arrays.asList(new Circle(0.3),
                      new Square(5.0),
                      new Rectangle(5.0, 2.0)
              )
      );

      for (Shape s : shapes) {
         System.out.println(s.area());
      }
   }
}