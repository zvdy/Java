package palindromeNumber;

import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        int x;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number: ");
        x = kb.nextInt();
        kb.close();
        int z = x;
        int y = 0;
        while (x > 0) {
            y = y * 10 + x % 10;
            x = x / 10;
        }
        if (z == y) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
        
            
    }
}
