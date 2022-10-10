package biggestNumfunct;
import java.util.Scanner;
public class biggestNumfunct {
    // Check if n1 is bigger than n2 and return the result
    public static int biggestNum(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }

    public static void main(String[] args) {
        // Ask the user for two numbers and pass them to the function
        System.out.print("Enter two numbers: ");
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        input.close();

        // Print the result
        System.out.println(biggestNum(n1, n2));
        
    }
}
