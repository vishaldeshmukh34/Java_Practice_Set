// 3] WAM to return true if the number passed as a parameter is 2 digit else return false.

class Program3_TwoDigitCheck {
    public boolean vishal(int num) {
        return (num >= 10 && num <= 99);
    }

    public static void main(String[] args) {
        Program3_TwoDigitCheck obj = new Program3_TwoDigitCheck();
        boolean number = obj.vishal(35);
        System.out.println(number);
    }
}
