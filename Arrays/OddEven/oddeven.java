package Arrays.OddEven;
import java.util.Scanner;

public class oddeven {
    
    // Create a array to input 10 numbers
    public static int[] numbers = new int[10];
    
    // Create a method to input numbers into numbers array
    public static void inputNumbers() {
        System.out.println("Enter 10 numbers: ");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        input.close();
    }

    // Create two arrays to store the odd and even numbers
    public static int[] odd = new int[10];
    public static int[] even = new int[10];

    // Create a method to add the odd numbers to the odd array
    public static void oddNumbers() {
        int oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                odd[oddCount] = numbers[i];
                oddCount++;
            }
        }
    }

    // Create a method to add the even numbers to the even array
    public static void evenNumbers() {
        int evenCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even[evenCount] = numbers[i];
                evenCount++;
            }
        }
    }

    // Create a method to display the odd numbers
    public static void displayOdd() {
        System.out.println("The odd numbers are: ");
        for (int i = 0; i < odd.length; i++) {
            if (odd[i] != 0) {
                System.out.print(odd[i] + " ");
            }
        }
    }

    // Create a method to display the even numbers
    public static void displayEven() {
        System.out.println("");
        System.out.println("The even numbers are: ");
        for (int i = 0; i < even.length; i++) {
            if (even[i] != 0) {
                System.out.print(even[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        // Input the numbers
        inputNumbers();
        // Add the odd numbers to the odd array
        oddNumbers();
        // Add the even numbers to the even array
        evenNumbers();
        // Display the odd numbers
        displayOdd();
        // Display the even numbers
        displayEven();
    }
  
}
