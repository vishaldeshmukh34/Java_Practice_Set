package Method;

// 4. WAM to display reverse of a number

class Program4_ReverseNumber {
    
    public void show(int n) {
        System.out.print("Reverse of " + n + " is: ");
        while(n > 0) {
            System.out.print(n % 10);
            n = n / 10;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Program4_ReverseNumber v = new Program4_ReverseNumber();
        v.show(1234);
    }
}
