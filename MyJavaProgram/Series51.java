// 51. Generate the series 1 10 100 1000 100 10 1
class Series51 {
    public static void main(String[] args) {
        int c = 1;
        for(int i = 1; i <= 4; i++) {
            System.out.println(c);
            c = c * 10;
        }

        int b = 100;
        for(int j = 4; j > 1; j--) {
            System.out.println(b);
            b = b / 10;
        }
    }
}
