/*What is the value of x after each of the following statements is executed? 
a) x = Math.abs(7.5); 
b) x = Math.floor(7.5); 
c) x = Math.abs(0.0); 
d) x = Math.ceil(0.0); 
e) x = Math.abs(-6.4); 
f) x = Math.ceil(-6.4); 
g) x = Math.ceil(-Math.abs(-8 + Math.floor(-5.5)));*/


import java.util.Scanner;

public class AbsoluteNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // user input (optional, just to start interaction)
        System.out.print("Enter any number (for interaction): ");
        double num = input.nextDouble();

        System.out.println("\nResults of each Math operation:\n");

        double x;

        // a)
        x = Math.abs(7.5);
        System.out.printf("a) x = Math.abs(7.5) → %.2f%n", x);

        // b)
        x = Math.floor(7.5);
        System.out.printf("b) x = Math.floor(7.5) → %.2f%n", x);

        // c)
        x = Math.abs(0.0);
        System.out.printf("c) x = Math.abs(0.0) → %.2f%n", x);

        // d)
        x = Math.ceil(0.0);
        System.out.printf("d) x = Math.ceil(0.0) → %.2f%n", x);

        // e)
        x = Math.abs(-6.4);
        System.out.printf("e) x = Math.abs(-6.4) → %.2f%n", x);

        // f)
        x = Math.ceil(-6.4);
        System.out.printf("f) x = Math.ceil(-6.4) → %.2f%n", x);

        // g)
        x = Math.ceil(-Math.abs(-8 + Math.floor(-5.5)));
        System.out.printf("g) x = Math.ceil(-Math.abs(-8 + Math.floor(-5.5))) → %.2f%n", x);

        input.close();
    }
}

   