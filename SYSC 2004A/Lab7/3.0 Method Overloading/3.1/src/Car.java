public class Car {

    private String cargo = "";

    public void goes() {
        System.out.println("Vroom");
    }

    /**
     * A Car can take 1 item as cargo.
     */
    public boolean loadUp(String cargo) {
        if (this.cargo.equals("")) {
            this.cargo = cargo;
            return true;
        }
        return false;
    }

    public String getCargo() {
        return cargo;
    }
}
