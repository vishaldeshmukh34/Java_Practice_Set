package MyJavaProgram;

public class ClubPrograms {

    // File Name: ClubPrograms.java
// Simple & Readable Java Programs (Auto-run All 16 Programs)
    public static void main(String[] args) {
        System.out.println("\n===== CLUB PROGRAMS (AUTO RUN) =====\n");

        // ===== Auto-run all programs with example values =====
        factorial(5);
        isPrime(29);
        fibonacci(10);
        reverse(12345);
        sumOfDigits(9876);
        palindrome(121);
        armstrong(153);
        evenOdd(42);
        gcd(54, 24);
        lcm(12, 18);
        countDigits(987654);
        largestDigit(93847);
        smallestDigit(93847);
        power(2, 10);
        swap(5, 9);
        multiplicationTable(7);

        System.out.println("\n===== END OF PROGRAMS =====");
    }

    // ================== Method Definitions ==================

    // 1. Factorial of n
    static void factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        System.out.println("1) Factorial of " + n + " = " + f);
    }

    // 2. Prime Number Check
    static void isPrime(int n) {
        boolean prime = true;
        if (n <= 1) prime = false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) { prime = false; break; }
        }
        System.out.println("2) " + n + (prime ? " is Prime" : " is Not Prime"));
    }

    // 3. Fibonacci Series
    static void fibonacci(int terms) {
        int a = 0, b = 1;
        System.out.print("3) Fibonacci Series: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int c = a + b; a = b; b = c;
        }
        System.out.println();
    }

    // 4. Reverse Number
    static void reverse(int n) {
        int rev = 0, temp = n;
        while (n > 0) { rev = rev * 10 + (n % 10); n /= 10; }
        System.out.println("4) Reverse of " + temp + " = " + rev);
    }

    // 5. Sum of Digits
    static void sumOfDigits(int n) {
        int sum = 0, temp = n;
        while (n > 0) { sum += n % 10; n /= 10; }
        System.out.println("5) Sum of digits of " + temp + " = " + sum);
    }

    // 6. Palindrome Number
    static void palindrome(int n) {
        int rev = 0, temp = n;
        while (n > 0) { rev = rev * 10 + (n % 10); n /= 10; }
        System.out.println("6) " + temp + (temp == rev ? " is Palindrome" : " is Not Palindrome"));
    }

    // 7. Armstrong Number
    static void armstrong(int n) {
        int sum = 0, temp = n, digits = 0;
        int t = n;
        while (t > 0) { digits++; t /= 10; }
        t = n;
        while (t > 0) { int d = t % 10; sum += Math.pow(d, digits); t /= 10; }
        System.out.println("7) " + n + (sum == n ? " is Armstrong" : " is Not Armstrong"));
    }

    // 8. Even or Odd
    static void evenOdd(int n) {
        System.out.println("8) " + n + (n % 2 == 0 ? " is Even" : " is Odd"));
    }

    // 9. GCD (Greatest Common Divisor)
    static void gcd(int a, int b) {
        int x = a, y = b;
        while (y != 0) {
            int temp = y; y = x % y; x = temp;
        }
        System.out.println("9) GCD of " + a + " and " + b + " = " + x);
    }

    // 10. LCM (Least Common Multiple)
    static void lcm(int a, int b) {
        int x = a, y = b;
        while (y != 0) {
            int temp = y; y = x % y; x = temp;
        }
        int lcm = (a * b) / x;
        System.out.println("10) LCM of " + a + " and " + b + " = " + lcm);
    }

    // 11. Count Digits
    static void countDigits(int n) {
        int count = 0, temp = n;
        while (temp > 0) { count++; temp /= 10; }
        System.out.println("11) Number of digits in " + n + " = " + count);
    }

    // 12. Largest Digit
    static void largestDigit(int n) {
        int max = 0, temp = n;
        while (n > 0) { max = Math.max(max, n % 10); n /= 10; }
        System.out.println("12) Largest digit in " + temp + " = " + max);
    }

    // 13. Smallest Digit
    static void smallestDigit(int n) {
        int min = 9, temp = n;
        while (n > 0) { min = Math.min(min, n % 10); n /= 10; }
        System.out.println("13) Smallest digit in " + temp + " = " + min);
    }

    // 14. Power of a Number
    static void power(int base, int exp) {
        long result = 1;
        for (int i = 1; i <= exp; i++) result *= base;
        System.out.println("14) " + base + "^" + exp + " = " + result);
    }

    // 15. Swap Two Numbers
    static void swap(int a, int b) {
        System.out.println("15) Before swap: a=" + a + ", b=" + b);
        int temp = a; a = b; b = temp;
        System.out.println("    After swap: a=" + a + ", b=" + b);
    }

    // 16. Multiplication Table
    static void multiplicationTable(int n) {
        System.out.println("16) Table of " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println("    " + n + " x " + i + " = " + (n * i));
        }
    }
}

    

