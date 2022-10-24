package Arrays.arraySum;
import java.util.Scanner;
public class arrSum {
    
    // Create two arrays, one of size 10 and the other of size 5 and add the elements of both the arrays
    // Create a method to add the elements of the arrays
    public static int[] addArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }
        return arr3;
    }

    // Create a method to print the elements of the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[10];
        int[] arr2 = new int[5];
        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] arr3 = addArrays(arr1, arr2);
        System.out.println("The elements of the first array are: ");
        printArray(arr1);
        System.out.println("The elements of the second array are: ");
        printArray(arr2);
        System.out.println("The elements of the third array are: ");
        printArray(arr3);
        sc.close();
    }
}
