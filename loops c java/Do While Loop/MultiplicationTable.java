public class MultiplicationTable {
    public static void main(String[] args) {
        
        int i = 1; // outer counter for table number

        // Outer loop for tables
        do {
            System.out.println("Multiplication Table of " + i);

            int j = 1; // inner counter for multipliers
            // Inner loop for each table
            do {
                System.out.println(i + " x " + j + " = " + (i * j));
                j++;
            } while (j <= 10);

            System.out.println(); // blank line after each table
            i++; // move to next table

        } while (i <= 10); // stop when i > 10
    }
}
