package circumference;

// we import the Scanner class from the java.util package
import java.util.Scanner;

public class circumference {
    public static void main(String[] args) {
        // We make the user give us a radius
        System.out.print("Please enter a radius: ");
        // We make a scanner to read the input
        Scanner keyboard = new Scanner(System.in);
        // We read the input and store it in a variable
        double radius = keyboard.nextDouble();
        // We declare the value of pi
        final double pi = 3.1516;
        // We calculate the circumference
        final double sqrt = Math.pow(radius, 2); 
        // We create the area variable (pi * radius^2)
        final double area = pi * sqrt;
        // We create the permiterer variable ( 2 * pi * radius )
        final double perimeter = 2 * pi * radius;
        
        // We print the results
        System.out.println("The initial value of the radius is : " + radius);
        System.out.println("The area is equal to : " + area);
        System.out.println("The permiter is equal to : " + perimeter);

    }
}
