// 9] WAM to return the factorial of a number.

class Program9_Factorial {
    public long vishal(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        Program9_Factorial obj = new Program9_Factorial();
        long m = obj.vishal(10);
        System.out.println(m);
    }
}
