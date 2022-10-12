package passwordChecker;

import java.util.Scanner;

public class passwordChecker {
    
    // Create a method to check if the password length is at least 8 characters
    public static boolean checkLength(String password) {
        if (password.length() >= 8) {
            return true;
        } else {
            return false;
        }
    }

    // Create a method to check if the password contains at least one number
    public static boolean checkNumber(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    // Create a method to check if the password contains at least one uppercase letter
    public static boolean checkUppercase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    // Create a method to check if the password contains at least one lowercase letter
    public static boolean checkLowercase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    // Create a method to check if the password contains at least one special character
    public static boolean checkSpecial(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    // Create a method to check if the password is valid
    public static boolean checkPassword(String password) {
        if (checkLength(password) && checkNumber(password) && checkUppercase(password) && checkLowercase(password) && checkSpecial(password)) {
            return true;
        } else {
            return false;
        }
    }

    // Create a method to print the password strength
    public static void printStrength(String password) {
        if (checkPassword(password)) {
            System.out.println("The password '" + password + "' is a strong password.");
        } else {
            System.out.println("The password '" + password + "' is a weak password.");
        }
    }

    public static void main(String[] args) {
        // Ask a user to enter a password
        System.out.print("Please enter a password: ");
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        input.close();

        // Print the password strength
        printStrength(password);
    }
}
