// Ngo Huu Gia Bao 101163137
package mymath;
import java.util. ArrayList;
import java.lang.Math;

public class PolyCalc {

    /***
     *This method calculate the coefficients for the derivative of
     * Poly object
     * @param poly
     * @return newPoly. A new object which stores an derivative arraylist
     */
    public static Poly differentiate (Poly poly){
        ArrayList<Double>newCoefficient = new ArrayList<>();

        //Start looping from the smallest degree (head of arraylist)
        for (int i  = 0; i < poly.getCoefficients().size(); i ++) {
            if (i > 1) {
                double p = poly.getCoefficients().get(i) * (i);
                newCoefficient.add(p);
            }else if ( i == 1) {
                double p = poly.getCoefficients().get(i);
                newCoefficient.add(p);
            }else {
                double p = 0.0;
                newCoefficient.add(p);
            }
        }
        Poly newPoly = new Poly(newCoefficient);
        return newPoly;
    }

    /***
     * This method calculate the integral of an input coefficients
     * and the length of new arraylist is + 1 original arraylist
     * @param poly .
     * @return newPoly. A new object which stores an integral arraylist
     */
    public static Poly integrate (Poly poly){
        ArrayList<Double>newCoefficient = new ArrayList<>();

        // Adding constant = 0 at index 0
        newCoefficient.add(0.0);
        //Start looping from the smallest degree (head of arraylist)
        for (int i = 0; i < poly.getCoefficients().size(); i ++){
            double p = poly.getCoefficients().get(i) / (i + 1);
            newCoefficient.add(p);
        }
        Poly newPoly = new Poly(newCoefficient);
        return newPoly;
    }

}
