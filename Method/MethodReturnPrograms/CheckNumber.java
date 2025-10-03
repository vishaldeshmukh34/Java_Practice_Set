package Method.MethodReturnPrograms;


    // Program 4: Return "Success" if number is 1234 else "Failed"
class CheckNumber {
    public String checkNum(int num) {
        if(num == 1234) {
            return "Success";
        } else {
            return "Failed";
        }
    }

    public static void main(String[] args) {
        CheckNumber obj = new CheckNumber();
        String result = obj.checkNum(1234);
        System.out.println(result);
    }
}


