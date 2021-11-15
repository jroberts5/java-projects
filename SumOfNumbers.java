import java.util.Scanner;

public class SumOfNumbers {

    public static void main (String args[])
    {
        // Write a program to user a number and gives their sum
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please give me 10 nums: ");
        int numArray[] = new int[10];

        for (int i = 0; i < 10; i++) {
            numArray[i] = scanner.nextInt();
        }
        System.out.print("The 'numArray' numbers are: " );

        int sum = 0;

        for (int num: numArray) {
            sum += num;
            System.out.print(num + " ");
        }

        System.out.println("The sum is:" + sum);
    }
    
}
