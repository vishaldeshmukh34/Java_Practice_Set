
import java.util.Scanner;
public class AveregFind {
    //WAP to accept 5 numbers and display average of them
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);


    System.out.println("Enter the Number 1st  ");  
    int a = sc.nextInt();
   
     System.out.println("Enter the Number 2st  ");
    int b  = sc.nextInt();

    System.out.println("Enter the Number 3st  ");
    int c  = sc.nextInt();

    System.out.println("Enter the Number 4st  ");
    int d  = sc.nextInt();
    
    System.out.println("Enter the Number 5st  ");
    int e  = sc.nextInt();
    
    int sum = a + b + c + d + e ;
    double avarage = sum / 5 ;
    System.out.println("Avarage is :- "+avarage);



    }
}
