// Q8: Write a program to print all prime numbers between 1 and 50 using a while loop

class PrimeNumbers_8 {
    public static void main(String[] args) {
        int num = 2;
        while(num <= 50) {
            boolean isPrime = true;
            int i = 2;
            while(i <= num / 2) {
                if(num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            if(isPrime) {
                System.out.println(num);
            }
            num++;
        }
    }
}