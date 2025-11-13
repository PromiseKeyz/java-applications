/*(Computer-Assisted Instruction: Reducing Student Fatigue) One problem in CAI environments is student fatigue.
This can be reduced by varying the computer’s responses to hold the student’s attention. 
Modify the program of Exercise 5.35 so that various comments are displayed for each answer as follows:  
Possible responses to a correct answer: 
Very good! 
Excellent! 
Nice work! 
Keep up the good work! 
Possible responses to an incorrect answer: 
No. Please try again. 
Wrong. Try once more. 
Don't give up! No. 
Keep trying. 
Use random-number generation to choose a number from 1 to 4 that will be used to select one of 
the four appropriate responses to each correct or incorrect answer. Use a switch statement to issue the responses. */

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstructionFatigue {

    private static final SecureRandom randomNumbers = new SecureRandom();
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        askQuestionsLoop();
    }

    // Method that repeatedly asks questions using a loop (no recursion)
    public static void askQuestionsLoop() {
        while (true) {
            int number1 = 1 + randomNumbers.nextInt(9);
            int number2 = 1 + randomNumbers.nextInt(9);
            int correctAnswer = number1 * number2;

            System.out.printf("How much is %d times %d? (Enter -1 to quit)%n", number1, number2);
            int studentAnswer = input.nextInt();

            // Allow user to quit
            if (studentAnswer == -1) {
                System.out.println("Goodbye! Keep practicing your math!");
                break;
            }

            // Repeat until correct
            while (studentAnswer != correctAnswer) {
                displayResponse(false);
                studentAnswer = input.nextInt();

                if (studentAnswer == -1) {
                    System.out.println("Goodbye! Keep practicing your math!");
                    return;
                }
            }

            // Correct answer response
            displayResponse(true);
            System.out.println();
        }
    }

    // Randomized feedback messages
    public static void displayResponse(boolean isCorrect) {
        int responseNumber = 1 + randomNumbers.nextInt(4);

        if (isCorrect) {
            switch (responseNumber) {
                case 1: System.out.println("Very good!"); break;
                case 2: System.out.println("Excellent!"); break;
                case 3: System.out.println("Nice work!"); break;
                case 4: System.out.println("Keep up the good work!"); break;
            }
        } else {
            switch (responseNumber) {
                case 1: System.out.println("No. Please try again."); break;
                case 2: System.out.println("Wrong. Try once more."); break;
                case 3: System.out.println("Don't give up!"); break;
                case 4: System.out.println("Keep trying."); break;
            }
        }
    }
}
