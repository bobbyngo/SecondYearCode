import java.util.*;
public class Main {

    public static void main(String[] args) {
        LectureBuilding l1 = new LectureBuilding();
        l1.addLectureHalls("a1", 5);
        l1.addLectureHalls("a2", 6);
        l1.addLectureHalls("a2", 7);
        l1.addLectureHalls("a2", 2);
        l1.addOffice("a3");
        l1.addOffice("a3");
        l1.addOffice("a4");

        System.out.println(l1.toString());
    }
}
