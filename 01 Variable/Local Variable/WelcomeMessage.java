// 2️⃣ Create a method that takes your name and prints a welcome message using a local variable to store the greeting.

public class WelcomeMessage {
    public void greet(String name) {
        String greeting = "Welcome " + name;  // local variable to store the greeting
        System.out.println(greeting);
    }

    public static void main(String[] args) {
        WelcomeMessage obj = new WelcomeMessage();
        obj.greet("Vishal");
    }
}
