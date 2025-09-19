// 2. Calculator 
// Create a program that takes two integers and a character as input (+, -, *, /). 
// Use switch-case to perform the corresponding arithmetic operation and print the result.

import java.util.Scanner;

public class Day2_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter operation (+, -, *, /, %): ");
        char operation = sc.next().charAt(0);

        switch (operation) {
            case '+': System.out.println("Result = " + (a + b)); break;
            case '-': System.out.println("Result = " + (a - b)); break;
            case '*': System.out.println("Result = " + (a * b)); break;
            case '/': System.out.println("Result = " + (a / b)); break;
            case '%': System.out.println("Result = " + (a % b)); break;
            default:  System.out.println("THIS IS INVALID");
        }

        sc.close();
    }
}
