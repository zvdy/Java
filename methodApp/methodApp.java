package methodApp;

import java.util.Scanner;

public class methodApp {
    
    // Create a method to display a menu where you can choose between 5 different options
    public static void menu() {
        System.out.println("1. Read two numbers and return if one of them is a prime number");
        System.out.println("2. Read two numbers and check if the smallest is divisible by the biggest");
        System.out.println("3. Read the name and a number between 0 24 and return Good Morning and Good Afternoon");
        System.out.println("4. Quadratic equation solver ");
        System.out.println("5. Quit");
        // Make the user choose a option until he chooses 5
        Scanner input = new Scanner(System.in);
        System.out.print("Choose a option: ");
        int option = input.nextInt();
        // Create a switch case to choose between the 5 options
        switch (option) {
            case 1:
                primeNumber();
                break;
            case 2:
                divisible();
                break;
            case 3:
                goodMorning();
                break;
            case 4:
                quadraticEquation();
                break;
            case 5:
                System.out.println("Goodbye");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        input.close();
    }
    
    // Create a method to read two numbers and return if one of them is a prime number
    public static void primeNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Create a boolean variable to check if the number is prime
        boolean isPrime = true;
        // Create a for loop to check if the number is prime
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        // Print the result
        if (isPrime) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }
        input.close();
    }

    // Create a method to read two numbers and check if the smallest is divisible by the biggest
    public static void divisible() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number1 = input.nextInt();
        System.out.print("Enter another number: ");
        int number2 = input.nextInt();
        // Create a if statement to check if the smallest is divisible by the biggest
        if (number1 > number2) {
            if (number1 % number2 == 0) {
                System.out.println("The smallest is divisible by the biggest");
            } else {
                System.out.println("The smallest is not divisible by the biggest");
            }
        } else {
            if (number2 % number1 == 0) {
                System.out.println("The smallest is divisible by the biggest");
            } else {
                System.out.println("The smallest is not divisible by the biggest");
            }
        }
        input.close();
    }

    // Create a method to read the name and a number between 0 24 and return Good Morning Good Afternoon and Good Night
    public static void goodMorning() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter a number between 0 and 24: ");
        int number = input.nextInt();
        // Create a if statement to check if the number is between 0 and 24
        if (number >= 0 && number <= 24) {
            // Create a if statement to check if the number is between 0 and 12
            if (number >= 0 && number <= 12) {
                System.out.println("Good Morning " + name);
            } else {
                // Create a if statement to check if the number is between 12 and 18
                if (number >= 12 && number <= 18) {
                    System.out.println("Good Afternoon " + name);
                } else {
                    // 18 and 24
                    System.out.println("Good Night " + name);
                }
            }
        } else {
            System.out.println("Invalid number");
        }
        input.close();
    }

    // Create a method to solve a quadratic equation
    public static void quadraticEquation() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: (a) ");
        int a = input.nextInt();
        System.out.print("Enter another number: (b) ");
        int b = input.nextInt();
        System.out.print("Enter another number: (c) ");
        int c = input.nextInt();
        // Create a variable to calculate the discriminant
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        // Create a if statement to check if the discriminant is positive, negative or zero
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root1 = -b / (2 * a);
            System.out.println("The root is " + root1);
        } else {
            System.out.println("The equation has no real roots");
        }
        input.close();
    }

    public static void main(String[] args) {
        // Call the menu method
        menu();
    }
}
