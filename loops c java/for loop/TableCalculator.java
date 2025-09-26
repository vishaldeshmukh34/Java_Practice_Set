// File Name: TableCalculator.java
// This program prints the multiplication table of a number, counts the digits, and sums the table values.

class TableCalculator {
    public static void main(String[] args) {
        int table = 5;
        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            count++;
            sum += table; // Add the table number to sum
            System.out.println(table * i); // Print table
        }

        System.out.println("Table In: " + table);
        System.out.println("This Is Count Of All Table Digits: " + count);
        System.out.println("This Is Sum Of Table: " + sum);
    }
}
