package lowerOdd;

import java.util.Scanner;

public class lowerodd {
    public static void main(String[] args) {
        // We ask a user to return us a number and we print all odd numbers lower than it
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = kb.nextInt();
        kb.close();
        for (int i = 1; i < number; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
