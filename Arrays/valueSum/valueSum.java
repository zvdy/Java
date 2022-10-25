package Arrays.valueSum;
import java.util.Scanner;
public class valueSum {
    
    // Make the user input the size of two arrays that we will use to sum the index values
    // Method to ask the user for the size of the array1
    public static int askSizeArray1() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int sizeArray1 = input.nextInt();
        return sizeArray1;
    }

    // Method to ask the user for the size of the array2
    public static int askSizeArray2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the second array: ");
        int sizeArray2 = input.nextInt();
        return sizeArray2;
    }

    // Method to ask the user for the values of the array1
    public static int[] askValuesArray1(int sizeArray1) {
        Scanner input = new Scanner(System.in);
        int[] array1 = new int[sizeArray1];
        System.out.println("Enter the values of the first array: ");
        for (int i = 0; i < sizeArray1; i++) {
            array1[i] = input.nextInt();
        }
        return array1;
    }

    // Method to ask the user for the values of the array2
    public static int[] askValuesArray2(int sizeArray2) {
        Scanner input = new Scanner(System.in);
        int[] array2 = new int[sizeArray2];
        System.out.println("Enter the values of the second array: ");
        for (int i = 0; i < sizeArray2; i++) {
            array2[i] = input.nextInt();
        }
        input.close();
        return array2;
    }

    // Method to sum the values of the two arrays and store them in a third array with the same size as the biggest
    public static int[] sumValues(int[] array1, int[] array2) {
        int sizeArray1 = array1.length;
        int sizeArray2 = array2.length;
        int sizeArray3 = 0;
        if (sizeArray1 > sizeArray2) {
            sizeArray3 = sizeArray1;
        } else {
            sizeArray3 = sizeArray2;
        }
        int[] array3 = new int[sizeArray3];
        for (int i = 0; i < sizeArray3; i++) {
            if (i < sizeArray1 && i < sizeArray2) {
                array3[i] = array1[i] + array2[i];
            } else if (i < sizeArray1) {
                array3[i] = array1[i];
            } else {
                array3[i] = array2[i];
            }
        }
        return array3;
    }        

    // Method to print the values of the array3
    public static void printValues(int[] array3) {
        int sizeArray3 = array3.length;
        System.out.println("The values of the third array are: ");
        for (int i = 0; i < sizeArray3; i++) {
            System.out.println(array3[i]);
        }
    }

    public static void main(String[] args) {
        int sizeArray1 = askSizeArray1();
        int sizeArray2 = askSizeArray2();
        int[] array1 = askValuesArray1(sizeArray1);
        int[] array2 = askValuesArray2(sizeArray2);
        int[] array3 = sumValues(array1, array2);
        printValues(array3);
    }
}
