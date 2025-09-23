public class Divisible {
    public static void main(String[] args) {
        
// 6. Write a program that prints all numbers from 1 to 30, but if the number is divisible by both 3 and 5, print 'HelloWorld', if only by 3 print 'Hello', if only by 5 print 'World'.

        for(int i = 1; i <= 30; i++)
        {
            if(i % 3 == 0 & i % 5 == 0)
            {
                System.out.println( "This number is divisible by both 3 and 5 :- "+ i);
            }
            else if (i % 3 == 0)
            {
                System.out.println("This number is Only divisible by 3 :-- " + i);
            }
            else if (i % 5 == 0) 
            {
                System.out.println("This Number is Divisible by Only 5 :-- " + i);
            }
        }
    }
}
