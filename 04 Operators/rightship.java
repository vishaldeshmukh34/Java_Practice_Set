public class rightship {
    public static void main(String[] args) {

       System.out.println("Right Shift Operator");
       int  a = 34 ;
       int b = 67 ;
       System.out.println(a >> 2); 
       System.out.println(b >> 2);
    }
}
 //note: right shift operator (>>) shifts the bits of a number to the right by the specified number of positions. For positive numbers, it fills the leftmost bits with zeros, while for negative numbers, it fills the leftmost bits with ones. Each right shift effectively divides the number by 2 for each position shifted, discarding any fractional part.
    //example: 34 in binary is 00100010. Right shifting by 2 positions results in 00001000, which is 8 in decimal. Similarly, 67 in binary is 01000011. Right shifting by 2 positions results in 00010000, which is 16 in decimal.
