class SquareCheck {
    //10. Write a program that prints all numbers from 1 to 100. Use if-else to print 'Even Square' if the square of the number is even, and 'Odd Square' if the square is odd.

    public static void main(String[] args) {
        
        for (int i = 1; i <= 100; i++) {
            int square = i * i;  // calculate square

            if (square % 2 == 0) {
                System.out.println(i + " squared = " + square + " :- Even Square");
            } else {
                System.out.println(i + " squared = " + square + " :- Odd Square");
            }
        }
    }
}
