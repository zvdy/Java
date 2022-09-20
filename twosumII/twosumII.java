package twosumII;

import java.util.Scanner;

public class twosumII {
    public static void main(String[] args) {
        // we declare the number variables that the user will fill
        int n1,n2;
        // we create the user inputs for the numbers using Scanner
        Scanner kb = new Scanner(System.in);
        // We ask for the first num
        System.out.print("Enter the first number: ");
        n1 = kb.nextInt();
        // We ask for the second num
        System.out.print("Enter the second number: ");
        n2 = kb.nextInt();
        // We print the operations of the two numbers
        System.out.println("Your selected numbers are " + n1 + " and " + n2);
        System.out.println("The sum of the two numbers is: " + (n1+n2));
        System.out.println("The difference of the two numbers is: " + (n1-n2));
        System.out.println("The product of the two numbers is: " + (n1*n2));
        System.out.println("The quotient of the two numbers is: " + (n1/n2));
        System.out.println("The remainder of the two numbers is: " + (n1%n2));

    }
}
