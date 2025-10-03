// 4] WAM to return "Success" if the number passed as a parameter is 1234 else return "Failed".

class Program4_SuccessCheck {
    public String vishal(int num) {
        if (num == 1234) {
            return "Success";
        } else {
            return "Failed";
        }
    }

    public static void main(String[] args) {
        Program4_SuccessCheck obj = new Program4_SuccessCheck();
        String m = obj.vishal(1234);
        System.out.println(m);
    }
}
