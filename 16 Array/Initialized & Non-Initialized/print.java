import java.util.Scanner;

public class print {
    // 1. WAP to accept 10 numbers from user and print them.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The 10 Number :- ");
        int[] Number = new int[10];


        for(int i = 0 ; i < Number.length ; i++)
        {
             Number[i] = sc.nextInt();
        }
       
  System.out.println("This Your Number :- ");

        for(int i = 0 ; i < Number.length ; i++)
        {
             System.out.println(Number[i]);
        }

    }
}

