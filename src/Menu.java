import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner reader;

    public Menu() {
        this.reader = new Scanner(System.in);
    }

    public void ShowMenu() {
        //Keuzemenu

        System.out.println("Menu");
        System.out.println("1 ) Lijst met examens");
        System.out.println("2 ) Lijst met studenten");
        System.out.println("3 ) Nieuwe student inschrijven");
        System.out.println("4 ) Student verwijderen");
        System.out.println("5 ) Examen afnemen");
        System.out.println("6 ) Is student geslaagd voor test?");
        System.out.println("7 ) Welke examens heeft student gehaald?");
        System.out.println("8 ) Welke student heeft de meeste examens gehaald?" + "\n");

        System.out.println("0 ) Exit menu" + "\n");
    }


    public int askInput() {
        int menuInput = -5;

        while (!(menuInput > -1 && menuInput < 9)) {

            System.out.println("Typ het cijfer van uw keuze: ");
            if (reader.hasNextInt()) {
                menuInput = reader.nextInt();
                System.out.println("U heeft ingevoerd: " + menuInput);
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
//            ArrayList<Student> studentlist = data.getStudentList();
//
//            System.out.println("==> For Loop Example.");
//            for (int i = 0; i < studentlist.size(); i++) {
//                Student s = studentlist.get(i);
//                System.out.println(s.getFirstName() + " " + studentlist.get(i).getLastName() + " " + studentlist.get(i).getStudentID());
//            }
//        }

        if (input == 2) {
            ArrayList<Student> studentlist = data.getStudentList();

            System.out.println("==> For Loop Example.");
            for (int i = 0; i < studentlist.size(); i++) {
                Student s = studentlist.get(i);
                System.out.println(s.getFirstName() + " " + studentlist.get(i).getLastName() + " " + studentlist.get(i).getStudentID());
            }
        }

        if (input == 3) {
            Student student = new Student();
            data.addStudent(student);

            System.out.print("Wilt u nog iets anders doen? (Y/N)");
            String resume = reader.nextLine();
        }

        else if (input == 4) {
            ArrayList<Student> studentlist = data.getStudentList();
            String teVerwijderenStudent;

            System.out.println("Welke student wilt u verwijderen?");
            teVerwijderenStudent = reader.nextLine();

            for (int i = 0; i < studentlist.size(); i++) {
                if (String.valueOf(studentlist.get(i).getStudentID()).equals(teVerwijderenStudent)) {
                    studentlist.remove(i);
                }
            }
        }

        if (input ==0) {
            System.out.println("Systeem wordt afgesloten");
            System.exit(0);
        }
        }



    }

