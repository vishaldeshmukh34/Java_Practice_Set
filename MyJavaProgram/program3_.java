package MyJavaProgram;
  import java.util.Scanner;

public class program3_ {

 
public static void main(String[] args) {

        /*
         * Menu Driven Program
         * 
         * Problem Statement:
         * Write a program to display a menu with the following options:
         * 1. Area of Circle
         * 2. Area of Square
         * 3. Area of Rectangle
         * 
         * The program should:
         * - Take the user's choice
         * - For the selected option, ask for the required dimensions
         * - Validate the input (dimensions must be > 0)
         * - Calculate and display the area using switch-case
         * - If the choice or dimensions are invalid, display an appropriate message
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Area of Circle");
        System.out.println("2. Area of Square");
        System.out.println("3. Area of Rectangle");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.print("Enter radius: ");
                int radius = sc.nextInt();
                if(radius > 0) {
                    double area = Math.PI * radius * radius;
                    System.out.println("Area of Circle: " + area);
                } else {
                    System.out.println("Invalid radius");
                }
                break;

            case 2:
                System.out.print("Enter side: ");
                int side = sc.nextInt();
                if(side > 0) {
                    double area = side * side;
                    System.out.println("Area of Square: " + area);
                } else {
                    System.out.println("Invalid side");
                }
                break;

            case 3:
                System.out.print("Enter length: ");
                int length = sc.nextInt();
                System.out.print("Enter breadth: ");
                int breadth = sc.nextInt();
                if(length > 0 && breadth > 0) {
                    double area = length * breadth;
                    System.out.println("Area of Rectangle: " + area);
                } else {
                    System.out.println("Invalid dimensions");
                }
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}

        



    

 






