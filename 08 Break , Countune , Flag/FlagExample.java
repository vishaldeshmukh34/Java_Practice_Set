// FlagExample.java

public class FlagExample {
    public static void main(String[] args) {
        int num = 20;
        boolean flag = false; // assume false at start

        for (int i = 1; i <= num; i++) {
            if (i * i == num) { // check if num is a perfect square
                flag = true;
                break; // stop the loop when found
            }
        }

        if (flag) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is not a perfect square.");
        }
    }
}
