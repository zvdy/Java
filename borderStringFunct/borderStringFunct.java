package borderStringFunct;

import java.util.Scanner;

public class borderStringFunct {
    // Create a function that returns a string with a star * border without return
    public static void borderString(String str) {
        // Print the top border
        //Ask the user the character to surround the text
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the character to surround the text: ");
        String character = input.nextLine();
        // Print the top border
        for (int i = 0; i < str.length() + 4; i++) {
            System.out.print(character);
        }

        // Print the text
        System.out.println();
        System.out.println(character + " " + str + " " + character);

        // Print the bottom border
        for (int i = 0; i < str.length() + 4; i++) {
            System.out.print(character);
        }
        // We don't need to return anything, we just close the scanner
        input.close();
    }

    
    
    public static void main(String[] args) {
        // Ask the user for a string and pass it to the function
        System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        

        // Print the result
        borderString(str);
        // We close the scanner here
        input.close();
    }
}
