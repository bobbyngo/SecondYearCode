public class FordBronco extends Car {

    private KiaRio tow = null;

    @Override
    public void goes() {
        System.out.println("VROOM");
    }

    /**
     * A FordBronco can tow a KiaRio.
     */
    public boolean loadUp(KiaRio k) {
        if (tow == null) {
            tow = k;
            return true;
        }
        return false;
    }

    /**
     * A FordBronco can take cargo and tow a KiaRio.
     */
    public boolean loadUp(String cargo, KiaRio k) {
        return super.loadUp(cargo) && loadUp(k);
    }

    @Override
    public String getCargo() {
        return super.getCargo() + "|" + ((tow == null) ? "" : "KiaRio");
    }
}
