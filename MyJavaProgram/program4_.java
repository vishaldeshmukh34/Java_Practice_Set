package MyJavaProgram;
 import java.util.Scanner;

public class program4_ {

    public static void main(String[] args) {
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
                int r = sc.nextInt();
                if(r > 0) {
                    double areaCircle = Math.PI * r * r;
                    System.out.println("Area of Circle: " + areaCircle);
                } else {
                    System.out.println("Invalid radius");
                }
                break;

            case 2:
                System.out.print("Enter side: ");
                int side = sc.nextInt();
                if(side > 0) {
                    double areaSquare = side * side;
                    System.out.println("Area of Square: " + areaSquare);
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
                    double areaRectangle = length * breadth;
                    System.out.println("Area of Rectangle: " + areaRectangle);
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

    

