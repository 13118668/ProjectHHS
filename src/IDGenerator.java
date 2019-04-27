import java.util.Random;

public class IDGenerator {
    int StudentID;

    public int generateID() {
        Random rand = new Random();
        StudentID = rand.nextInt(99999);
        return StudentID;
    }

}
