import java.util.Scanner;

public class party {
    public static void main(String[] args) {
        // we create a boolean value to determinate if the user is drunk or not
        boolean drunk = false;
        // we create a scanner to read the user input and get their age
        int age;
        Scanner key= new Scanner(System.in);
        System.out.println("How old are you?");
        age = key.nextInt();
        // we check if the user is 18 or older and if they are we set the drunk value to true
        if (drunk==true && age>=18) {
            System.out.println("You are not allowed to drink.");
        } else {
            System.out.println("You are allowed to drink.");
        }
    }
}