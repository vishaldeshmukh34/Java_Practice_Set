public class AsciiValue {
    // Program 1: Return ASCII value of a character

    public int getAscii(char cha) {
        return cha;
    }

    public static void main(String[] args) {
        AsciiValue obj = new AsciiValue();
        int ASCII = obj.getAscii('A');
        System.out.println(ASCII);
    }
}


