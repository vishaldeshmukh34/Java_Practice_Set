// 45. Generate the Series 0 1 3 6 10 15 21 28 36 45...
class Series45 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i <= 9; i++) { // first 10 terms
            sum = sum + i;
            System.out.println(sum);
        }
    }
}
