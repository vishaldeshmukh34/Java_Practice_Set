
 //Q1.wap to accect 5 Number thr user and print all 3 digit number from it ?

    import java.util.Scanner;

public class digit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
      

        System.out.println("Enter 5 numbers:");

        // take input
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
          System.out.println("This your  Number :- ");
        // check and add odd numbers
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]  > 99 &&  numbers[i] < 1000 ) {  // odd number condition
                System.out.println(numbers[i]);
              
                
            }
        }

        

       
    }

 
    
}


