public class Car {

    public String name;
    public String color;
    
    // Non-parameterized constructor (default values)
    public Car() {
        name = "Innova";
        color = "Gray";
    }
    
    // Parameterized constructor (custom values)
    public Car(String n, String c) {
        name = n;
        color = c;
    }

    public static void main(String[] args) {
        Car c = new Car("Thar", "Black");
        System.out.println(c.name);
        System.out.println(c.color);
    }
}
