public class Program10_SwapWithoutThirdVariable {
    public static void main(String[] args) {
        // 10. WAP to swap two numbers without using a third variable.

        int a = 4;
        int b = 6;

        a = a + b;  // a = 10
        b = a - b;  // b = 4
        a = a - b;  // a = 6

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
