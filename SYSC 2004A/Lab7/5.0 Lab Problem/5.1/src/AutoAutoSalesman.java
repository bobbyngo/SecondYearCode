//Ngo Huu Gia Bao
//101163137

import java.util.ArrayList;
import java.util.List;

public class AutoAutoSalesman {
    private List<Car> cars;

    /**
     * Default constructor of AutoAutoSalesman class
     */
    public AutoAutoSalesman () {
        this.cars = new ArrayList<Car>();
    }

    /**
     * Constructor of AutoAutoSalesman class
     * @param cars , List of type Car
     */
    public AutoAutoSalesman(List<Car> cars) {
        this.cars = cars;
    }

    /**
     * This method will filter out all the valid cars based on the PricePoint and Price Range
     * @param car Car, specific car object
     * @param pricePoint double, the base price
     * @param priceRange double, the range of the price
     * @return true if the referring car is valid, false otherwise
     */
    private boolean priceFilter (Car car, double pricePoint, double priceRange) {
        if (car.getPrice() > pricePoint - priceRange/2 && car.getPrice() < pricePoint + priceRange/2) {
            return true;
        }
        return false;
    }

    /**
     * This method will filter out all the valid cars based on the style
     * @param car Car, the specific car object
     * @param style String, the style of the car
     * @return true if the referring car is valid, false otherwise
     */
    private boolean styleFilter (Car car, String style){
        if (car.getStyle().equals(style)) {
            return true;
        }
        return false;
    }

    /**
     * This method will be called if the customer sets the friendly is true
     * @param car Car, the specific car object
     * @return true if the referring car is valid, false otherwise
     */
    private boolean ecoFilter (Car car) {
        if (car.getFuelEconomy() < 6.0) {
            return true;
        }
        return false;
    }

    private boolean checkDup (Car car1, List<Car> cars) {
        for (Car c : cars) {
            if (c.getStyle().equals(car1.getStyle())
                && c.getPrice() == car1.getPrice()
                && c.getFuelEconomy() == (car1.getFuelEconomy())) {

                return true;
            }
        }
        return false;
    }

    /**
     * This method will return the list that contains all the cars
     * @return the list of cars
     */
    public List<Car> getReco () {
        return cars;
    }

    /**
     * This method will call the priceFilter to check valid price in the given car list
     * return the list of valid cars that match the price point and the price range parameter
     * @param pricePoint double, the base price
     * @param priceRange double, the range of the price
     * @return the list of cars
     */
    public List<Car> getReco (double pricePoint, double priceRange) {

        List<Car>carsList = new ArrayList<Car>();

        for (Car c: cars) {
            if(priceFilter (c, pricePoint, priceRange)){
                if (!checkDup(c, carsList)) {
                    carsList.add(c);
                }
            }
        }
        return carsList;
    }

    /**
     * This method will call the styleFilter to check valid style in the given car list
     * return the list of valid cars that match the style parameter
     * @param style String style of the car
     * @return the list of cars
     */
    public List<Car> getReco (String style) {

        List<Car>carsList = new ArrayList<>();

        for (Car c: cars) {
            if (styleFilter(c, style)) {
                if (!carsList.contains(c)) {
                    carsList.add(c);
                }
            }
        }
        return carsList;
    }

    /**
     * This method will call the ecoFilter if the customers set the friendly to true.
     * The method will remove invalid ecoFriendly Car in the given car list
     * @param friendly boolean, true: friendly, false: otherwise
     * @return the list of cars
     */
    public List<Car> getReco (boolean friendly) {

        for (Car c : cars) {
            if (!friendly) {
                return cars;
            }else{
                if (!ecoFilter(c)) {
                    cars.remove(c);
                }
            }
        }
        return cars;
    }

    /**
     * This method will call the priceFilter and styleFilter to check the valid cars,
     * all the valid cars will be put in the list and returned to the customer
     * @param style String, the style of the car
     * @param pricePoint double, the base price
     * @param priceRange double, the range of the price
     * @return list of valid cars
     */
    public List<Car> getReco (String style, double pricePoint, double priceRange) {
        List<Car>carsList = new ArrayList<>();
        for (Car c: cars) {
            if (priceFilter(c, pricePoint, priceRange) && c.getStyle().equals(style)) {
                if (!carsList.contains(c)) {
                    carsList.add(c);
                }
            }
        }
        return carsList;
    }

    /**
     * This method will call the priceFilter and ecoFilter to check the valid cars,
     * all the valid cars will be put in the list and returned to the customer
     * @param pricePoint double, the base price
     * @param priceRange double, the range of the price
     * @param friendly boolean, true: friendly, false: otherwise
     * @return list of valid cars
     */
    public List<Car> getReco (double pricePoint, double priceRange, boolean friendly) {
        List<Car>carsList = new ArrayList<>();

        for (Car c: cars) {
            if (friendly) {
                if (priceFilter(c, pricePoint, priceRange) && ecoFilter(c)) {
                    if (!carsList.contains(c)) {
                        carsList.add(c);
                    }
                }
            }
            //if friendly == false
            else {
                if (priceFilter(c, pricePoint, priceRange)) {
                    if (!carsList.contains(c)) {
                        carsList.add(c);
                    }
                }
            }

        }
        return carsList;
    }

    /**
     * This method will call the styleFilter and ecoFilter to check the valid cars,
     * all the valid cars will be put in the list and returned to the customer
     * @param style String, the type of cars
     * @param friendly boolean, true: friendly, false: otherwise
     * @return list of valid cars
     */
    public List<Car> getReco (String style, boolean friendly) {
        List<Car>carsList = new ArrayList<>();

        for (Car c: cars) {
            if (friendly){
                if (styleFilter(c, style) && ecoFilter(c)){
                    if (!carsList.contains(c)) {
                        carsList.add(c);
                    }
                }
            }
            //if friendly == false
            else {
                if (styleFilter(c, style)) {
                    if (!carsList.contains(c)) {
                        carsList.add(c);
                    }
                }
            }
        }

        return carsList;
    }

    /**
     *  This method will call the styleFilter, priceFilter and ecoFilter to check the valid cars,
     *  all the valid cars will be put in the list and returned to the customer
     * @param style String, type of cars
     * @param pricePoint double,
     * @param pricePoint double, the base price
     * @param priceRange double, the range of the price
     * @param friendly boolean, true: friendly, false: otherwise
     * @return list of valid cars
     */
    public List<Car> getReco (String style, double pricePoint, double priceRange,
                                    boolean friendly){

        List<Car>carsList = new ArrayList<>();
        for (Car c: cars) {
            if (friendly) {
                if (priceFilter(c, pricePoint, priceRange) && styleFilter(c, style) && ecoFilter(c)) {
                    if (!carsList.contains(c)) {
                        carsList.add(c);
                    }
                }
            }

            //if friendly == false
            else {
                if (priceFilter(c, pricePoint, priceRange) && styleFilter(c, style)) {
                    if (!carsList.contains(c)) {
                        carsList.add(c);
                    }
                }

            }
        }
        return carsList;
    }
}
