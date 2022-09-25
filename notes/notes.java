package notes;

import java.util.Scanner;
public class notes {
    public static void main(String[] args) {
        // Check the value of the note and print the corresponding message
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of the note: ");
        int note = input.nextInt();
        if(note == 10){
            System.out.println("A");
        }else if(note == 8){
            System.out.println("B");
        }else if(note == 7){
            System.out.println("C");
        }else if(note == 6){
            System.out.println("D");
        }else if(note == 5){
            System.out.println("E");
        }else if(note == 4){
            System.out.println("F");
        }else{
            System.out.println("G");
        }
    }
}
