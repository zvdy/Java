package Arrays.moveIndex;

import java.util.Scanner;

public class moveIndex {
    
    // Function to ask the user for a ten digit array
    public static int[] askArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }

    // Function to ask the user for a number of positions to move the array
    public static int askPosition() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of positions to move the array: ");
        int position = input.nextInt();
        input.close();
        return position;

    }

    // Function to move the array
    public static int[] moveArray(int[] array, int position) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i + position < array.length) {
                newArray[i + position] = array[i];
            } else {
                newArray[i + position - array.length] = array[i];
            }
        }
        return newArray;
    }

    // Function to print the array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = askArray();
        int position = askPosition();
        System.out.println("The array is: ");
        printArray(array);
        System.out.println("The array moved " + position + " positions is: ");
        printArray(moveArray(array, position));
    }
}
