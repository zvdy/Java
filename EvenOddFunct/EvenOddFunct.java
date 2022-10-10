package EvenOddFunct;

import java.util.Scanner;

public class EvenOddFunct {
    //Create a function that returns true if a number is even and false if it is odd
    public static String isEven(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        // Ask the user for a number and pass it to the function
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();

        // Print the result
        System.out.println(isEven(num));


    }
}
