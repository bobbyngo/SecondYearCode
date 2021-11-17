package mymath;

public final class PolyCalc {
    public static Poly differentiate(Poly p) {

        double[] coeffs = p.getCoeffs();
        double[] newCoeffs = new double[coeffs.length];

        for (int i = 0; i < coeffs.length - 1; i++) {
            newCoeffs[i + 1] = (coeffs.length - 1 - i) * coeffs[i];
        }

        return new Poly(newCoeffs);
    }

    public static Poly integrate(Poly p) {
        double[] coeffs = p.getCoeffs();
        double[] newCoeffs = new double[coeffs.length + 1];

        for (int i = 0; i < coeffs.length; i++) {
            newCoeffs[i] = coeffs[i] / (coeffs.length - i);
        }

        return new Poly(newCoeffs);
    }
}