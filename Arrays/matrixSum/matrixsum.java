package Arrays.matrixSum;
import java.util.Scanner;
public class matrixsum {
    
    // Create a method to ask a user for 9 numbers
    public static int[] numbers = new int[9];
    public static void inputNumbers() {
        System.out.println("Enter 9 numbers: ");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        input.close();
    }

    // Create a method to create a 3x3 matrix
    public static int[][] matrix = new int[3][3];
    public static void createMatrix() {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = numbers[count];
                count++;
            }
        }
    }

    // Create a method to display the matrix with lines between them like a table
    public static void displayMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    // Create a method to display the sum of each line of the matrix
    public static void displaySum() {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            System.out.println("The sum of line " + (i + 1) + " is: " + sum);
            sum = 0;
        }
    }

    // Create a method to display the sum of each column of the matrix
    public static void displayColumnSum() {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[j][i];
            }
            System.out.println("The sum of column " + (i + 1) + " is: " + sum);
            sum = 0;
        }
    }

    // Create a method to display the sum of the diagonal of the matrix
    public static void displayDiagonalSum() {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        System.out.println("The sum of the diagonal is: " + sum);
    }

    // Create a method to display the sum of the reverse diagonal of the matrix
    public static void displayReverseDiagonalSum() {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][matrix.length - 1 - i];
        }
        System.out.println("The sum of the reverse diagonal is: " + sum);
    }

    // Create a method to display the sum of the matrix
    public static void displayMatrixSum() {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("The sum of the matrix is: " + sum);
    }

    // Create a main method to call all the methods
    public static void main(String[] args) {
        inputNumbers();
        createMatrix();
        displayMatrix();
        displaySum();
        displayColumnSum();
        displayDiagonalSum();
        displayReverseDiagonalSum();
        displayMatrixSum();
    }

}
