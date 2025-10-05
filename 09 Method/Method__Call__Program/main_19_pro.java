package Method;

public class main_19_pro {
    // Practice Programs using Methods in Java



    // 1. WAM to print Hi on the console.
    public void q1() {
        System.out.println("Hi");
    }

    // 2. WAM to show addition, subtraction, multiplication and division of two numbers.
    public void q2(int a, int b) {
        System.out.println("Addition :- " + (a + b));
        System.out.println("Subtraction :- " + (a - b));
        System.out.println("Multiplication :- " + (a * b));
        System.out.println("Division :- " + (a / b));
    }

    // 3. WAM to calculate factorial of a number.
    public void q3(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        System.out.println("Factorial of " + n + " :- " + f);
    }

    // 4. WAM to display reverse of a number.
    public void q4(int n) {
        int rev = 0, temp = n;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }
        System.out.println("Reverse of " + n + " :- " + rev);
    }

    // 5. WAM to find AND operation of two boolean values.
    public void q5(boolean a, boolean b) {
        System.out.println("AND Result :- " + (a && b));
    }

    // 6. WAM to check whether a number is even or odd.
    public void q6(int num) {
        if (num % 2 == 0)
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd");
    }

    // 7. WAM to print multiplication table of a number (1 to 10).
    public void q7(int n) {
        System.out.println("Multiplication Table of " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }

    // 8. WAM to find maximum of two numbers.
    public void q8(int a, int b) {
        if (a > b)
            System.out.println(a + " is greater");
        else if (b > a)
            System.out.println(b + " is greater");
        else
            System.out.println("Both are equal");
    }

    // 9. WAM to find cube of a number.
    public void q9(int num) {
        System.out.println("Cube of " + num + " = " + (num * num * num));
    }

    // 10. WAM to print all numbers between a and b.
    public void q10(int a, int b) {
        System.out.println("Numbers between " + a + " and " + b + " :-");
        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 11. WAM to check whether a number is prime or not.
    public void q11(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count == 2)
            System.out.println(n + " is Prime");
        else
            System.out.println(n + " is Not Prime");
    }

    // 12. WAM with name sakshi which accepts a character and print its ASCII value.
    public void sakshi(char ch) {
        int ASCII = (int) ch;
        System.out.println("ASCII of " + ch + " :- " + ASCII);
    }

    // 13. WAM with name pratiksha which accepts 3 numbers and prints minimum of them.
    public void pratiksha(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        System.out.println("Minimum number :- " + min);
    }

    // 14. WAM with name abhishek which accepts 3 numbers and prints maximum of them.
    public void abhishek(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        System.out.println("Maximum number :- " + max);
    }

    // 15. WAM with name sanket which accepts PIN and prints login success or failed.
    public void sanket(int pin) {
        if (pin == 1234)
            System.out.println("Login Success");
        else
            System.out.println("Login Failed");
    }

    // 16. WAM with name Mangesh which accepts a Boolean value and checks if it true or false.
    public void Mangesh(boolean value) {
        if (value)
            System.out.println("Mangesh reports: The value is True.");
        else
            System.out.println("Mangesh reports: The value is False.");
    }

    // 17. WAM with name Aniket which accepts a name and greets him/her welcome.
    public void Aniket(String name) {
        System.out.println("Welcome to my program, " + name + "!");
    }

    // 18. WAM with name Vishal which accepts a number and checks if it is prime or not.
    public void Vishal(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        if (count == 2)
            System.out.println(n + " is Prime");
        else
            System.out.println(n + " is Not Prime");
    }

    public static void main(String[] args) {
        main_19_pro obj = new main_19_pro();

        obj.q1();
        obj.q2(5, 6);
        obj.q3(5);
        obj.q4(1234);
        obj.q5(true, false);
        obj.q6(11);
        obj.q7(7);
        obj.q8(23, 45);
        obj.q9(5);
        obj.q10(5, 15);
        obj.q11(17);

        obj.sakshi('A');
        obj.pratiksha(3, 1, 2);
        obj.abhishek(3, 8, 5);
        obj.sanket(1234);
        obj.Mangesh(true);
        obj.Aniket("Vishal");
        obj.Vishal(19);
    }
}


