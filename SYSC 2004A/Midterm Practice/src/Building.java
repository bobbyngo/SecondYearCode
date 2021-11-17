public class Building {

    private String name;
    private int id;
    private double size;
    private static int counter;

    public Building () {

    }

    public Building (String name, double size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }
}
