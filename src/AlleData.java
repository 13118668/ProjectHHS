import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class AlleData {


    ArrayList<Student> studentList;
    ArrayList<Exams> examList;

    public AlleData() {
        this.studentList = new ArrayList<Student>();
        this.examList = new ArrayList<Exams>();
    }

    //Getters
    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public ArrayList<Exams> getExamList() {
        return examList;
    }


    public void addStudent(Student s) {
        studentList.add(s);
    }

    public void removeStudent(Student s) {
        studentList.remove(s);
    }

}
