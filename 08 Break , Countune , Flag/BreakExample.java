// BreakExample.java

public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Loop stopped because i = 5");
                break; // stops the loop
            }
            System.out.println("i = " + i);
        }
        System.out.println("Outside the loop");
    }
}
