package Method.MethodReturnPrograms;

public class TwoDigitCheck {
    // Program 3: Return true if the number is 2-digit

    public boolean isTwoDigit(int num) {
        return num >= 10 && num <= 99;  // correct 2-digit check
    }

    public static void main(String[] args) {
        TwoDigitCheck obj = new TwoDigitCheck();
        boolean result = obj.isTwoDigit(3);
        System.out.println(result);
    }
}


