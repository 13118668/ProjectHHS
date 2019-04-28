import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    ArrayList<Student> studentlist; //probeersel
    Scanner reader;
    Scanner teVerwijderenID;
    Scanner resume;
    Scanner idInvoeren;

    public Menu() {
        this.reader = new Scanner(System.in);
        this.teVerwijderenID = new Scanner(System.in);
        this.resume = new Scanner(System.in);
        this.idInvoeren = new Scanner(System.in);
    }

    public void showMenu() {
        //Keuzemenu
        System.out.println("Menu");
        System.out.println("1 ) Lijst met examens");
        System.out.println("2 ) Lijst met studenten");
        System.out.println("3 ) Nieuwe student inschrijven");
        System.out.println("4 ) Student verwijderen");
        System.out.println("5 ) Examen afnemen");
        System.out.println("6 ) Is student geslaagd voor test?");
        System.out.println("7 ) Welke examens heeft student gehaald?");

        System.out.println("0 ) Exit menu" + "\n");
    }


    public int askInput() {
        int menuInput = -5;

        while (!(menuInput > -1 && menuInput < 8)) {

            System.out.print("Typ het cijfer van uw keuze: ");
            if (reader.hasNextInt()) {
                menuInput = reader.nextInt();
                System.out.println("U heeft keuze " + menuInput + " geselecteerd." + "\n");
            }

            if (menuInput > -1 && menuInput < 9) {
                break;

            } else {
                System.out.println("Ongeldige keuze");
            }

            reader.nextLine();

        }
        return menuInput;
    }


    public void evaluate(int input, AlleData data) {
        // Opties

//        if (input == 1) {
//            ArrayList<Exams> examList = data.getExamList();
//
//            System.out.println("De volgende examens zijn beschikbaar: ");
//            for (int i = 0; i < examList.size(); i++) {
//                Exams e = examList.get(i);
//                System.out.println(e.getExamName());
//            }
//        }


        // Optie 2
        if (input == 2) {
            ArrayList<Student> studentlist = data.getStudentList();

            System.out.println("De volgende studenten zijn geregistreerd: " + "\n");
            for (int i = 0; i < studentlist.size(); i++) {
                Student s = studentlist.get(i);
                System.out.println(s.getFirstName() + " " + studentlist.get(i).getLastName() + " " + studentlist.get(i).getStudentID());
            }
        }

        // Optie 3
        if (input == 3) {
            Student student = new Student();
            data.addStudent(student);

            System.out.print("Wilt u nog een actie uitvoeren? (Y/N)");
            String resumeInput = resume.nextLine();

            if (resumeInput.equals("N") || resumeInput.equals("n")) {
                System.exit(0);
            } else {
                System.out.println("U wordt terugverwezen naar het menu" + "\n");
            }
        }

        // Optie 4
        if (input == 4) {
            ArrayList<Student> studentlist = data.getStudentList();
            String teVerwijderenStudent;

            System.out.println("Welke student wilt u verwijderen?");
            teVerwijderenStudent = teVerwijderenID.nextLine();

            for (int i = 0; i < studentlist.size(); i++) {
                if (String.valueOf(studentlist.get(i).getStudentID()).equals(teVerwijderenStudent)) {
                    studentlist.remove(i);
                }
            }
        }

        // Optie 5
        if (input == 5) {
            System.out.println("Wat is uw studentnummer?");
            int ingevoerdStudentnummer = Integer.parseInt(idInvoeren.nextLine());

            if (studentlist.contains(ingevoerdStudentnummer)) {
                System.out.println("Dit nummer bestaat");

            }
        }
    }

//    // Probeersel
//    private boolean checkStudentNumber(int studentNr){
//        boolean found=false;
//
//        for(Student check : studentlist){
//            if(check.getStudentID() == studentNr){
//                found=true;
//            }
//        }
//        return found;
//    }

}

