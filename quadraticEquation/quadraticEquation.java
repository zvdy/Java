package quadraticEquation;

import java.util.Scanner;

public class quadraticEquation {
    public static void main(String[] args) {
        // We ask a user to input 3 numbers and we return the quadratic equation
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = kb.nextInt();
        System.out.print("Enter b: ");
        int b = kb.nextInt();
        System.out.print("Enter c: ");
        int c = kb.nextInt();
        kb.close();
        // We use the quadratic formula to calculate the roots
        double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        // We print the result
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}
