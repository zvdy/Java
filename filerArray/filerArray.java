package filerArray;
import java.util.Scanner;

public class filerArray {
    
    // Scanner method
    public static Scanner input = new Scanner(System.in);

    // Method to get the array
    public static int[] getArray() {
        System.out.print("Enter the number of elements: ");
        int[] array = new int[input.nextInt()];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }

    // Menu method to display the filter options ( Ever and Odd, Positive and Negative, Prime and Non-Prime, Palindrome and Non-Palindrome)
    public static void menu() {
        System.out.println("");
        System.out.println("----------------------------------------");
        System.out.println("1. Even and Odd");
        System.out.println("2. Positive and Negative");
        System.out.println("3. Prime and Non-Prime");
        System.out.println("4. Palindrome and Non-Palindrome");
        System.out.println("5. Exit");
    }

    // Method to filter the array
    public static void filterArray(int[] array) {
        int choice;
        do {
            menu();
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("");
                    System.out.print("Even numbers: ");
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] % 2 == 0) {
                            System.out.print(array[i] + " ");
                        }
                    }
                    System.out.println();
                    System.out.println("");
                    System.out.print("Odd numbers: ");
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] % 2 != 0) {
                            System.out.print(array[i] + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("");
                    System.out.print("Positive numbers: ");
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] > 0) {
                            System.out.print(array[i] + " ");
                        }
                    }
                    System.out.println();
                    System.out.println("");
                    System.out.print("Negative numbers: ");
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] < 0) {
                            System.out.print(array[i] + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("");
                    System.out.print("Prime numbers: ");
                    for (int i = 0; i < array.length; i++) {
                        if (isPrime(array[i])) {
                            System.out.print(array[i] + " ");
                        }
                    }
                    System.out.println();
                    System.out.println("");
                    System.out.print("Non-Prime numbers: ");
                    for (int i = 0; i < array.length; i++) {
                        if (!isPrime(array[i])) {
                            System.out.print(array[i] + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("");
                    System.out.print("Palindrome numbers: ");
                    for (int i = 0; i < array.length; i++) {
                        if (isPalindrome(array[i])) {
                            System.out.print(array[i] + " ");
                        }
                    }
                    System.out.println();
                    System.out.println("");
                    System.out.print("Non-Palindrome numbers: ");
                    for (int i = 0; i < array.length; i++) {
                        if (!isPalindrome(array[i])) {
                            System.out.print(array[i] + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Thank you for using the program!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

    // Method to check if a number is prime 
    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is palindrome
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int temp = number;
        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        return number == reverse;
    }

    // Main method
    public static void main(String[] args) {
        int[] array = getArray();
        filterArray(array);
    }
}
