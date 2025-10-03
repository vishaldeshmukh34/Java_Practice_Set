// 2] WAM to return average of 5 numbers passed as a parameter.

class Program2_Average {
    public double vishal(int a, int b, int c, int d, int e) {
        return (a + b + c + d + e) / 5.0;
    }

    public static void main(String[] args) {
        Program2_Average obj = new Program2_Average();
        double average = obj.vishal(1, 2, 3, 34, 45);
        System.out.println(average);
    }
}
