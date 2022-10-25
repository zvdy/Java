package Arrays.TwoStrings;
import java.util.Scanner;

public class TwoStrings {
    
    // Anagram checker with Arrays
    // Method to make the user input a String and save it into array1
    public static Scanner input = new Scanner(System.in);
    
    public static void inputString1(String[] array1) {
        System.out.println("Enter the first string: ");
        String string1 = input.nextLine();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = string1.substring(i, i + 1);
        }
    }

    // Method to make the user input a String and save it into array2
    public static void inputString2(String[] array2) {
        System.out.println("Enter the second string: ");
        String string2 = input.nextLine();
        for (int i = 0; i < array2.length; i++) {
            array2[i] = string2.substring(i, i + 1);
        }
    }

    // Method to check if the two strings are anagrams using for each
    public static void checkAnagram(String[] array1, String[] array2) {
        int count = 0;
        for (String i : array1) {
            for (String j : array2) {
                if (i.equals(j)) {
                    count++;
                }
            }
        }
        if (count == array1.length) {
            System.out.println("The two strings are anagrams");
        } else {
            System.out.println("The two strings are not anagrams");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the length of the strings: ");
        int length = input.nextInt();
        input.nextLine();
        String[] array1 = new String[length];
        String[] array2 = new String[length];
        inputString1(array1);
        inputString2(array2);
        checkAnagram(array1, array2);
    }
}
