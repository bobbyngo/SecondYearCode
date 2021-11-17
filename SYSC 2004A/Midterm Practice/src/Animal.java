/**
 * Class Animal models an animal with a species and weight.
 *
 * @author Your Prof and you
 * @version 1.0
 */
public class Animal {
    // The animal's species
    private String species;
    // The animal's weight in kg.
    private double weight;
/**
 * Constructor for objects of class Animal. If the species is
 * invalid "Undetermined" is used. If the weight is invalid, 1.5 is
 * used.
 *
 * @param species The species of the animal (cannot be null or empty
 * String)
 * @param weight The weight of the animal (must be larger than 0.001
 * and smaller than 150000)
 */ // 7 marks
    public Animal (String species, double weight) {
        if (species == null || species.equals("")) {
            this.species = "Undetermined";
        }

        if (weight <= 0.001 || weight >= 150000){
            this.weight = 1.5;
        }
        this.species = species;
        this.weight = weight;

    }



    /**
     * The species method returns the species of the animal.
     *
     * @return species of the animal
     */
    public String species()
    {
        return species;
    }

    /**
     * The weight method returns the weight of the animal.
     *
     * @return weight of the animal
     */
    public double weight()
    {
        return weight;
    }

    /**
     * The displayString method returns a String representing
     * the animal in the form: <species> weighs <weight>kgs.
     * Note that <...> represents the values of the fields.
     *
     * @return a String: <species> weighs <weight>kgs.
     */ // 2 marks

    public String disPlayString () {
        return species + " weights " + weight + "kgs.";
    }

}
