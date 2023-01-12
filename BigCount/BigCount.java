package BigCount;
import java.util.Scanner;


public class BigCount {

    public static Scanner input = new Scanner(System.in);

    // Method to make the user fill an empty array with number between 1-20 until he inputs 0
    public static int[] fillArray(int[] array) {
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter a number between 1-20 or 0 to stop");
            int number = input.nextInt();
            if (number == 0) {
                break;
            }
            array[i] = number;
            i++;
        }
        return array;
    }

    // Method to count the number of times a number appears in the array
    public static int[] countArray(int[] array) {
        int[] count = new int[20];
        for (int i = 0; i < array.length; i++) {
            count[array[i] - 1]++;
        }
        return count;
    }

    // Method to print the number of times a number appears in the array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                System.out.println((i + 1) + " appears " + array[i] + " times");
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[100];
        array = fillArray(array);
        int[] count = countArray(array);
        printArray(count);
    }
}