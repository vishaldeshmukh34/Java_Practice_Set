package Method.MethodReturnPrograms;

public class AverageOfFive {
    // Program 2: Return average of 5 numbers

    public double getAverage(int a, int b, int c, int d, int e) {
        return (a + b + c + d + e) / 5.0;  // divide by 5.0 for decimal result
    }

    public static void main(String[] args) {
        AverageOfFive obj = new AverageOfFive();
        double average = obj.getAverage(1, 2, 3, 34, 45);
        System.out.println(average);
    }
}


