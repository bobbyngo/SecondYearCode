public class FordBronco extends Car {

    public FordBronco(String style, double price, double fuelEconomy) {
        super(style, price, fuelEconomy);
    }

    @Override
    public void goes() {
        System.out.println("VROOM");
    }


    @Override
    public String toString() {
        return this.getClass().toString() +
                "    Style:" + getStyle() +
                "    Price:" + getPrice() +
                "    Friendly:" + getFuelEconomy() + "\n";
    }
}
