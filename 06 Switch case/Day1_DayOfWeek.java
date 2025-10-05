// Q]  Day of the Week
// Write a program that takes an integer (1–7) as input 
// and prints the corresponding day of the week using a switch-case.
// If the number is not between 1 and 7, print 'Invalid Day'.

import java.util.Scanner;

public class Day1_DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid Day");
        }

        sc.close();
    }
}
