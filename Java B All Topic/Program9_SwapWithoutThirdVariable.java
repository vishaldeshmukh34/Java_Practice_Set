public class Program9_SwapWithoutThirdVariable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a = a + b;  // a = 30
        b = a - b;  // b = 10
        a = a - b;  // a = 20

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
