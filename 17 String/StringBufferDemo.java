public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Vishal");

        sb.append(" Deshmukh");
        System.out.println("After append: " + sb);

        sb.insert(7, " R.");
        System.out.println("After insert: " + sb);

        sb.replace(0, 6, "Mr. Vishal");
        System.out.println("After replace: " + sb);

        sb.delete(0, 4);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
    }
}
