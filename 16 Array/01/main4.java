import java.util.Scanner;

public class main4 {
   // 4. WAP to accept 10 numbers from user and count even numbers.

 

   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int count = 0 ;

    System.out.println("Enter The 10 Number :- ");

    int Number[] = new int[10];
    for(int i = 0; i < Number.length ; i++)
    {
        Number[i] = sc.nextInt();
    }

    System.out.println("This Your Even Number :-");
   for(int i = 0 ; i < Number.length ; i++)
   {
    if(Number[i] % 2 == 0)
    {
        count++;
        System.out.println(Number[i]);
    }
   }
     System.out.println("This Tatal Count :- " + count);
   }
}
