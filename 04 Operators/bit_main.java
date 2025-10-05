public class bit_main {

    public  static void main(String[] args) {
          // 1. Bitwise AND
        System.out.println("Bitwise AND Operator");
        int a = 45;
        int b = 34;
        System.out.println("a & b = " + (a & b));  // AND operation

        // 2. Bitwise OR
        System.out.println("\nBitwise OR Operator");
        int v = 54;
        int d = 34;
        System.out.println("v | d = " + (v | d));  // OR operation

        // 3. Bitwise NOT
        System.out.println("\nBitwise NOT Operator");
        int h = 79;
        int k = 90;
        System.out.println("~h = " + ~h);  // NOT operation (inverts bits)
        System.out.println("~k = " + ~k);

        // 4. Bitwise Right Shift
        System.out.println("\nRight Shift Operator");
        int x = 78;
        System.out.println("x >>= 1 = " + (x >>= 1)); // 78 >> 1 = 39
        System.out.println("x >>= 2 = " + (x >>= 2)); // 39 >> 2 = 9
        System.out.println("x >>= 3 = " + (x >>= 3)); // 9 >> 3 = 1

        // 5. Bitwise Left Shift
        System.out.println("\nLeft Shift Operator");
        int c = 45;
        System.out.println("c <<= 1 = " + (c <<= 1)); // 45 << 1 = 90
        System.out.println("c <<= 2 = " + (c <<= 2)); // 90 << 2 = 360
        System.out.println("c <<= 3 = " + (c <<= 3)); // 360 << 3 = 2880
    }
}