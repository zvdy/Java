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
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        //If the number isn't prime, return the next prime number
        if (!isPrime) {
            for (int i = number + 1; i < 100000; i++) {
                boolean isPrime2 = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime2 = false;
                        break;
                    }
                }
                if (isPrime2) {
                    System.out.println("The next prime number is " + i);
                    break;
                }
            }
        } else {
            System.out.println("The number is prime");
        }
    }
}

