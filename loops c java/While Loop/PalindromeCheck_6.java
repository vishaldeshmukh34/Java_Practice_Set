// Q6: Write a program to check whether a given number is a palindrome using a while loop

class PalindromeCheck_6 {
    public static void main(String[] args) {
        int num = 1319;
        int originalNum = num;
        int reversed = 0;
        while(num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        if(reversed == originalNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}