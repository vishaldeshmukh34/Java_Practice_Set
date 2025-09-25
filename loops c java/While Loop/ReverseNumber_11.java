// Q11: Write a program to reverse a number using a while loop

class ReverseNumber_11 {
    public static void main(String[] args) {
        int num = 12345;
        int reversed = 0;
        while(num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reversed number = " + reversed);
    }
}