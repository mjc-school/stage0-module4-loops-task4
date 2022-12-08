package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public static void main(String[] args) {
        printUntilButThird(7);
    }
    public static void printUntilButThird(int lastPrinted) {
        for (int i = 0; i <= lastPrinted; i++) {
            if (i % 3 != 0) {
                System.out.println(i);
            }
        }
    }
}
