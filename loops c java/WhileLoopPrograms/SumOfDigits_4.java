// Q4: Write a program to find the sum of digits of a given number using a while loop

class SumOfDigits_4 {
    public static void main(String[] args) {
        int num = 123;
        int sum = 0;
        while(num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println("Sum of digits = " + sum);
    }
}