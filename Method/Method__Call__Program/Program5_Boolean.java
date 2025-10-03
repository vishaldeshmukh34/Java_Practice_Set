package Method;

// 5. WAM to find AND operation of two boolean values

class Program5_Boolean {
    
    public void show(boolean a, boolean b) {
        System.out.println(a + " AND " + b + " = " + (a && b));
    }

    public static void main(String[] args) {
        Program5_Boolean obj = new Program5_Boolean();
        obj.show(true, true);
        obj.show(true, false);
        obj.show(false, true);
        obj.show(false, false);
    }
}
