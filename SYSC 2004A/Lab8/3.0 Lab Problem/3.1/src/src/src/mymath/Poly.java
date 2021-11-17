package mymath;

public class Poly {

    private final double[] coeffs;
    private final int order;

    public Poly(double[] coeffs) {
        this.coeffs = coeffs.clone();
        order = coeffs.length - 1;
    }

    public double evaluate(double x) {

        double result = 0;

        for (int i = 0; i <= order; i++) {
            result += coeffs[i] * Math.pow(x, order - i);
        }

        return result;
    }

    public void printPoly() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < order; i++) {
            if (coeffs[i] != 0) {
                if (sb.length() > 0 && coeffs[i] > 0) {
                    sb.append(" + ").append(Math.abs(coeffs[i])).append("x^").append(order - i);
                } else if (sb.length() > 0 && coeffs[i] < 0) {
                    sb.append(" - ").append(Math.abs(coeffs[i])).append("x^").append(order - i);
                } else {
                    sb.append(coeffs[i]).append("x^").append(order - i);
                }
            }
        }

        if (coeffs[order] != 0) {
            if (coeffs[order] < 0 && sb.length() > 0) {
                sb.append(" - ").append(Math.abs(coeffs[order]));
            } else if (coeffs[order] > 0 && sb.length() > 0) {
                sb.append(" + ").append(Math.abs(coeffs[order]));
            }
            else {
                sb.append(coeffs[order]);
            }
        }
        System.out.println(sb.toString());
    }

    public double[] getCoeffs() {
        return coeffs;
    }
}