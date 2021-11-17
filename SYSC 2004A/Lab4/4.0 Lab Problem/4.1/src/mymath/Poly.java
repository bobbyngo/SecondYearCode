// Ngo Huu Gia Bao 101163137
package mymath;
import java.util.ArrayList;
import java.lang.Math;

public class Poly {
    private ArrayList<Double> coefficients = new ArrayList<Double>();

    /***
     * Constructor that takes an array list of double coefficients of
     * size n (n > 0)
     * The arraylist stores the parameters in the increasing order
     * (The lowest power will be at index 0)
     */
    public Poly (ArrayList coefficients) {
        this.coefficients = coefficients;
    }

    /***
     *This method will return the double value of the polynomial
     * evaluated for a given x
     * @param x the value used to evaluate the polynomial
     * @return the double value of the polynomial function when substituting x
     */
    public double evaluate(double x) {
        double y = 0.0;
        //for (int i = coefficient.size() - 1; i >= 0; i--) {
            //y = coefficient.get(i) + (x * y);
        //}
        for (int i = coefficients.size() - 1; i >= 0; i --) {
            y += coefficients.get(i) * Math.pow(x, i);
        }
        return y;
    }

    /***
     * This method print the polynomial out in the descending order
     * form. Poly has all 0 coefficients, print an empty String.
     * @param coefficients is an arraylist of double number which will
     * represent coefficient.
     */
    public void printPoly(ArrayList coefficients){
        int power = coefficients.size();

        if (power == 0){
            System.out.println("[]");
        }else {
            //Looping from the highest degree to the lowest (Start at tail)
            for (int i = coefficients.size() - 1; i >= 0; i--) {
                if (i > 1){
                    //Check if coefficient is 0
                    if (coefficients.get(i).equals(0.0)){
                        continue;
                    }else {
                        //Coefficient is not 0
                        System.out.print(coefficients.get(i) + "x^" + i + " + ");
                    }
                }else if (i == 1) {
                    //Check if coefficient is 0
                    if (coefficients.get(i).equals(0.0)){
                        continue;
                    }else {
                        //Coefficient is not 0
                        System.out.print(coefficients.get(i) + "x + ");
                    }
                }else {
                    //Check if coefficient is 0
                    if (coefficients.get(i).equals(0.0)) {
                        continue;
                    } else {
                        //Coefficient is not 0
                        System.out.println(coefficients.get(i));
                    }
                }
            }
        }
    }

    /***
     * Accessor method of ArrayList attribute
     * @return coefficient in ArrayList with type double
     */
    public ArrayList<Double> getCoefficients() {
        return coefficients;
    }
}
