package evenodd;

public class evenodd {
    //check if number is even or odd
    public static void main(String[] args) {
        // we create the variable number
        int number = 5;
        // do a if where we check the remainder of dividing our variable to 2, so we can determinate if it is even or odd
        if (number % 2 == 0) {
            System.out.println("The number is even");
        }
        // if the var isn't divisible by 2 we print out 'odd'
        else {
            System.out.println("The number is odd");
        }
    }
}
