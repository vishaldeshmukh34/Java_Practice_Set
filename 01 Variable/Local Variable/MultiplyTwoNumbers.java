// 4️⃣ In a Java method, declare a local variable to store the result of multiplying two numbers. 
// Print the result and see what happens if you forget to initialize the variable.

public class MultiplyTwoNumbers {
    public void multiply() {
        int a = 5;
        int b = 10;
        int result = a * b; // local variable storing the result
        System.out.println("The result is: " + result);
    }

    public static void main(String[] args) {
        MultiplyTwoNumbers obj = new MultiplyTwoNumbers();
        obj.multiply();
    }
}
