package infinitiveWord;

import java.util.Scanner;

public class infinitiveWord {
    
    //Method to ask the user for a word to check if it's infinitive
    public static String askForWord() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to check if it's infinitive: ");
        String word = input.nextLine();
        input.close();
        return word;
    }

    //Method to check if the word is infinitive
    public static boolean isInfinitive(String word) {
        if (word.endsWith("ar") || word.endsWith("er") || word.endsWith("ir")) {
            return true;
        } else {
            return false;
        }
    }

    //Method to print the result
    public static void printResult(String word) {
        if (isInfinitive(word)) {
            System.out.println("The word " + word + " is infinitive");
        } else {
            System.out.println("The word " + word + " is not infinitive");
        }
    }


    public static void main(String[] args) {
        String word = askForWord();
        printResult(word);
    }
}
