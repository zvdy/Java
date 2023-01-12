package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptions {
    public static Scanner tc = new Scanner(System.in); 
    public static int readnum () {
        System.out.print("Insert a num: ");
        return tc.nextInt();
    }
    public static void main(String[] args) {
    int a, b;
    try {
    a= readnum();
    b= readnum();
    int result=a/b;
    System.out.println("Result is " + result);
    }

    catch (ArithmeticException ex1) {
        System.out.println("Can´t divide by zero");
    }

    catch (InputMismatchException ex2) {
        System.out.println("Can´t insert text");
    }

    finally {
        System.out.println("Goodbye!");   
    }

    }
}