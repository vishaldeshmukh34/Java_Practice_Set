// 8] WAM to return true if a number is prime, else return false.

class Program8_PrimeCheck {
    public boolean vishal(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Program8_PrimeCheck obj = new Program8_PrimeCheck();
        boolean num = obj.vishal(7);
        System.out.println(num);
    }
}
