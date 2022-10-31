package Arrays.subString;
import java.util.Scanner;

public class subString {
    
    public static Scanner input = new Scanner(System.in);
    // Check if the string is a substring of the other string
    // Ask the user to enter a phrase that will contain a subtring
    public static String askPhrase() {
        System.out.print("Enter a phrase: ");
        String phrase = input.nextLine();
        return phrase;
    }

    // Ask the user to enter a substring
    public static String askSubString() {
        System.out.print("Enter a substring: ");
        String subString = input.nextLine();
        return subString;
    }
    // Check if the substring is present in the phrase
    public static boolean checkSubString(String phrase, String subString) {
        boolean isSubString = false;
        int sizeSubString = subString.length();
        int sizePhrase = phrase.length();
        for (int i = 0; i < sizePhrase; i++) {
            if (i + sizeSubString <= sizePhrase) {
                String subString2 = phrase.substring(i, i + sizeSubString);
                if (subString2.equals(subString)) {
                    isSubString = true;
                }
            }
        }
        return isSubString;
    }

    public static void main(String[] args) {
        String phrase = askPhrase();
        String subString = askSubString();
        boolean isSubString = checkSubString(phrase, subString);
        if (isSubString) {
            System.out.println("The substring is present in the phrase");
        } else {
            System.out.println("The substring is not present in the phrase");
        }   
    }
}
