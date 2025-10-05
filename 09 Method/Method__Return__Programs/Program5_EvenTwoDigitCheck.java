// 5] WAM to return "Valid" if the number passed as a parameter is even as well as 2 digit.
//    Return "Invalid" otherwise.

class Program5_EvenTwoDigitCheck {
    public String vishal(int num) {
        if (num % 2 == 0 && num >= 10 && num <= 99) {
            return "Valid";
        } else {
            return "Invalid";
        }
    }

    public static void main(String[] args) {
        Program5_EvenTwoDigitCheck obj = new Program5_EvenTwoDigitCheck();
        String a = obj.vishal(24);
        System.out.println(a);
    }
}
