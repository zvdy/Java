package positivenegative;

import java.util.Scanner;

public class positivenegative {
    public static void main(String[] args) {
        // We ask the user for their input, and then we check if it is positive or negative
        // We define the number variable so the user can insert a desired num
        int number ;
        // We ask the user for the desired num and then we store it in the number variable
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();
        // We check if the number is positive, negative or zero 
        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
    }
}
