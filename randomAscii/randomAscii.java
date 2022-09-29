package randomAscii;

public class randomAscii {
    public static void main(String[] args) {
        // We create a random number between 33 and 126
        int random = (int) (Math.random() * (126 - 33 + 1) + 33);
        System.out.println("");
        // We print the random number
        System.out.println(random);
        // We print the random number in ASCII
        System.out.println((char) random);
        // We check if the number is a character or a number and return the information to the user
        if (random >= 48 && random <= 57) {
            System.out.println("The random number is a number");
        } else if (random >= 65 && random <= 90) {
            System.out.println("The random number is a capital letter");
        } else if (random >= 97 && random <= 122) {
            System.out.println("The random number is a small letter");
        } else {
            System.out.println("The random number is a special character");
        }
    }
}
