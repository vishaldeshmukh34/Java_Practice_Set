// Q13: Write a program to find the sum of all numbers from 1 to 1345 using a while loop.

class SumOfNumbers_13 {
    public static void main(String[] args) {
        
        int a = 1;
        int count = 0;
        
        while(a <= 1345) {
            count = count + a;  // add current number to sum
            a++;
        }
        
        System.out.println("Sum of numbers from 1 to 1345 = " + count);
    }
}
