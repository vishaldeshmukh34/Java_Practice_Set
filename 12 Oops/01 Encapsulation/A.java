public class A {
    int value;

    public void setValue(int x) {
        value = x;
    }

    public int getValue() {
        return value;
    }



    public static void main(String[] args) {
        A obj = new A();
        obj.value = 34245;
        System.out.println(obj.value);
    }
}
