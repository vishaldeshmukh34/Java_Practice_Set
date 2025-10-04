// 52. Write a Java program to print the factorial series (1!, 2!, 3!, … n!)
class FactorialSeries {
    public static void main(String[] args) {
        int f = 1;
        int n = 10;
        for(int i = 1; i <= n; i++) {
            f = f * i;
            System.out.println(f);
        }
    }
}
