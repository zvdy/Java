package bigSum;

import java.util.Scanner;

public class bigSum {
    public static void main(String[] args) {
        // We read a user int input and print the sum of all numbers +100 
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = kb.nextInt();
        kb.close();
        int bignum = number + 100;
        // We use a for loop to iterate through all numbers between number and bignum and return the sum
        int sum = 0;
        for (int i = number; i <= bignum; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
