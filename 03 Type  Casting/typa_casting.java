package     Type_casting;
public class typa_casting {
    public static void main(String[] args) {
        // Implicit Type Casting (Widening)
        int num = 100;
        double d = num; // int to double
        System.out.println("Implicit Type Casting:");
        System.out.println("Integer value: " + num);
        System.out.println("Double value after implicit casting: " + d);

        // Explicit Type Casting (Narrowing)
        double decimalValue = 9.78;
        int intValue = (int) decimalValue; // double to int
        System.out.println("\nExplicit Type Casting:");
        System.out.println("Double value: " + decimalValue);
        System.out.println("Integer value after explicit casting: " + intValue);
    }
}