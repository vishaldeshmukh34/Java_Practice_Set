// 5️⃣ Write a program with both a local and global variable having the same name. 
// Use the this keyword (for instance variable) or class name (for static variable) to show the difference.

public class LocalVsGlobal {
    static int number = 100; // Global (static) variable

    public static void main(String[] args) {
        int number = 50; // Local variable (same name)
        System.out.println("Local variable: " + number);
        System.out.println("Global variable (using class name): " + LocalVsGlobal.number);
    }
}
