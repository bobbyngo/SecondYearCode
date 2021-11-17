//Ngo Huu Gia Bao
//101163137

package test;
import org.junit.jupiter.api.*;
import mymath.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PolyTest {
    private static double[] coeffs1;
    //private static double[] coeffs2;
    private static Poly p1;
    //private static Poly p2;


    /**
     * The init method to initialize the attributes that will be used for testing methods
     */
    @BeforeAll
    public static void init (){
        coeffs1 = new double [] {1, 2 , 3};
        //coeffs2 = new double [] {3.3333333, 1.6, 3.0, 0.0};
        p1 = new Poly(coeffs1);
        //p2 = new Poly(coeffs2);
    }


    /**
     * The testEvaluate method will compare the expected double value with the actual value after the evaluate method is called
     */
    @Test
    public void testEvaluate () {
        assertEquals(11, p1.evaluate(2), 0.0, "The evaluate method is not correct\n");
        //assertEquals(113.3999991, p2.evaluate(3), 0.0, "The evaluate method is not correct\n");
    }


    /**
     * The testGetCoeffs method will compare the expected array with the array after the getCoeffs method is called
     */
    @Test
    public void testGetCoeffs () {
        assertArrayEquals(coeffs1, p1.getCoeffs(), 0.0, "The getCoeffs method is not correct\n");
        //assertArrayEquals(coeffs2, p2.getCoeffs(), 0.0, "The getCoeffs method is not correct\n");
    }


}
