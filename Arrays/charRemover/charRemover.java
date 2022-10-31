package Arrays.charRemover;
import java.util.Scanner;

public class charRemover {
    
    public static Scanner input = new Scanner(System.in);
    // Remove characters from a String with Arrays
    // Create a method to ask the user for a String to edit
    public static String askUserForString() {
        System.out.println("Enter a String to edit: ");
        String userInput = input.nextLine();
        return userInput;
    }

    // Create a method to ask the user for a character to remove
    public static char askUserForChar() {
        System.out.println("Enter a character to remove: ");
        char userInput = input.next().charAt(0);
        return userInput;
    }

    // Create a method to remove the character from the String
    public static String removeChar(String str, char c) {
        // Create a new String to store the edited String
        String newString = "";
        // Loop through the String
        for (int i = 0; i < str.length(); i++) {
            // If the character at the current index is not the character to remove
            if (str.charAt(i) != c) {
                // Add the character to the new String
                newString += str.charAt(i);
            }
        }
        // Return the new String
        return newString;
    }

    // Create a main method to test the methods
    public static void main(String[] args) {
        // Ask the user for a String to edit
        String str = askUserForString();
        // Ask the user for a character to remove
        char c = askUserForChar();
        // Remove the character from the String
        String newString = removeChar(str, c);
        // Print the new String
        System.out.println(newString);
    }
}
