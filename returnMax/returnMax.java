package returnMax;

import java.util.Scanner;
public class returnMax {
    public static void main(String[] args) {
        // Ask a user for one number and return the max number until the user enters 0
        int max = 0;
        int number = 0;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = kb.nextInt();
        while (number != 0) {
            System.out.print("Enter a number or 0 to stop and return max: ");
            number = kb.nextInt();
            if (number > max) {
                max = number;
            }
        }
        kb.close();
        System.out.println("The max number is: " + max);
    }
}
