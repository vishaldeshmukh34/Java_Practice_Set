public class A {

    public static void main(String[] args) {

        //Calculator
        // Q.A] Write a program to perform addition, subtraction, multiplication, and division using switch.
        // Input: 2 numbers and an operator (+, -, *, /).
        //Output: Result of the operation.
        
        char operation = '+' ;

        int a = 10 ;
        int b = 20 ;
        switch (operation)
        {
            case '-' : System.out.println(a-b); break;
            case '+' : System.out.println(a+b); break;
            case '*' : System.out.println(a*b); break;
            case '/' : System.out.println(a/b); break;
            case '%' : System.out.println(a%b); break;

        }

            
    }
}