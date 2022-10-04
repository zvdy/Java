package NumberisPrime;

import java.util.Scanner;

public class NumberisPrime {
    public static void main(String[] args) {
        // Ask the user for a number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();
        // Check if the number is prime
        boolean isPrime = true;
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                isPrime = false;
                break;
            }
        }
        // Display the result
        if (isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }

    }
}
