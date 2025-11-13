/* (Exponentiation) Write a method integerPower(base, exponent) that returns the value of 
base exponent 
For example, integerPower(3, 4) calculates 34 (or 3*3*3*3).
 Assume that exponent is a positive, nonzero integer and that base is an integer.
 Use a for or while statement to control the calculation. Do not use any Math class methods.
 Incorporate this method into an application that reads integer values for base and 
 exponent and performs the calculation with the integerPower method.*/
 
 
import java.util.Scanner;

public class Exponentiation {

    // Method to calculate integer power
    public static int integerPower(int base, int exponent) {
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer base: ");
        int base = input.nextInt();

        System.out.print("Enter a positive exponent: ");
        int exponent = input.nextInt();

        if (exponent <= 0) {
            System.out.println("Exponent must be a positive, nonzero integer.");
        } else {
            int power = integerPower(base, exponent);
            System.out.printf("%d^%d = %d%n", base, exponent, power);
        }

        input.close();
    }
}
