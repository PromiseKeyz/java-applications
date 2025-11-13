/*(Guess the Number) Write an application that plays “guess the number” as follows:
 Your program chooses the number to be guessed by selecting a random integer in the
 range 1 to 1000. The application displays the prompt Guess a number between 1 and 1000.
 The player inputs a first guess. If the player's guess is incorrect, your program should
 display Too high. Try again. or Too low. Try again. to help the player “zero in” on the correct answer. 
 The program should prompt the user for the next guess. When the user enters the correct answer, display Congratulations. 
You guessed the number!, and allow the user to choose whether to play again.*/

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain = true;

        System.out.println("🎯 Welcome to the Guess the Number Game!");

        while (playAgain) {
            // Step 1: Generate random number between 1 and 1000
            int numberToGuess = 1 + rand.nextInt(1000);
            int userGuess = 0;
            int attempts = 0;

            System.out.println("\nGuess a number between 1 and 1000:");

            // Step 2: Loop until correct guess
            while (userGuess != numberToGuess) {
                System.out.print("Enter your guess: ");
                userGuess = input.nextInt();
                attempts++;

                if (userGuess > numberToGuess) {
                    System.out.println("Too high. Try again.\n");
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low. Try again.\n");
                } else {
                    System.out.println("🎉 Congratulations! You guessed the number!");
                    System.out.println("It took you " + attempts + " tries.");
                }
            }

            // Step 3: Ask user if they want to play again
            System.out.print("\nWould you like to play again? (yes/no): ");
            String response = input.next().toLowerCase();

            if (!response.equals("yes")) {
                playAgain = false;
                System.out.println("\nThanks for playing! Goodbye 👋");
            }
        }

        input.close();
    }
}
