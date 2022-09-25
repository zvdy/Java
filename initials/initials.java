package initials;

import java.util.Scanner;
public class initials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // We ask the user for the first name and lastname
        System.out.print("Enter your first name: ");
        String firstName = input.next();
        System.out.print("Enter your last name: ");
        String lastName = input.next();
        input.close();
        // We print out the initials using CharAt method
        System.out.println("Your initials are: " + firstName.charAt(0) + lastName.charAt(0));
    }
}
