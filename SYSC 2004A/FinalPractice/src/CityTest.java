//Ngo Huu Gia Bao 101163137

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


//Assume addResident() will add the new Peron to the population array list
//Assume calculatePopulation() will return the size of the population array list


public class CityTest {
    private static String name;
    private static ArrayList<Person> population;
    private static int fundationYear;
    private static City city;
    private static Person person;
    private static Address address;

    /**
     * The init method to initialize the attributes that will be used for testing methods
     */
    @BeforeAll
    public static void init() {
        name = "LA";
        fundationYear = 2021;
        address = new Address("West", 12, "KDX");
        person = new Person(name, 20, address);
        population = new ArrayList<Person>();
        population.add(person);
        city = new City(name, fundationYear);

    }


    /**
     * The testGetName method
     */
    @Test
    public void testGetName () {
        assertEquals("LA", city.getName(), "The getName method is not correct\n");

    }


    /**
     * The testSetName method
     */
    @Test
    public void testSetName () {
        city.setName("NYC");
        assertArrayEquals("NYC", city.getName(), "The setName method is not correct\n");

    }

    /**
     * The getFundationYear method
     */
    @Test
    public void testGetFundationYear() {
        assertEquals(2021, city.getFundationYear(), "The getFundationYear method is not correct\n");

    }


    /**
     * The setFundationYear method
     */
    @Test
    public void testSetFundationYear() {
        city.setFundationYear(2022);
        assertArrayEquals(2022, city.getFundationYear(), "The setFundationYear method is not correct\n");

    }

    /**
     * The testCalculatePopulation() will test the total Person in the popluation array list
     */
    @Test
    public void testCalculatePopulation() {
        assertEquals(1, city.calculationPopulation(),"The calculationPopulation method is not correct\n");
    }

    /**
     * The testAddResident() will test whether the new Person is added to the poppulation list or not
     */
    @Test
    public void testAddResident(){
        Person person2 = new Person("ben10", 20, address);
        city.addResident(person2);
        assertEquals(2, population.size(), "The addResident method is not correct\n");
    }

}
