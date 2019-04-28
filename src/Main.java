import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int input;
        Menu menu = new Menu();
        AlleData alleData = new AlleData();

        // Welkom
        System.out.print("Welkom, zie onderstaande menu voor een overzicht van de acties die u kan uitvoeren: " + "\n\n");

        // Menu aanroepen
        do {
            menu.showMenu();

            input = menu.askInput();

            menu.evaluate(input, alleData);

        } while (input != 0);

    }
}
