public class KiaRio extends Car {

    public KiaRio(String style, double price, double fuelEconomy) {
        super(style, price, fuelEconomy);
    }

    @Override
    public void goes() {
        System.out.println("Clunk");
    }

    @Override
    public String toString() {
        return this.getClass().toString() +
                "    Style:" + getStyle() +
                "    Price:" + getPrice() +
                "    Friendly:" + getFuelEconomy() + "\n";
    }
}
