package greetings;

// We import the scanner
import java.util.Scanner;

public class greetings {
    // take a system input and return greetings to the user
    public static void main(String[] args) {
        // we make the user give us a name
        System.out.print("Please enter your name: ");
        // we make a scanner to read the input
        Scanner keyboard = new Scanner(System.in);
        // we read the input and store it in a variable
        String name = keyboard.nextLine();
        // we print the results
        System.out.println("Hello " + name + "!");        
    }

}
