package inventory;
import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;

public class Inventory {
    private HashMap<String, Product> inventoryStock;
    Scanner scanner = new Scanner(System.in);
    int totalQuantity;
    double inventoryValue;

    public Inventory() {
        this.inventoryStock= new HashMap<String, Product>();
    }

    public void addNewProduct(){
        //Creates the new product
        Scanner scanner = new Scanner(System.in);
        Integer productID = getNewProductID();
        System.out.print("Please enter a product name: ");
        String productName = scanner.nextLine();
        System.out.print("\nPlease enter the product's price: ");
        Double productPrice = scanner.nextDouble();
        System.out.print("\nPlease enter a product quantity: ");
        Integer productQuantity = scanner.nextInt();


        double productValue = productPrice * productQuantity;
        Product newProduct = new Product(productID, productName, productPrice, productQuantity);

        //Updates the inventory with new product
        getInventoryStock().put(productName, newProduct);
        setTotalQuantity(getTotalQuantity() + productQuantity);
        setInventoryValue(getInventoryValue() + productValue);
        System.out.println("Product added successfully.");
    }

    public Product findProduct(){
        System.out.println("What is the name of the product? ");
        String product = scanner.nextLine();
        Product searchedProduct = null;

        try {
            searchedProduct = inventoryStock.get(product);
            System.out.println("Product Name: " + searchedProduct.getProductName() + "| ID: " + searchedProduct.getId() + "| Price: $" + searchedProduct.getPrice() + "| Quantity: " + searchedProduct.getQuantity());
        } catch (Exception e) {
            System.out.println("Sorry, wasn't able to find '" + product + " ' ");
        }
        return searchedProduct;
    }

    public void removeProduct() {
        System.out.print("Do you know the name of the product you want to remove?(Y/N): ");
        char removeResponseOne = scanner.nextLine().toUpperCase().charAt(0);
        Product productToRemove;

        if (removeResponseOne == 'Y'){
           productToRemove = findProduct();
        } else {
            System.out.println("Printing Inventory List");
            displayInventoryStock();
            productToRemove = findProduct();
        }

        System.out.println("Are you sure you would like to remove this product? (Y/N): ");
        char removeResponseTwo = scanner.nextLine().toUpperCase().charAt(0);

        // Updates the inventory's value and total quantity - then removes the item
        if (removeResponseTwo == 'Y'){
            setTotalQuantity(getTotalQuantity() - productToRemove.getQuantity());
            setInventoryValue(getInventoryValue() - (productToRemove.getQuantity() * productToRemove.getPrice()));
            inventoryStock.remove(productToRemove.getProductName());
            System.out.println("Product successfully removed.");
        }

    }

    // Method Generates a New Product ID of 9 with 9 numbers
    public int getNewProductID(){
        String productId = "";

        // Generate 9 random numbers
        Random rand = new Random();
        int[] numberArray = new int[9];
        for (int i = 0; i < 8; i++) {
            int newRandomVal = rand.nextInt(9);
            productId += String.valueOf(newRandomVal);
        }
        //returns integer product id
        return Integer.parseInt(productId);
    }

    public int getTotalQuantity(){
        return totalQuantity;
    }

    public double getInventoryValue(){
        return inventoryValue;
    }

    public HashMap<String, Product> getInventoryStock(){
        return inventoryStock;
    }

    public void setTotalQuantity(int totalQuantity){
        this.totalQuantity = totalQuantity;
    }

    public void setInventoryValue(double inventoryValue){
        this.inventoryValue = inventoryValue;
    }

    public void viewInventoryInfo() {
        System.out.println("Total Inventory Quantity: " + getTotalQuantity() + "\nInventory Value: $" + getInventoryValue());
    }

    public void displayInventoryStock() {
        System.out.println("Inventory List - ");

        int itemCounter = 0;

        for (String item : inventoryStock.keySet()) {
            itemCounter++;
            System.out.println(itemCounter + ". " + "Product Name: " + item + "| ID: " + inventoryStock.get(item).getId() + "| Price: $" + inventoryStock.get(item).getPrice() + "| Quantity: " + inventoryStock.get(item).getQuantity());
        }
    }
}
