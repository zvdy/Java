package random;
import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
       // We declare a secret number and a random number generator
            Random randomGenerator = new Random();
            Scanner input = new Scanner(System.in);
            int guess;
            int count = 0;
            int max = 5;
            int min = 1;
            int range = max - min + 1;
            int random = randomGenerator.nextInt(range) + min;
            System.out.print("I'm thinking of a number between 1 and 5. Guess what it is: ");
            guess = input.nextInt();
            while (guess != random) {
                System.out.println("Nope, try again.");
                guess = input.nextInt();
                count++;
            }
            input.close();
            System.out.println("You got it! It took you " + count + " tries.");
            System.out.println("The number was " + random);
    }
}
