import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    private static String FirstName;
    private static String LastName;
    private static int StudentID = 000000;

    //Arraylist
    ArrayList<String> ListOfStudents = new ArrayList<String>();

    //Constructor
    public Student(String FirstName, String LastName, int StudentID) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.StudentID = StudentID;
    }

        // Student aanmaken
        public static void CreateStudent () {
            Scanner Reader = new Scanner(System.in);

            //Voornaam invoeren
            System.out.print("U wilt een student toevoegen. Wat is zijn/haar voornaam? ");
            FirstName = Reader.nextLine();

            //Achternaam invoeren
            System.out.println("Wat is zijn/haar achternaam? ");
            LastName = Reader.nextLine();

            //ID aanmaken
            setStudentID();

            // Bevestiging/terugkoppeling
            System.out.print("U heeft de volgende student aangemaakt: ");
            System.out.println(FirstName + " " + LastName + ", hij/zij heeft het studentnummer " + StudentID + " toegewezen gekregen.");

            // Student toevoegen aan ArrayList
            AlleData.addStudent(FirstName, LastName);

            // Terug naar menu
            Menu.ShowMenu();
        }

        //ID verhogen
    private static void setStudentID() {
            StudentID++;
    }



}