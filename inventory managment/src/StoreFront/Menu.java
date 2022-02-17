package StoreFront;
import inventory.Inventory;
import java.util.Scanner;


public class Menu {
    Scanner scanner;
    Inventory inventory;

    public Menu(){
        this.scanner = new Scanner(System.in);
        this.inventory = new Inventory();
    }

    public void displayMenuOptions(){
        System.out.println("INVENTORY MANAGEMENT DASHBOARD");
        System.out.println("1. Add an new product");
        System.out.println("2. Remove a product");
        System.out.println("3. Look up an item");
        System.out.println("4. Display Inventory Stock");
        System.out.println("5. View Inventory Info");
        System.out.println("6. Exit");

        System.out.println("\nEnter the number of the option you would like: ");


        int selectedOption = scanner.nextInt();


        switch(selectedOption) {
            case 1:
                inventory.addNewProduct();
                break;
            case 2:
                inventory.removeProduct();
                break;
            case 3:
                inventory.findProduct();
                break;
            case 4:
                inventory.displayInventoryStock();
                break;
            case 5:
                inventory.viewInventoryInfo();
                break;
            case 6:
                System.exit(0);
            default:
                //code
        }

    }
}
