public interface Diagnosable {
    String[] getSymptoms();

    void addSymptoms(String[] array);

    void removeSymptoms(String[] array);

    boolean isSymptomatic(String[] array);

    int getStage(String[] array);
}
