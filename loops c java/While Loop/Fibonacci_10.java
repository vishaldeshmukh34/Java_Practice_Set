// Q10: Write a program to print the first 10 Fibonacci numbers using a while loop

class Fibonacci_10 {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, count = 1;
        while(count <= 10) {
            System.out.print(n1 + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            count++;
        }
    }
}