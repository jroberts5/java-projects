package inventory;
import java.util.Random;
import java.util.Scanner;

public class Product {
    private int id;
    private String productName;
    private double price;
    private int quantity;

    public Product(int id, String productName,  double price, int quantity){
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;

    }

    //Getters
    public int getId() {
        return id;
    }

    public String getProductName() {return productName;}

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public static int getNewProductID(){
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


    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setProductName(String productName){this.productName = productName;}

    public void setPrice(double price){
        this.price = price;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
