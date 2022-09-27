package primeNumber;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        // Check if a number is prime or not
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();
        if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0 || number % 7 == 0) {
            System.out.println(number + " is not a prime number");
        } else {
            System.out.println(number + " is a prime number");
        }
    }
}
