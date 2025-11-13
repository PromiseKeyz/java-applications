/*Write statements that will display a random number from each of the following sets: 
a) 2, 4, 6, 8, 10. 
b) 3, 5, 7, 9, 11. 
c) 6, 10, 14, 18, 22. */


public class RandomSets {
    public static void main(String[] args) {
        int n;

        // a) 2, 4, 6, 8, 10
        n = 2 + 2 * (int)(Math.random() * 5);
        System.out.println("a) Random value from {2, 4, 6, 8, 10}: " + n);

        // b) 3, 5, 7, 9, 11
        n = 3 + 2 * (int)(Math.random() * 5);
        System.out.println("b) Random value from {3, 5, 7, 9, 11}: " + n);

        // c) 6, 10, 14, 18, 22
        n = 6 + 4 * (int)(Math.random() * 5);
        System.out.println("c) Random value from {6, 10, 14, 18, 22}: " + n);
    }
}
