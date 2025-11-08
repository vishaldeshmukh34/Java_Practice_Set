public class Home extends Car {

    // Implementing abstract method
    public void m2() {
        System.out.println("hello from m2");
    }

    public static void main(String[] args) {
        Home obj = new Home();  // ✅ create object of child class
        obj.m1();               // inherited method from Car
        obj.m2();               // implemented method in Home
    }
}