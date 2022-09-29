package splitSum;

import java.util.Scanner;

public class splitSum {
    public static void main(String[] args) {
        int suma = 0;
        Scanner kb = new Scanner(System.in);
        // We ask the user for the number
        System.out.print("Enter a number: ");
        int num = kb.nextInt();
        kb.close();
        //We divide the number by 10 and return each digit and we sum each digit
        while (num > 0) {
            suma += num % 10;
            System.out.println(num % 10);
            num /= 10;
        }
        // We print the result of the sum
        System.out.println(suma);
    }
}
