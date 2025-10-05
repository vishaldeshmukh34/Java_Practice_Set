public class mian {
             //all operators in java
    public static void main(String [] arge) {

     //  this is Arithmetic Operators 

     int x = 10;
     int y = 5; 
        System.out.println("Addition: " + (x + y)); // Addition
        System.out.println("Subtraction: " + (x - y)); // Subtraction
        System.out.println("Multiplication: " + (x * y)); // Multiplication
        System.out.println("Division: " + (x / y)); // Division
        System.out.println("Modulus: " + (x % y)); // Modulus

           

        // this is Relational Operators

        int p = 10;
        int q = 5;
        System.out.println("Equal to: " + (p == q)); // Equal to

        System.out.println("Not equal to: " + (p != q)); // Not equal to

        System.out.println("Greater than: " + (p > q)); // Greater than 

        System.out.println("Less than: " + (p < q)); // Less than

        System.out.println("Greater than or equal to: " + (p >= q)); // Greater than or equal to

        System.out.println("Less than or equal to: " + (p <= q)); // Less than or equal to



        // this is Assignment Operators
  
        int a = 10; 
        a += 5;  // a = a + 5;
        a -= 5;  // a = a - 5;
        a *= 5;  // a = a * 5;
        a /= 5;  //a = a / 5;
        a %= 5; // a = a % 5;

        System.out.println(a);


        // Increment  operators
        int i = 10;
        System.out.println(i++); // Post-increment
        System.out.println(++i); // Pre-increment
        

        // Decrement operators
        int j = 10;
        System.out.println(j--); // Post-decrement

        System.out.println(--j); // Pre-decrement
    
        // Logical Operators
           
        // Logical AND      

        boolean A = true && true ; 
        boolean B = false && true ;


        System.out.println(A && B); // false
        
    // Logical OR

        boolean C = true || false ; 
        boolean D = false || false ;

        System.out.println(C || D); // true

        // Logical NOT

        boolean E = true; 
        boolean F = false;

        System.out.println(!E); // false
        System.out.println(!F); // true
       
     // bitwise Operators
        int m = 5;  // Binary: 0101
        int n = 3;  // Binary: 0011
        System.out.println("Bitwise AND: " + (m & n)); // Bitwise AND: 1 (Binary: 0001)
        System.out.println("Bitwise OR: " + (m | n));  // Bitwise OR: 7 (Binary: 0111)

    }
}