import java.util.Scanner;

public class PrimeNumbers {

    public static void main (String args[])
    {
      //Program prints prime numbers between 1 and n (number given by user)
      Scanner scanner = new Scanner(System.in);
      //Get number from user

        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
