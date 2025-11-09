import java.util.Scanner;
// 3. WAP to accept 5 boolean values from user and count all true values.
public class Main3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean[] values = new boolean[5];
        int count = 0;

        System.out.println("Enter 5 boolean values (true or false):");

        // input boolean values
        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextBoolean();  // user must type true or false
        }

        // count true values
        for (int i = 0; i < values.length; i++) {
            if (values[i]) {   // same as if (values[i] == true)
                count++;
            }
        }

        System.out.println("\nNumber of true values: " + count);

        sc.close();
    }
}
