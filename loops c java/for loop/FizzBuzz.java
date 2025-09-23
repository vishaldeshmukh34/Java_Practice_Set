class FizzBuzz {
    public static void main(String[] args) {

        // 2. Write a program to print numbers from 1 to 50. If a number is divisible by 3, print 'Fizz', if divisible by 5 print 'Buzz', otherwise print the number itself.

        for(int i = 1 ; i <= 50 ; i++) {
            if(i % 3 == 0) {
                System.out.println("Fizz :- " + i);
            } else if(i % 5 == 0) {
                System.out.println("Buzz :- " + i);
            } else {
                System.out.println("Itself :- " + i);
            }
        }
    }
}
