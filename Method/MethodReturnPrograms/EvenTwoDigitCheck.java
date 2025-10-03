package Method.MethodReturnPrograms;

public class EvenTwoDigitCheck {
    // Program 5: Return "Valid" if number is even and 2-digit else "Invalid"

    public String validate(int num) {
        if(num % 2 == 0 && num >= 10 && num <= 99) {
            return "Valid";
        } else {
            return "Invalid";
        }
    }

    public static void main(String[] args) {
        EvenTwoDigitCheck obj = new EvenTwoDigitCheck();
        String result = obj.validate(6);
        System.out.println(result);
    }


}
