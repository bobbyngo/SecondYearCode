public abstract class Virus implements Diagnosable {

    private final double r0;

    public Virus(double r0) {
        this.r0 = r0;
    }

    public double getR0() {
        return this.r0;
    }

    public abstract void evolve();

}
