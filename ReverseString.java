import java.util.Scanner;

public class ReverseString {

    public static void main (String[] args) {
        // Program reverse input string
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a string:");
        String originalString = scanner.nextLine();
        String reversedString = "";

        char[] wordArray = originalString.toCharArray();

        for (int i = wordArray.length-1; i>=0; i--) {
            reversedString += wordArray[i];
        }

        System.out.println("The reverse string: " + reversedString);

    }
}
