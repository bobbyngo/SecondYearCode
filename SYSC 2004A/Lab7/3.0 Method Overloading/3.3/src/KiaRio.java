public class KiaRio extends Car {
    @Override
    public void goes() {
        System.out.println("Clunk");
    }

    /**
     * You really shouldn't.
     */
    public boolean loadUp(String cargo) {
        return false;
    }

    @Override
    public String getCargo() {
        return "You really shouldn't.";
    }
}
