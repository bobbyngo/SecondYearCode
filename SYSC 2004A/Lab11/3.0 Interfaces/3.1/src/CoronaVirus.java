import java.util.Arrays;
import java.util.HashSet;

public class CoronaVirus extends Virus {

    private final HashSet<String> symptoms = new HashSet<>();

    public CoronaVirus(double r0, String symptoms) {
        super(r0);
        this.symptoms.addAll(Arrays.asList(symptoms));
    }

    @Override
    public String[] getSymptoms() {
        return new String[0];
    }

    @Override
    public void addSymptoms(String[] array) {

    }

    @Override
    public void removeSymptoms(String[] array) {

    }

    @Override
    public boolean isSymptomatic(String[] array) {
        return false;
    }

    @Override
    public int getStage(String[] array) {
        return 0;
    }

    @Override
    public void evolve() {
        System.out.println("Evolved");
    }




}
