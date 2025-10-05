// Q14: Write a program using a while loop to count numbers from 1 to 50
//      and also find the sum of these numbers.

class CountAndSum_14 {
    public static void main(String[] args) {
        
        int a = 1;
        int count = 0;
        int sum = 0;
        
        while(a <= 50) {
            count = a;        // keeps track of last number (count up to 50)
            sum = sum + a;    // adds numbers to sum
            a++;
        }
        
        System.out.println("The Total Number Count :- " + count);
        System.out.println("The Total Number Sum :- " + sum);
    }
}
