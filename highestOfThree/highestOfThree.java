package highestOfThree;

import java.util.Scanner;
public class highestOfThree {
    public static void main(String[] args) {
        // We create a checker to see what the highest number is out of three inputs
        // We declare the variables
        int num1, num2, num3;
        // We create the scanner
        Scanner input = new Scanner(System.in);
        // We ask the user for the numbers
        System.out.print("Enter the first number: ");
        num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        num3 = input.nextInt();
        input.close();
        // We check if all the numbers are the same
        if (num1 == num2 && num1 == num3) {
            System.out.println("All the numbers are the same");
        }// We check if the first number is the highest
        else if (num1 > num2 && num1 > num3) {
            System.out.println("The highest number is " + num1);
        }
        // We check if the second number is the highest
        else if (num2 > num1 && num2 > num3) {
            System.out.println("The highest number is " + num2);
        }
        // We check if the third number is the highest
        else if (num3 > num1 && num3 > num2) {
            System.out.println("The highest number is " + num3);
        }
        // We check if the first and second number are the same
        else if (num1 == num2) {
            System.out.println("The first and second number are the same");
        }
        // We check if the first and third number are the same
        else if (num1 == num3) {
            System.out.println("The first and third number are the same");
        }
        // We check if the second and third number are the same
        else if (num2 == num3) {
            System.out.println("The second and third number are the same");
        }
        
        
    }

}
