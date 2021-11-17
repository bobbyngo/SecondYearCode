//Ngo Huu Gia Bao
// 101163137

import java.util.ArrayList;
import java.util.HashMap;

public class LectureBuilding extends Building{
    private ArrayList<String> offices;
    private HashMap<String, Integer> lectureHalls;


    /**
     * The constructor of the Lecture Building class
     */
    public LectureBuilding() {
        offices = new ArrayList<String>();
        lectureHalls = new HashMap<String, Integer>();
    }


    /**
     * This method add the new office to the ArrayList
     * @param name, String the name of the offices
     */
    public void addOffice (String name) {
        if (!offices.contains(name)) {
            offices.add(name);
        }
    }

    /**
     * Get method for the ArrayList offices type String
     * @return return the offices ArrayList type String
     */
    public ArrayList<String> getOffices() {
        return offices;
    }

    /**
     *The method addLectureHall checks if the lecture room is in the HashMap. If the room is already in the HashMap,
     * the capacity is updated. Otherwise, the room along with the capacity is added
     * @param roomName , String name of the room
     * @param capacity , Integer the capacity of the room
     */
    public void addLectureHalls (String roomName, Integer capacity) {
        lectureHalls.put(roomName, capacity);
    }

    /**
     * This method calculate the total of the number of offices and the number of lecture halls.
     * @return Integer, the total sum of the number of offices and the number of lecture halls.
     */
    public Integer calculateTotalNumberRooms(){
        Integer countOffice = 0;
        Integer countLectureHalls = 0;
        for(String o: offices) {
            countOffice++;
        }
        for (int i = 0; i < lectureHalls.size(); i++) {
            countLectureHalls++;
        }
        return countLectureHalls + countOffice;
    }

    @Override
    /**
     * This method will print out the information of the Lecture Building and the Lecture Halls
     */
    public String toString() {
        String lb = "LectureBuilding = {";

        for (int j = 0; j < offices.size(); j ++) {
            lb += " " + offices.get(j) + " ";
        }

        lb += "}";

        String lh = "\nLectureHalls = { ";
        for (String i: lectureHalls.keySet()) {
            lh += "name: " + i + ", capacity: " + lectureHalls.get(i) + " ";
        }
        lh += "}";

        return lb + lh;
    }
}
