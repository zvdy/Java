package temperature;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        // We create the constant to convert from Celsius to Fahrenheit & Kelvin
        final double celsiusToFahrenheit = 1.8;
        final double celsiusToKelvin = 273.15;
        // We make the user give us a temperature in Celsius
        System.out.print("Please enter a temperature in Celsius: ");
        // We make a scanner to read the input
        Scanner keyboard = new Scanner(System.in);
        // We read the input and store it in a variable
        double celsius = keyboard.nextDouble();
        // We calculate the temperature in Fahrenheit
        final double fahrenheit = celsiusToFahrenheit * celsius + 32;
        // We calculate the temperature in Kelvin
        final double kelvin = celsiusToKelvin + celsius;
        // We print the results
        System.out.println("The initial value of the temperature in Celsius is : " + celsius);
        System.out.println("The temperature in Fahrenheit is equal to : " + fahrenheit);
        System.out.println("The temperature in Kelvin is equal to : " + kelvin);

    }
}
