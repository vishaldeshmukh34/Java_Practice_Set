public class leftship {
    public static void main(String[] args) {

       System.out.println("Left Shift Operator");
       int  a = 34 ;
       int b = 67 ;
       System.out.println(a << 2); 
       System.out.println(b << 2);
    }
}
 //note: left shift operator (<<) shifts the bits of a number to the left by the specified number of positions, filling the rightmost bits with zeros. Each left shift effectively multiplies the number by 2 for each position shifted.