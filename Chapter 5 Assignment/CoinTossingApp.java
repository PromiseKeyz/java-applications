/*(Coin Tossing) Write an application that simulates coin tossing. 
Let the program toss a coin each time the user chooses the “Toss Coin” menu option. 
Count the number of times each side of the coin appears. Display the results. 
The program should call a separate method flip that takes no arguments 
and returns a value from a Coin enum (HEADS and TAILS). [Note: 
If the program realistically simulates coin tossing, each side of the coin should appear approximately half the time.]*/ 

import java.util.Random;
import java.util.Scanner;

public class CoinTossingApp {

    // Enum for coin sides
    enum Coin {
        HEADS, TAILS
    }

    // Method to simulate flipping a coin
    public static Coin flip() {
        Random rand = new Random();
        int result = rand.nextInt(2);  // 0 or 1
        return (result == 0) ? Coin.HEADS : Coin.TAILS;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int headsCount = 0;
        int tailsCount = 0;

        while (true) {
            System.out.println("\n=== Coin Toss Menu ===");
            System.out.println("1. Toss Coin");
            System.out.println("2. Show Results");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();

            if (choice == 1) {
                Coin tossResult = flip();
                System.out.println("You flipped: " + tossResult);

                if (tossResult == Coin.HEADS)
                    headsCount++;
                else
                    tailsCount++;
            } 
            else if (choice == 2) {
                int total = headsCount + tailsCount;
                System.out.println("\n=== Results ===");
                System.out.println("Heads: " + headsCount);
                System.out.println("Tails: " + tailsCount);
                System.out.println("Total tosses: " + total);
                if (total > 0) {
                    System.out.printf("Heads: %.2f%% | Tails: %.2f%%%n",
                        (headsCount * 100.0 / total), (tailsCount * 100.0 / total));
                }
            } 
            else if (choice == 3) {
                System.out.println("Exiting program. Goodbye!");
                break;
            } 
            else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        input.close();
    }
}
