// Q: Write a program using a do-while loop to reverse the digits of a given number.

class ReverseNumber_DoWhile2 {
    public static void main(String[] args) {
        int num = 38;      // number to reverse
        int reversed = 0;  // to store reversed number

        do {
            int digit = num % 10;           // get last digit
            reversed = reversed * 10 + digit; // append digit to reversed
            num = num / 10;                  // remove last digit
        } while(num != 0);

        System.out.println("Reversed number: " + reversed);
    }
}
