public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "Vishal Java";
        String str2 = "vishal java";
        String str3 = "  Hello World  ";

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. charAt()
        System.out.println("charAt(3): " + str.charAt(3));

        // 3. codePointAt()
        System.out.println("codePointAt(0): " + str.codePointAt(0));

        // 4. contains()
        System.out.println("Contains 'Java': " + str.contains("Java"));

        // 5. equals()
        System.out.println("Equals: " + str.equals(str2));

        // 6. equalsIgnoreCase()
        System.out.println("Equals Ignore Case: " + str.equalsIgnoreCase(str2));

        // 7. startsWith()
        System.out.println("Starts with 'Vis': " + str.startsWith("Vis"));

        // 8. endsWith()
        System.out.println("Ends with 'ava': " + str.endsWith("ava"));

        // 9. indexOf()
        System.out.println("Index of 'a': " + str.indexOf('a'));

        // 10. lastIndexOf()
        System.out.println("Last Index of 'a': " + str.lastIndexOf('a'));

        // 11. replace()
        System.out.println("Replace 'a' with 'o': " + str.replace('a', 'o'));

        // 12. substring()
        System.out.println("Substring (0, 6): " + str.substring(0, 6));

        // 13. repeat()
        System.out.println("Repeat string twice: " + str.repeat(2));

        // 14. concat()
        System.out.println("Concat: " + str.concat(" Programming"));

        // 15. split()
        String[] parts = str.split(" ");
        System.out.println("After split:");
        for (String p : parts) {
            System.out.println(p);
        }

        // 16. trim()
        System.out.println("Before trim: '" + str3 + "'");
        System.out.println("After trim: '" + str3.trim() + "'");
    }
}
