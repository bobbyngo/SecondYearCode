//Ngo Huu Gia Bao
//101163137

package test;
import org.junit.jupiter.api.*;
import mymath.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PolyCalcTest {

    private static double[] coeffs;
    private static double[] expectDifferentiateCoeff;
    private static double[] expectIntegrateCoeff;
    private static Poly p;
    private static PolyCalc pc;


    /**
     * The init method to initialize the attributes that will be used for testing methods
     */
    @BeforeAll
    public static void init() {
        coeffs = new double [] {3.7, 2.1, 0.0, 5};
        expectDifferentiateCoeff = new double [] {0.0, 11.100000000000001, 4.2, 0.0};
        expectIntegrateCoeff = new double [] {0.925, 0.7000000000000001, 0.0, 5.0, 0.0};
        p = new Poly(coeffs);
        pc = new PolyCalc();
    }

    /**
     * The testing method for the differentiate method. This method will compare the expected array with the array that was
     * passed to the differentiate method
     */
    @Test
    public void testDifferentiate() {
        assertArrayEquals(expectDifferentiateCoeff, pc.differentiate(p).getCoeffs() ,"The differentiate method is not correct\n");
    }


    /**
     * The testing method for the integrate method. This method will compare the expected array with the array that was
     * passed to the integrate method
     */
    @Test
    public void testIntegrate() {
        assertArrayEquals(expectIntegrateCoeff, pc.integrate(p).getCoeffs() ,"The integrate method is not correct\n");
    }
}
