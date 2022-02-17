import StoreFront.Menu;
import inventory.Inventory;
import java.util.Scanner;
import java.lang.System;

public class Main {

    public static void main (String args[]){
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);

        char answer;

        do {
            menu.displayMenuOptions();
            System.out.println("Would you like to continue?(Y/N): ");
            answer = scanner.nextLine().toUpperCase().charAt(0);
        } while (answer == 'Y');

        // Exits program if user does not want to continue
        if (answer == 'N'){
            System.exit(0);
        }
    }
}
