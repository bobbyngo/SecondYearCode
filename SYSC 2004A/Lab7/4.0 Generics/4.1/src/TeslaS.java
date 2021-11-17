public class TeslaS extends Car {

    private String lawyersNumber = "";

    @Override
    public void goes() {
        System.out.println("");
    }

    /**
     * A TeslaS can take extra cargo in the form of a String.
     */
    public boolean loadUp(String lawyersNumber) {
        if (this.lawyersNumber.equals("")) {
            this.lawyersNumber = lawyersNumber;
            return true;
        }
        return false;
    }

    /**
     * A TeslaS can take extra cargo in the form of a String and cargo.
     */
    public boolean loadUp(String cargo, String lawyersNumber) {
        return super.loadUp(cargo) && loadUp(lawyersNumber);
    }

    @Override
    public String getCargo() {
        return super.getCargo() + "|" + lawyersNumber;
    }
}
