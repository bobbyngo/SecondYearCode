public class Car {

    private final String style;
    private final double price;
    private final double fuelEconomy;

    public Car(String style, double price, double fuelEconomy) {
        this.style = style;
        this.price = price;
        this.fuelEconomy = fuelEconomy;
    }

    public String getStyle() {
        return style;
    }

    public double getPrice() {
        return price;
    }

    public double getFuelEconomy() {
        return fuelEconomy;
    }

    public void goes() {
        System.out.println("Vroom");
    }

    @Override
    public String toString() {
        return this.getClass().toString() +
                " " + getStyle() +
                " " + getPrice() +
                " " + getFuelEconomy();
    }
}
