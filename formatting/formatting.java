package formatting;

import java.util.Scanner;

public class formatting {
    public static void main(String[] args) {
        // We print out the text with the format method
        // We ask the user for their inputs, and then we print them out using the format method
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Enter your height: ");
        double height = input.nextDouble();
        System.out.print("Enter your weight: ");
        double weight = input.nextDouble();
        input.close();
        // You can use printf or format to print out the variables and give them filters, like shortening the decimal places
        System.out.printf("Hello %s, you are %d years old, your height is %.2f m, and you weight %.3f kg", name ,age, height, weight);
    }
}
