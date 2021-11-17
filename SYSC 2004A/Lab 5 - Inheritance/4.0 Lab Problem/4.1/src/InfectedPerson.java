//Ngo Huu Gia Bao 101163137

import java.util.ArrayList;

public class InfectedPerson extends Person{
    private ArrayList<String> underlyingConditions = new ArrayList<>();
    private ArrayList<String> symptoms = new ArrayList<>();
    private Corona diagnosis;

    /**
     * Constructor of Infected Person
     * @param underlyingConditions, ArrayList String
     * @param symptoms, ArrayList String
     */
    public InfectedPerson (ArrayList underlyingConditions,
                           ArrayList symptoms) {
        super();
        this.underlyingConditions = underlyingConditions;
        this.symptoms = symptoms;
        this.diagnosis = null;
    }

    /**
     * Constructor of Infected Person
     * @param name, String
     * @param age, int
     * @param underlyingConditions, ArrayList String
     * @param symptoms, ArrayList String
     */
    public InfectedPerson (String name, int age,
                           ArrayList underlyingConditions, ArrayList symptoms) {
        super(name, age);
        this.underlyingConditions = underlyingConditions;
        this.symptoms = symptoms;
        this.diagnosis = null;
    }

    /**
     * This method takes a Corona object as a parameter. An
     * InfectedPerson is said to be symptomatic if they have at
     * least 75% of the symptoms from the Corona object's
     * symptoms field
     * @param corona, Corona object
     * @return true if InfectedPerson does have at least 75% of the symptoms the diagnosis
     * is set to the Corona object
     * @return false otherwise
     */
    public boolean isSymptomatic(Corona corona) {
        ArrayList<String> coronaSymptoms = corona.getSymptoms();
        int count = 0;
        for (String i: symptoms) {
            if (coronaSymptoms.contains(i)) {
                count++;
            }
        }
        if (count * 100 / coronaSymptoms.size() >= 75) {
            diagnosis = corona;
            return true;
        }
        return false;
    }
    /**
     * Accessor method for underLyingConditions
     * @return ArrayList type String, underlyingConditions
     */
    public ArrayList<String> getUnderlyingConditions() {
        return underlyingConditions;
    }

    /**
     * Adding method will add new condition to the arraylist
     * underLyingConditions
     * @param newCondition, String new condition
     */
    public void addUnderlyingConditions(String newCondition) {
        if (!underlyingConditions.contains(newCondition)) {
            underlyingConditions.add(newCondition);
        }
    }

    /**
     * Accessor method for symptoms
     * @return ArrayList type String, symptoms
     */
    public ArrayList<String> getSymptoms() {
        return symptoms;
    }

    /**
     * Adding method which will add new symptoms to the arraylist symptoms
     * @param newSymptom, String new symptoms
     */
    public void addSymptom(String newSymptom) {
            if (!symptoms.contains(newSymptom)) {
                symptoms.add(newSymptom);
        }
    }

    /**
     * Accessor method for diagnosis
     * @return Corona, diagnosis
     */
    public Corona getDiagnosis() {
        return diagnosis;
    }
}
