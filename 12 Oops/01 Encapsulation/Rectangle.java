public class Rectangle {
    private double length;
    private double width;

    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }
    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }

    public double calculateArea() { return length * width; }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(10);
        r.setWidth(5);
        System.out.println("Area: " + r.calculateArea());
    }
}
