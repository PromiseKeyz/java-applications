/*(Prime Numbers) A positive integer is prime if it’s divisible by only 1 and itself. 
For example, 2, 3, 5 and 7 are prime, but 4, 6, 8 and 9 are not.
 The number 1, by definition, is not prime. 
a) Write a method that determines whether a number is prime. 
b) Use this method in an application that determines and displays all the prime numbers less than 10,000. 
How many numbers up to 10,000 do you have to test to ensure that you’ve found all the primes? 
c) Initially, you might think that n/2 is the upper limit for which you must test to see whether a number n is prime, 
but you need only go as high as the square root of n. Rewrite the program, and run it both ways. */

public class PrimeNumbersApp {

    // Prime check up to n/2
    public static boolean isPrimeHalf(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Prime check up to sqrt(n)
    public static boolean isPrimeSqrt(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int limit = 10000;

        System.out.println("Prime numbers < 10,000 using n/2 method:");
        int testCountHalf = 0;
        for (int n = 2; n < limit; n++) {
            for (int i = 2; i <= n / 2; i++) testCountHalf++;
            if (isPrimeHalf(n)) System.out.print(n + " ");
        }
        System.out.println("\nTotal divisibility tests (n/2 method): " + testCountHalf);

        System.out.println("\nPrime numbers < 10,000 using sqrt(n) method:");
        int testCountSqrt = 0;
        for (int n = 2; n < limit; n++) {
            for (int i = 2; i * i <= n; i++) testCountSqrt++;
            if (isPrimeSqrt(n)) System.out.print(n + " ");
        }
        System.out.println("\nTotal divisibility tests (sqrt(n) method): " + testCountSqrt);
    }
}

