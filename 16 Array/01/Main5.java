import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        int sum = 0;

        System.out.println("Enter 10 numbers:");

        // take input
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
          System.out.println("This your Odd Number :- ");
        // check and add odd numbers
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {  // odd number condition
                System.out.println(numbers[i]);
                sum = sum + numbers[i];
                
            }
        }

        System.out.println("\nSum of all odd numbers: " + sum);

        sc.close();
    }

 
    
}
