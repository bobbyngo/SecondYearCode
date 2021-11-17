
public class TeslaS extends Car {

    public TeslaS(String style, double price, double fuelEconomy) {
        super(style, price, fuelEconomy);
    }

    @Override
    public void goes() {
        System.out.println("");
    }

    @Override
    public String toString() {
        return this.getClass().toString() +
                "   Style:" + getStyle() +
                "   Price:" + getPrice() +
                "   Friendly:" + getFuelEconomy() + "\n";
    }

}
