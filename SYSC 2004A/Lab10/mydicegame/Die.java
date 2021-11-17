// Ngo Huu Gia Bao
// 101163137

package mydicegame;

import java.util.Random;

public class Die {
    private int numberOfSides;
    private Random random;


    /**
     *Constructor of the Die class
     *@param numberOfSides, int, the number of Sides
     **/
    public Die(int numberOfSides){
        this.random = new Random();
        this.numberOfSides = numberOfSides;
    }

    /**
     *Default constructor of the Die class
     **/
    public Die() {
        this(6);
    }

    /**
     *This method will roll the random integer based on the numberOfSides
     *@return random integer from range [1, numberOfSides]
     **/
    public int roll() {
        //return random integer from range [1, numberOfSides]
        return random.nextInt(numberOfSides) + 1;
    }
}
