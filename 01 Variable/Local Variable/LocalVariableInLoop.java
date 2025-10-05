// 3️⃣ Write a program that declares a local variable inside a loop and prints its value each time the loop runs. 
// What happens if you try to print it outside the loop?

public class LocalVariableInLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int a = 2; // local variable inside the loop
            System.out.println(a);
        }

        // Uncommenting the next line will cause a compile-time error:
        // System.out.println(a); // 'a' cannot be resolved outside the loop
    }
}
