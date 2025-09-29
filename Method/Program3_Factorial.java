package Method;

// 3. WAM to calculate factorial of a number.

class Program3_Factorial {
    
    public void show(int sun) {
        int f = 1;
        for(int i = 1; i <= sun; i++) {
            f = f * i;
        }
        System.out.println("Factorial of " + sun + " is " + f);
    }
    
    public static void main(String[] args) {
        Program3_Factorial v = new Program3_Factorial();
        v.show(8);
    }
}
