package rockpaperscissors;

import java.util.Scanner;

public class rockpaperscissors {
    public static void main(String[] args) {
        // Rock paper scissors game
        // 1 = rock, 2 = paper, 3 = scissors
        Scanner input = new Scanner(System.in);
        // We declare the variables
        int player1, player2;
        System.out.println("Rock Paper Scissors");
        System.out.println("Player 1: Enter 1 for rock, 2 for paper, 3 for scissors");
        player1 = input.nextInt();
        System.out.println("Player 2: Enter 1 for rock, 2 for paper, 3 for scissors");
        player2 = input.nextInt();
        // The if condition to check if player 1 or 2 wins
        if (player1 == player2) {
            System.out.println("It's a tie!");
        } 
        else if (player1 == 1 && player2 == 2) {
            System.out.println("Player 2 wins!");
        } 
        else if (player1 == 1 && player2 == 3) {
            System.out.println("Player 1 wins!");
        } 
        else if (player1 == 2 && player2 == 1) {
            System.out.println("Player 1 wins!");
        } 
        else if (player1 == 2 && player2 == 3) {
            System.out.println("Player 2 wins!");
        } 
        else if (player1 == 3 && player2 == 1) {
            System.out.println("Player 2 wins!");
        } 
        else if (player1 == 3 && player2 == 2) {
            System.out.println("Player 1 wins!");
        } 
        else {
            System.out.println("Invalid input");
        }
    }
}
