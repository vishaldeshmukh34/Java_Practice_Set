package Method;

// 2. WAM to show addition, subtraction, multiplication and division of two numbers on the screen.

class Program2_Calculator {
    
    public void sho(int a , int b) {  
        System.out.println("A And B Addition :- " + (a + b));
        System.out.println("A And B Subtraction :- " + (a - b));
        System.out.println("A And B Multiplication :- " + (a * b));
        System.out.println("A And B Division :- " + (a / b));
    }
    
    public static void main(String[] args) {
        Program2_Calculator c = new Program2_Calculator();
        c.sho(5, 6);
    }
}

