package leapYearFunction;

import java.util.Scanner;
public class leapYearFunction {
    // Check if a year is leep or not and return Leap or Not Leap
    public static String isLeap(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return "Leap";
                } else {
                    return "Not Leap";
                }
            } else {
                return "Leap";
            }
        } else {
            return "Not Leap";
        }
    }
    
    public static void main(String[] args) {
        // Ask the user for a year and pass it to the function
        System.out.print("Enter a year: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        input.close();

        // Print the result
        System.out.println(isLeap(year));

    }
}
