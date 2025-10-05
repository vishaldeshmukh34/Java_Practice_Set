// 5️⃣ Write a method that takes two parameters, stores their average in a local variable, and returns it.

public class AverageCalculator {
    public double average(int a, int b) {
        double avg = (a + b) / 2.0;  // local variable to store the average
        return avg;                  // return the result instead of printing
    }

    public static void main(String[] args) {
        AverageCalculator obj = new AverageCalculator();
        double result = obj.average(100, 200);
        System.out.println("Average: " + result);
    }
}
