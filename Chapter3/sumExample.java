public class sumExample{
    public static void main(String[] args) {
        int x = 1, total = 0;
        while (x <= 10) {
            total += x;
            ++x;
        }
        System.out.println("Total sum: " + total);
    }
}
