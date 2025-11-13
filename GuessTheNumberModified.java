/*(Guess the Number Modification) Modify the program of Exercise 5.30 to count the number of guesses 
the player makes. If the number is 10 or fewer, display Either you know the secret or you got lucky!
 If the player guesses the number in 10 tries, display Aha! You know the secret! If the player makes
 more than 10 guesses, display You should be able to do better! Why should it take no more than 10 guesses?
 Well, with each “good guess,” the player should be able to eliminate half of the numbers, 
then half of the remaining numbers, and so on. */
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberModified {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain = true;

        System.out.println("🎯 Welcome to the Guess the Number Game!");

        while (playAgain) {
            int numberToGuess = 1 + rand.nextInt(1000); // random number between 1 and 1000
            int userGuess = 0;
            int attempts = 0;

            System.out.println("\nGuess a number between 1 and 1000:");

            while (userGuess != numberToGuess) {
                System.out.print("Enter your guess: ");
                userGuess = input.nextInt();
                attempts++;

                if (userGuess > numberToGuess) {
                    System.out.println("Too high. Try again.\n");
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low. Try again.\n");
                } else {
                    System.out.println("\n🎉 Congratulations! You guessed the number!");
                    System.out.println("It took you " + attempts + " guesses.");

                    // Evaluate performance
                    if (attempts < 10) {
                        System.out.println("Either you know the secret or you got lucky!");
                    } else if (attempts == 10) {
                        System.out.println("Aha! You know the secret!");
                    } else {
                        System.out.println("You should be able to do better!");
                    }
                }
            }

            // Ask if user wants to play again
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
