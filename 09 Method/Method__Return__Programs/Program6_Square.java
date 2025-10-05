// 6] WAM to return the square of a number passed as a parameter.

class Program6_Square {
    public int vishal(int a) {
        return a * a;
    }

    public static void main(String[] args) {
        Program6_Square obj = new Program6_Square();
        int square = obj.vishal(10);
        System.out.println(square);
    }
}
