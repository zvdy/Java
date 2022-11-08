package ArrayDelete;

import java.util.Scanner;

public class ArrayDelete {
    
    // We load a array with 10 elements given by the user
    public static int[] LoadArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }

    // We will create a method to show the  first array
    public static void ShowArray(int[] array) {
        System.out.println("The array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("The element " + (i + 1) + " is: " + array[i]);
        }
    }

    // We will create a method to ask the user for a element to delete completely the array and print the new array
    public static int[] DeleteElement(int[] array) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert the element of the array you want to delete: ");
        int element = input.nextInt();
        int[] array2 = new int[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != element) {
                array2[j] = array[i];
                j++;
            }
        }
        input.close();
        return array2;
    }

    public static void main(String[] args) {
        int[] array = LoadArray();
        ShowArray(array);
        int[] array2 = DeleteElement(array);
        ShowArray(array2);
    }
}
