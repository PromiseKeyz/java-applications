/*
Write statements that assign random integers to the variable n in the following ranges: 
a) 1 ≤n ≤ 2. 
b) 1 ≤n ≤ 100. 
c) 0 ≤n ≤ 9. 
d) 1000 ≤n ≤ 1112.
 e) –1 ≤n ≤ 1. 
f) –3 ≤n ≤ 11. */

public class RandomRanges {
    public static void main(String[] args) {

        int n; // variable to store random number

        // a) 1 ≤ n ≤ 2
        n = (int)(Math.random() * 2) + 1;
        System.out.println("a) 1 ≤ n ≤ 2 : " + n);

        // b) 1 ≤ n ≤ 100
        n = (int)(Math.random() * 100) + 1;
        System.out.println("b) 1 ≤ n ≤ 100 : " + n);

        // c) 0 ≤ n ≤ 9
        n = (int)(Math.random() * 10);
        System.out.println("c) 0 ≤ n ≤ 9 : " + n);

        // d) 1000 ≤ n ≤ 1112
        n = (int)(Math.random() * 113) + 1000;
        System.out.println("d) 1000 ≤ n ≤ 1112 : " + n);

        // e) –1 ≤ n ≤ 1
        n = (int)(Math.random() * 3) - 1;
        System.out.println("e) –1 ≤ n ≤ 1 : " + n);

        // f) –3 ≤ n ≤ 11
        n = (int)(Math.random() * 15) - 3;
        System.out.println("f) –3 ≤ n ≤ 11 : " + n);
    }
}

