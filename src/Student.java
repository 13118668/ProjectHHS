import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {


    String FirstName;
    String LastName;
    int StudentID;

    //Constructor
    public Student() {
        CreateStudent();
    }

    //Getters
    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getStudentID() {
        return StudentID;
    }


        // Student aanmaken
        public void CreateStudent () {
            Scanner reader = new Scanner(System.in);

            //Voornaam invoeren
            System.out.print("U wilt een student toevoegen. Wat is zijn/haar voornaam? ");
            this.FirstName = reader.nextLine();

            //Achternaam invoeren
            System.out.print("Wat is zijn/haar achternaam? ");
            this.LastName = reader.nextLine();
            System.out.println();

            //ID aanmaken
            IDGenerator studentIDGenerator = new IDGenerator();
            studentIDGenerator.generateID();
            this.StudentID = studentIDGenerator.generateID();


            // Bevestiging/terugkoppeling
            System.out.println("U heeft de volgende student aangemaakt: ");
            System.out.println(FirstName + " " + LastName + ", hij/zij heeft het studentnummer " + StudentID + " toegewezen gekregen. \n" );
        }
}