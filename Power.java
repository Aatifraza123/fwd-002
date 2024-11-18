public class Power {

    static int Powers(int p, int q) {
        if (q == 0) {
            return 1;
        }
        return Powers(p, q - 1) * p;
    }

    public static void main(String[] args) {
        System.out.println(Powers(2, 3)); // prints 8
    }
}