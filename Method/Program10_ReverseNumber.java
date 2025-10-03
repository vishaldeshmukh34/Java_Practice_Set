// 10] WAM to return the reverse of a number.

class Program10_ReverseNumber {
    public int vishal(int n) {
        int rev = 0;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Program10_ReverseNumber obj = new Program10_ReverseNumber();
        int v = obj.vishal(12345);
        System.out.println(v);  // Output: 54321
    }
}

