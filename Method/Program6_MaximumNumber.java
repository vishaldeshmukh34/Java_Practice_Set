package Method;

public class Program6_MaximumNumber {

    // Method to find maximum
    public void findMax(int a, int b) {
        if (a > b) {
            System.out.println(a + " is the largest");
        } else if (b > a) {
            System.out.println(b + " is the largest");
        } else {
            System.out.println("Both numbers are equal");
        }
    }

    public static void main(String[] args) {
        // Create object of this class
        Program6_MaximumNumber number = new Program6_MaximumNumber();
        number.findMax(5, 6); // You can change the numbers here
    }
}
