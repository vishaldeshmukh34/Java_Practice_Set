// Q3: Write a program to print the multiplication table of a given number using a while loop

class MultiplicationTable_3 {
    public static void main(String[] args) {
        int table = 3 ;
        int n = 1 ;
        while(n <= 10) {
            System.out.println(table + " * " + n + " = " + (table * n));
            n++;
        }
    }
}