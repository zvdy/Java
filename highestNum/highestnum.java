package highestNum;

import java.util.Scanner;

public class highestnum {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        num2 = input.nextInt();
        if (num1 > num2) {
            System.out.println("The first number is greater than the second number " + "=" +num1);
        } else if (num1 < num2) {
            System.out.println("The second number is greater than the first number " + "=" +num2);
        } else {
            System.out.println("The numbers are equal");
        }
    }
}
