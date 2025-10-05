// File Name: DigitSum.java
// Program to add all the digits of a number without using Scanner

class DigitSum {
    public static void main(String[] args) {
        int num = 1234;   // you can change the number here
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;  // extract last digit
            sum += digit;          // add digit to sum
            num = num / 10;        // remove last digit
        }

        System.out.println("Sum of digits = " + sum);
    }
}
