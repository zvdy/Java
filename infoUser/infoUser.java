package infoUser;

import java.util.Scanner;

public class infoUser {

    public static void main(String[] args) {
        // We create user inputs for Name, Surname, ID, Sex and age
        String name;
        String surname;
        String ID;
        String sex;
        String age;
        // We ask the user for the inputs
        System.out.print("Enter your name: ");
        Scanner kb = new Scanner(System.in);
        name = kb.nextLine();
        System.out.print("Enter your surname: ");
        Scanner kb0 = new Scanner(System.in);
        surname = kb0.nextLine();
        System.out.print("Enter your ID: ");
        Scanner kb1 = new Scanner(System.in);
        ID = kb1.nextLine();
        System.out.print("Enter your Sex: ");
        Scanner kb2 = new Scanner(System.in);
        sex = kb2.nextLine();
        System.out.print("Enter your age: ");
        Scanner kb3 = new Scanner(System.in);
        // We print out the results on a user friendly way
        age = kb3.nextLine();
        kb.close();
        kb0.close();
        kb1.close();
        kb2.close();
        kb3.close();
        System.out.println("--------------------");
        System.out.println("Your name is: " + name);
        System.out.println("Your surname is: " + surname);
        System.out.println("Your ID is: " + ID);
        System.out.println("Your Sex is: " + sex);
        System.out.println("Your age is: " + age);

    }
}
