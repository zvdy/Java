package factorial;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        // Ask a user fot a number and return the factorial of that number
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        input.close();
        int number = input.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + number + " is " + factorial);

    }
}
