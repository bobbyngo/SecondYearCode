import mymath.*;
import java.util.ArrayList;

import static mymath.PolyCalc.differentiate;
import static mymath.PolyCalc.integrate;

public class Main {
   public static void main(String[] args) {
      // create some mymath.Poly objects and test your mymath.PolyCalc.differentiate()/integrate() methods here!
      ArrayList<Double> poly1 = new ArrayList();

      //Create ArrayList size 3 [1.0, 2.0, 3.0]
      poly1.add(1.0);
      poly1.add(2.0);
      poly1.add(3.0);
      Poly p1 = new Poly(poly1);

      //Create ArrayList size 4 [3.0, -3.1, 0.0, 5.5]
      ArrayList<Double> poly2 = new ArrayList();
      poly2.add(3.0);
      poly2.add(-3.1);
      poly2.add(0.0);
      poly2.add(5.5);
      Poly p2 = new Poly(poly2);

      /***
       * Test printPoly function
       */
      System.out.println("===================Testing Poly class=====================");
      System.out.println("Written by Bobby Cuteeeeeeeeeeeeeeeeeeeeee");
      System.out.println();
      System.out.println("Test printPoly function:");
      System.out.println("Expected: 3.0x^2 + 2.0x + 1.0");
      System.out.print("Actual: ");
      p1.printPoly(poly1);

      System.out.println();

      System.out.println("Expected: 5.5x^3 + -3.1x + 3.0");
      System.out.print("Actual: ");
      p2.printPoly(poly2);

      /***
       * Test Evaluate function
       */
      System.out.println();
      System.out.println("Test printPoly function:");
      double y1 = p1.evaluate(2.0);
      System.out.println("The result of polynomial function " +
              "when x = 2 (should be 17.0) is y = " + y1);
      double y2 = p1.evaluate(3.4);
      System.out.println("The result of polynomial function " +
              "when x = 3.4 (should be 42.479999 something) is y = " + y2);
      double y3 = p1.evaluate(4.2);
      System.out.println("The result of polynomial function " +
              "when x = 4.2 is (should be 62.32) y = " + y3);

      System.out.println();
      System.out.println("==============================Testing PolyCalc class =======================================================");
      System.out.println("Test Derivative function:");

      PolyCalc calc1 = new PolyCalc();
      System.out.println("Differentiate 3.0x^2 + 2.0x + 1.0: ");
      System.out.println("Expected to be 6.0x^2 + 2.0x + 0: [0.0, 2.0, 6.0]");
      System.out.print("Actual: ");
      System.out.println(differentiate(p1).getCoefficients());
      System.out.println();
      System.out.println();
      System.out.println("Differentiate 5.5x^3 + -3.1x + 3.0: ");
      System.out.println("Expected to be 16.5x^3 + -3.1x + 0: [0.0, -3.1, 0.0, 16.5]");
      System.out.print("Actual: ");
      System.out.println(differentiate(p2).getCoefficients());

      System.out.println();
      System.out.println();
      System.out.println("Test Integrate function:");
      PolyCalc calc2 = new PolyCalc();
      System.out.println("Integrate 3.0x^2 + 2.0x + 1.0: ");
      System.out.println("Expected to be 1.0x^3 + 1.0x^2 + 1.0x + 0: [0.0, 1.0, 1.0, 1.0]");
      System.out.print("Actual: ");
      System.out.println(integrate(p1).getCoefficients());
      System.out.println();
      System.out.println();
      System.out.println("Integrate 5.5x^3 + -3.1x + 3.0: ");
      System.out.println("Expected to be 1.375x^4 + -1.55x^2 + 3.0x + 0: [0.0, 3.0, -1.55, 0.0, 1.375]");
      System.out.print("Actual: ");
      System.out.println(integrate(p2).getCoefficients());

      System.out.println();
      //Remember to check length
      System.out.println("============================== Testing Size: ;) =======================================================");
      System.out.print("The size of arraylist before calling differentiate function:");
      System.out.println(p1.getCoefficients().size());
      System.out.println("The size of arraylist after calling differentiate function:");
      System.out.print("Should stay the same (sadge): ");
      System.out.print(differentiate(p1).getCoefficients().size());
      System.out.println();
      System.out.print("The size of arraylist before calling integrate function:");
      System.out.println(p1.getCoefficients().size());
      System.out.println("The size of arraylist after calling integrate function:");
      System.out.print("Should increase by 1 (OH YESSSSS): ");
      System.out.println(integrate(p1).getCoefficients().size());
   }

}