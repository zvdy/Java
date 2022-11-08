package ArrayEx;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayEx {

    public static Scanner input = new Scanner(System.in);

    // We will create a method to ask the user for a input to fill a 10 element array using array.
    public static int[] FillArray() {
        System.out.println("Insert a number to fill the array: ");
        int[] array = new int[10];
        // We will fill the array without using a loop.
        Arrays.fill(array, input.nextInt());
        return array;
    }

    // We will create a method to show the array without loop
    public static void ShowArray(int[] array) {
        System.out.println("The array is: ");
        System.out.println(Arrays.toString(array));
    }

    // We will make a method to ask the user for a index to modify the array
    public static int[] ModifyArray(int[] array) {
        System.out.println("Insert the index of the array you want to modify: ");
        int index = input.nextInt();
        System.out.println("Insert the new value of the array: ");
        int value = input.nextInt();
        array[index] = value;
        return array;

    }

    // We will create a method to ask the user for a index to delete the element of the array
    public static int[] DeleteElement(int[] array) {
        System.out.println("Insert the index of the array you want to delete: ");
        int index = input.nextInt();
        array[index] = 0;
        return array;
    }

    // We will create a method to ask the user for a index to insert a new element in the array
    public static int[] InsertElement(int[] array) {
        System.out.println("Insert the index of the array you want to insert: ");
        int index = input.nextInt();
        System.out.println("Insert the value of the array you want to insert: ");
        int value = input.nextInt();
        array[index] = value;
        return array;
    }

    // Create a menu to ask the user what he wants to do with the array
    public static void Menu() {
        System.out.println("----------------------------------------");
        System.out.println("What do you want to do with the array?");
        System.out.println("1. Fill the array");
        System.out.println("2. Show the array");
        System.out.println("3. Modify the array");
        System.out.println("4. Delete an element of the array");
        System.out.println("5. Insert an element in the array");
        System.out.println("6. Exit");
    }


    // Method to clear the screen
    public static void ClearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner input = new Scanner(System.in);
        int option = 0;
        do {
            Menu();
            option = input.nextInt();
            switch (option) {
                case 1:
                    array = FillArray();
                    ClearScreen();
                    break;
                case 2:
                    ShowArray(array);
                    break;
                case 3:
                    array = ModifyArray(array);
                    ClearScreen();
                    break;
                case 4:
                    array = DeleteElement(array);
                    ClearScreen();
                    break;
                case 5:
                    array = InsertElement(array);
                    ClearScreen();
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    ClearScreen();
                    break;
                default:
                    System.out.println("Invalid option");
                    ClearScreen();
                    break;
            }
        } while (option != 6);
        input.close();
    }
}
