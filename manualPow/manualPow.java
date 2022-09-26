package manualPow;

import java.util.Scanner;

public class manualPow {
   public static void main(String[] args) {
    // We output the pow of an input and a power without using the pow function
    // We use a for loop to multiply the input by itself the number of times of the power
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = input.nextInt();
    System.out.print("Enter a power: ");
    int pow = input.nextInt();
    input.close();
    int result = 1;
    for (int i = 0; i < pow; i++) {
      result *= num;
    }
    System.out.println("The result is: " + result);
    }
}
