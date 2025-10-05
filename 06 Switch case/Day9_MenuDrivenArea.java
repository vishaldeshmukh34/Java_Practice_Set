import java.util.Scanner;

public class Day9_MenuDrivenArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double radius, side, length, breadth;

        System.out.println("=== Area Calculator Menu ===");
        System.out.println("1. Area of Circle");
        System.out.println("2. Area of Square");
        System.out.println("3. Area of Rectangle");
        System.out.print("Enter your choice (1-3): ");
        
        if(sc.hasNextInt()) {
            choice = sc.nextInt();
        } else {
            System.out.println("Invalid input! Please enter a number between 1 and 3.");
            sc.close();
            return;
        }

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                if(sc.hasNextDouble()) {
                    radius = sc.nextDouble();
                    if(radius < 0) {
                        System.out.println("Radius cannot be negative.");
                    } else {
                        double areaCircle = Math.PI * radius * radius;
                        System.out.println("Area of Circle: " + areaCircle);
                    }
                } else {
                    System.out.println("Invalid input for radius.");
                }
                break;

            case 2:
                System.out.print("Enter the side of the square: ");
                if(sc.hasNextDouble()) {
                    side = sc.nextDouble();
                    if(side < 0) {
                        System.out.println("Side cannot be negative.");
                    } else {
                        double areaSquare = side * side;
                        System.out.println("Area of Square: " + areaSquare);
                    }
                } else {
                    System.out.println("Invalid input for side.");
                }
                break;

            case 3:
                System.out.print("Enter the length of the rectangle: ");
                if(sc.hasNextDouble()) {
                    length = sc.nextDouble();
                } else {
                    System.out.println("Invalid input for length.");
                    break;
                }

                System.out.print("Enter the breadth of the rectangle: ");
                if(sc.hasNextDouble()) {
                    breadth = sc.nextDouble();
                } else {
                    System.out.println("Invalid input for breadth.");
                    break;
                }

                if(length < 0 || breadth < 0) {
                    System.out.println("Length and breadth cannot be negative.");
                } else {
                    double areaRectangle = length * breadth;
                    System.out.println("Area of Rectangle: " + areaRectangle);
                }
                break;

            default:
                System.out.println("Invalid choice! Please select 1, 2, or 3.");
        }

        sc.close();
    }
}
