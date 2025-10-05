public class SumEven {
    public static void main(String[] args) {
          int sumEven = 0;   // To store sum of even numbers
        int sumOdd = 0;    // To store sum of odd numbers
        
        // Loop from 1 to 100
        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                sumEven += i;    // Add even numbers
            } else {
                sumOdd += i;     // Add odd numbers
            }
        }
        
        // Print results
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);

    }
}
