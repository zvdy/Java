package borderStringFunct;

import java.util.Scanner;

public class borderStringFunct {
    // Create a function that returns a string with a star * border without return
    public static void borderString(String str) {
        // Print the top border
        for (int i = 0; i < str.length() + 4; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Print the string
        System.out.println("* " + str + " *");

        // Print the bottom border
        for (int i = 0; i < str.length() + 4; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    
    
    public static void main(String[] args) {
        // Ask the user for a string and pass it to the function
        System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        input.close();

        // Print the result
        borderString(str);

    }
}
