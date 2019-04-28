import java.util.Random;

public class IDGenerator {
    int StudentID;

    public int generateID() {
        Random rand = new Random();
        StudentID = rand.nextInt(99999);
        return StudentID;
    }

}
//
//               case 5:
//// Starting exam
//               Scanner userInput = new Scanner(System.in);
//// Asking for student number
//               System.out.println("Wat is je studentnummer?");
//               int studentNumber = Integer.parseInt(userInput.nextLine());
//// Check if student exists
//               if(checkStudentNumber(studentNumber)==false){
//               System.out.println("dit studentnummer bestaat niet");
//               this.callMenu();
//               }else {
//// Asking what exam
//               System.out.println("Wil je Aardijkskunde of Sterrenkunde?");
//               String input = userInput.nextLine();
//// Starting exam by instantiating a new Exam object.
//               Exam exam = new Exam(input, studentNumber, 0, 0);
//               Attempt attemptOnExam = new Attempt(studentNumber, exam.getIsPassed(), exam.getCurrentScore(), input);
//// Adding a attempt for student.
//               attempts.add(attemptOnExam);
//               for (Student s : students) {
//               if (s.getStudentNumber() == studentNumber) {
//               student = s;
//               }
//               }
//               if (exam.getIsPassed()) {
//               student.increaseExamsPassed();
//               }
//               this.callMenu();
//               break;
//               }