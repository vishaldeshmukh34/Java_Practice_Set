
public class SumNumbers {

//     // Question: Take input N from user and calculate the sum of numbers from 1 to N.
    public static void main(String[] args) {
        int N = 5; // define N directly
        int sum = 0;  // variable to store sum

        for(int i = 1; i <= N; i++) {
            sum += i; // add current number to sum
        }

        System.out.println("Sum of numbers from 1 to " + N + " is: " + sum);
    }
}
