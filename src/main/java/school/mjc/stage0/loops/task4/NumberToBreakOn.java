package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public static void main(String[] args) {
        printNumbersUntilWithBreakOn(6, 5);
    }

    public static void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {

        for (int i = 1; i <= numberToGoUntil; i++) {
            if (toBreakWith >= numberToGoUntil) {
                boolean stop = i == 1;
                while (stop) {
                    System.out.println("iterating till the end");
                    stop = false;
                }
                System.out.println(i);
            } else {
                System.out.println(i);
                if (i == toBreakWith) break;
            }
        }

    }
}
