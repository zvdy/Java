package twinNum;

import java.util.Scanner;

public class twinNum {
    public static void main(String[] args) {
        // Ask the user for two inputs
        int num1,num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        num2 = input.nextInt();
        input.close();
        // Check if the last digit of the first number is equal to the last digit of the second number, if so print Twins
        if (num1 % 10 == num2 % 10) {
            System.out.println("Twins "+num1+ " " +num2);
        }
        // If the last digit of the first number is not equal to the last digit of the second number, print Not Twins
        else {
            System.out.println("Not Twins "+num1+" "+num2);
        }

    }
}
