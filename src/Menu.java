import java.util.Scanner;

public class Menu {

    public static void ShowMenu() {
        // Declaring attributes
        int MenuInput;

        //Keuzemenu
        Scanner reader = new Scanner(System.in);
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

        System.out.println("Typ het cijfer van uw keuze: ");
        MenuInput = Integer.parseInt(reader.nextLine());

        if (MenuInput == 3) {
            Student.CreateStudent();
        }
    }
}
