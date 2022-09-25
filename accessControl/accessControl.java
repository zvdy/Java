package accessControl;

import java.util.Scanner;
public class accessControl {
    public static void main(String[] args) {
        // we ask the user to enter the password and we save the user input
        System.out.print("Please enter the password: ");
        Scanner keyboard = new Scanner(System.in);
        String password = keyboard.nextLine();
        keyboard.close();
        // we check if the password is correct
        if (password.equals("S")) {
            System.out.println("Access granted to SMR");
        } else if (password.equals("D")) {
            System.out.println("Access granted to DAW");
        } else if (password.equals("M")) {
            System.out.println("Access granted to DAM");
        } else {
            System.out.println("Access denied"); 
        }
    }
}
