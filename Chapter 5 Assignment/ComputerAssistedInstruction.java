/*(Computer-Assisted Instruction) The use of computers in education is referred to as 
computer-assisted instruction (CAI). Write a program that will help an elementary school 
student learn multiplication. Use a SecureRandom object to produce two positive one-digit integers.
 The program should then prompt the user with a question, such as How much is 6 times 7? 
 The student then inputs the answer. Next, the program checks the student’s answer. 
 If it’s correct, display the message "Very good!" and ask another multiplication question.
 If the answer is wrong, display the message "No. Please try again." and let the student
 try the same question repeatedly until the student finally gets it right. 
 A separate method should be used to generate each new question. 
 This method should be called once when the application begins execution and each 
time the user answers the question correctly. */

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {

    // Create a SecureRandom object for generating random numbers
    private static final SecureRandom randomNumbers = new SecureRandom();
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Start the CAI program
        askQuestion();
    }

    // Method to generate and ask a new multiplication question
    public static void askQuestion() {
        // Generate two random one-digit positive integers (1–9)
        int number1 = 1 + randomNumbers.nextInt(9);
        int number2 = 1 + randomNumbers.nextInt(9);

        int correctAnswer = number1 * number2;

        // Ask the question
        System.out.printf("How much is %d times %d?%n", number1, number2);

        int studentAnswer = input.nextInt();

        // Keep asking until the student gets it right
        while (studentAnswer != correctAnswer) {
            System.out.println("No. Please try again.");
            studentAnswer = input.nextInt();
        }

        // If the answer is correct
        System.out.println("Very good!\n");

        // Ask another question
        askQuestion();  // Recursive call to continue the program
    }
}
