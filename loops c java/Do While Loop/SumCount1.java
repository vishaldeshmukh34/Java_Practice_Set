// Q: Write a program using a do-while loop to calculate 
//    the total count and sum of numbers from 1 to 100.

class SumCount1 {
    public static void main(String[] args) {
        int i = 1;      // start number
        int count = 0;  // will hold last counted number
        int sum = 0;    // will hold sum of numbers

        do {
            count = i;      // update count
            sum = sum + i;  // add to sum
            i++;
        }
        while (i <= 100);

        System.out.println("The Total Number Count: " + count);
        System.out.println("The Total Number Sum: " + sum);
    }
}
