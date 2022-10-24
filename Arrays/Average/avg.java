package Arrays.Average;
import java.util.Scanner;

public class avg {
    
    // Create a array to input 10 numbers
    public static double[] numbers = new double[10];

    // Create a method to calculate the average of the numbers
    public static double average(double[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;
    }

    public static void main(String[] args) {
    // Make the user insert 10 numbers
        System.out.println("Enter 10 numbers: ");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        input.close();
        // Display the average of the numbers
        System.out.println("The average of the numbers is: " + average(numbers));    
    }
}

