
public class EvenOddpro {
    public static void main(String[] args) {
        //1. Write a Java program using a for loop and if-else to print whether numbers from 1 to 20 are even or odd.

        for( int i = 1 ; i <= 20 ; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println("This Is Even :- " + i);
            }
            else if (i != 2  )
            {
                System.out.println("This Odd Number :- " + i);
            }
        }
        
    }
}
