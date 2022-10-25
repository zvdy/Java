package Arrays.MaxMinCount;
import java.util.Scanner;


public class MaxMinCount {
    // We create an array, return the max and min of the array and the times that them repeated on the array
    // Create a method to ask the user the lenght of the array, close the scanner that we created
    public static Scanner input = new Scanner(System.in);
    
    public static int askSize() {
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        return size;
    }

    // Method to make the user input nums until the array is filled
    public static int[] askValues(int size) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[size];
        System.out.println("Enter the values of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        input.close();
        return array;
    }

    // Method to find the max and min of the array
    public static int[] findMaxMin(int[] array) {
        int size = array.length;
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        int[] maxMin = {max, min};
        return maxMin;
    }

    // Method to count the times that the max and min of the array repeated
    public static int[] countMaxMin(int[] array, int[] maxMin) {
        int size = array.length;
        int max = maxMin[0];
        int min = maxMin[1];
        int countMax = 0;
        int countMin = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == max) {
                countMax++;
            }
            if (array[i] == min) {
                countMin++;
            }
        }
        int[] countMaxMin = {countMax, countMin};
        return countMaxMin;
    }

    // Method to print the max, min and the times that them repeated
    public static void printMaxMinCount(int[] maxMin, int[] countMaxMin) {
        int max = maxMin[0];
        int min = maxMin[1];
        int countMax = countMaxMin[0];
        int countMin = countMaxMin[1];
        System.out.println("The max of the array is: " + max);
        System.out.println("The min of the array is: " + min);
        System.out.println("The max repeated " + countMax + " times");
        System.out.println("The min repeated " + countMin + " times");
    }

    public static void main(String[] args) {
        int size = askSize();
        int[] array = askValues(size);
        int[] maxMin = findMaxMin(array);
        int[] countMaxMin = countMaxMin(array, maxMin);
        printMaxMinCount(maxMin, countMaxMin);
        input.close();
    }        
}
