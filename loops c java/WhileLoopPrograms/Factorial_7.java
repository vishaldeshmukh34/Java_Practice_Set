// Q7: Write a program to find the factorial of a given number using a while loop

class Factorial_7 {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        while(n > 0) {
            fact = fact * n;
            n = n - 1;
        }
        System.out.println("Factorial is: " + fact);
    }
}