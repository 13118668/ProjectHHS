import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class AlleData {


    ArrayList<Student> studentList;

    public AlleData() {
        this.studentList = new ArrayList<Student>();
    }

    //Getters
    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(Student s) {
        studentList.add(s);
    }

    public void removeStudent(Student s) {
        studentList.remove(s);
    }

}
