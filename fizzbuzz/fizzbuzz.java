package fizzbuzz;

public class fizzbuzz {
    public static void main(String[] args) {
        // FizzBuzz
        // We create a program that prints out the numbers from 1 to 100
        // If the number is divisible by 3, it prints out "Fizz"
        // If the number is divisible by 5, it prints out "Buzz"
        // If the number is divisible by 3 and 5, it prints out "FizzBuzz"
        // We create a for loop to print out the numbers
        for (int i = 1; i <= 100; i++) {
            // We check if the number is divisible by 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // We check if the number is divisible by 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // We check if the number is divisible by 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // We print out the number if it is not divisible by 3 or 5
            else {
                System.out.println(i);
            }
        }
    }
}
