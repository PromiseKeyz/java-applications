/*
(Craps Game Modification) Modify the craps program of Fig. 5.8 to allow wagering. 
Initialize variable bankBalance to 1000 dollars. Prompt the player to enter a wager.
 Check that wager is less than or equal to bankBalance, and if it’s not, 
 have the user reenter wager until a valid wager is entered. Then, run one game of craps.
 If the player wins, increase bankBalance by wager and display the new bankBalance. 
 If the player loses, decrease bankBalance by wager, display the new bankBalance, 
 check whether bankBalance has become zero and, if so, display the message "Sorry. 
 You busted!" As the game progresses, display various messages to create some “chatter,” such as "Oh, 
 you're going for broke, huh?" or "Aw c'mon, take a chance!" or "You're up big. Now's the time to cash in your chips!".
 Implement the “chatter” as a separate method that randomly chooses the string to display.*/
 
 import java.util.Random;
import java.util.Scanner;

public class CrapsWithWager {

    private static final Random randomNumbers = new Random();

    private enum Status { CONTINUE, WON, LOST }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double bankBalance = 1000.0;

        System.out.println("🎲 Welcome to the Craps Game with Wagering! 🎲");
        System.out.printf("You start with a bank balance of $%.2f%n", bankBalance);

        while (bankBalance > 0) {
            System.out.print("\nEnter your wager: $");
            double wager = input.nextDouble();

            // Ensure wager is valid
            while (wager <= 0 || wager > bankBalance) {
                System.out.printf("Invalid wager! You have $%.2f%n", bankBalance);
                System.out.print("Re-enter your wager: $");
                wager = input.nextDouble();
            }

            // Play one game of craps
            boolean playerWon = playCraps();

            // Update balance
            if (playerWon) {
                bankBalance += wager;
                System.out.printf("🏆 You win! Your new balance is $%.2f%n", bankBalance);
            } else {
                bankBalance -= wager;
                System.out.printf("💸 You lose! Your new balance is $%.2f%n", bankBalance);

                if (bankBalance == 0) {
                    System.out.println("😢 Sorry. You busted!");
                    break;
                }
            }

            // Display random chatter
            chatterMessage();

            // Ask if player wants to play again
            System.out.print("\nDo you want to play again? (yes/no): ");
            String answer = input.next().toLowerCase();

            if (!answer.equals("yes")) {
                System.out.println("\n🎮 Thanks for playing! Your final balance: $" + bankBalance);
                break;
            }
        }

        input.close();
    }

    // 🎲 Method to simulate one game of Craps
    public static boolean playCraps() {
        int myPoint = 0;
        Status gameStatus;

        int sumOfDice = rollDice();

        switch (sumOfDice) {
            case 7:
            case 11:
                gameStatus = Status.WON;
                break;
            case 2:
            case 3:
            case 12:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is set to %d%n", myPoint);
                break;
        }

        while (gameStatus == Status.CONTINUE) {
            sumOfDice = rollDice();

            if (sumOfDice == myPoint)
                gameStatus = Status.WON;
            else if (sumOfDice == 7)
                gameStatus = Status.LOST;
        }

        return gameStatus == Status.WON;
    }

    // 🎲 Roll dice and return the sum
    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        int sum = die1 + die2;

        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }

    // 💬 Random chatter messages
    public static void chatterMessage() {
        int message = 1 + randomNumbers.nextInt(4);

        switch (message) {
            case 1:
                System.out.println("💬 Oh, you're going for broke, huh?");
                break;
            case 2:
                System.out.println("💬 Aw c'mon, take a chance!");
                break;
            case 3:
                System.out.println("💬 You're up big! Now's the time to cash in your chips!");
                break;
            case 4:
                System.out.println("💬 Feeling lucky? Let’s see what happens!");
                break;
        }
    }
}
