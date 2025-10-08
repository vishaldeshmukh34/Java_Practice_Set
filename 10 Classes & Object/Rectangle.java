// Q2. Create a class Rectangle with variables length and width.
class Rectangle {
    double length;
    double width;

    double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 5;
        r1.width = 3;

        Rectangle r2 = new Rectangle();
        r2.length = 10;
        r2.width = 4;

        System.out.println("Area of Rectangle 1: " + r1.calculateArea());
        System.out.println("Area of Rectangle 2: " + r2.calculateArea());
    }
}
