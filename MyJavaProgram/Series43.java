// 43. Generate the Series 1 -2 3 -4 5 -6 7 -8 9 -10
class Series43 {
    public static void main(String[] args) {
        int n = 10;
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                System.out.println("-" + i);
            } else {
                System.out.println(i);
            }
        }
    }
}