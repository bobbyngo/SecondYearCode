
public class Dog {

    
    private int age;

    
    private String name;

    
    private String breed;

    
    private double tailWagFrequency = 1;

    
    private static final double THRESHOLD_FOR_FLIGHT = 50.0;

    
    public Dog(int age, String name, String breed) {
        this.age = age;
        this.name = name;
        this.breed = breed;
    }

    
    public void haveBirthday() {
        age++;
    }

    
    public int getAgeInDogYears() {
        return age*7;
    }

    
    public boolean acceptTreat(int numberOfTreats) {
        tailWagFrequency = tailWagFrequency + (250.0 - Math.exp(0.5 * numberOfTreats)) / Math.exp(0.5 * numberOfTreats);

        if (tailWagFrequency > THRESHOLD_FOR_FLIGHT) return true;
        return false;
    }
}
