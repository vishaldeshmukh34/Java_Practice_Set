// 7] WAM to return the largest number among three numbers.

class Program7_LargestOfThree {
    public int vishal(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Program7_LargestOfThree obj = new Program7_LargestOfThree();
        int largest = obj.vishal(5, 20, 15);
        System.out.println(largest);
    }
}
