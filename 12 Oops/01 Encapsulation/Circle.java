public class Circle {
    private double radius;

    public double getRadius() { return radius; }
    public void setRadius(double radius) {
        if(radius >= 0) this.radius = radius;
        else System.out.println("Radius cannot be negative!");
    }

    public double calculateCircumference() { return 2 * Math.PI * radius; }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(7);
        c.setRadius(-3); // invalid
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Circumference: " + c.calculateCircumference());
    }
}
