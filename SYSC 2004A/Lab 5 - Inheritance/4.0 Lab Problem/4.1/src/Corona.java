//Ngo Huu Gia Bao 101163137

import java.util.ArrayList;

public class Corona extends Virus {

    private double mortRate;
    private int yearOfEmergence;


    /**
     * Constructor for a Corona.
     * @param mortRate double mortRate
     * @param symptoms int yearOfEmergence
     * @param yearOfEmergence ArrayList symptoms
     */
/*    public Corona(double mortRate, int yearOfEmergence,  ArrayList symptoms) {
        super("coronavirus", String.format("COVID-%2d", yearOfEmergence%100), symptoms);
        this.mortRate = mortRate;
        this.yearOfEmergence = yearOfEmergence;

    }*/
    public Corona(double mortRate, int yearOfEmergence,  ArrayList symptoms) {
        this(mortRate,yearOfEmergence,1.0 ,symptoms);

    }
    /**
     * Constructor for a Corona.
     * @param mortRate double mortRate
     * @param symptoms int yearOfEmergence
     * @param yearOfEmergence ArrayList symptoms
     * @param r0 double
     */
    public Corona(double mortRate, int yearOfEmergence, double r0, ArrayList symptoms) {
        super("coronavirus", String.format("COVID-%2d", yearOfEmergence%100),r0,symptoms);
        this.mortRate = mortRate;
        this.yearOfEmergence = yearOfEmergence;
    }
}
