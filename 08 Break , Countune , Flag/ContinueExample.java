// ContinueExample.java

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // skip the number 3
            }
            System.out.println("i = " + i);
        }
    }
}
