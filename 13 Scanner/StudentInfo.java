import java.util.Scanner;
public class StudentInfo {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter Your Name :-");
        String name = sc.nextLine();

        System.out.println("Enter Your Id :-");
        String Id = sc.nextLine();

        System.out.println("Enter Your age :-");
        int age = sc.nextInt();

        System.out.println("Enter Your Hight :-");
        double hight = sc.nextDouble();

        System.out.println("Enter Your marks :-");
        int marks = sc.nextInt();

        System.out.println("Enter Your passed :-");
        boolean result = sc.nextBoolean();
        
        System.out.println("______________________________________");

        System.out.println("                                        ");

        
       System.out.println(" Your Name :- "+name);
       System.out.println(" Your Id :- "+Id);
       System.out.println(" Your Age :- "+age);
       System.out.println("Your Hight :- "+hight);
       System.out.println("Your Marks :- "+marks);
       System.out.println("Your Result In True of flase :- " +result);

    }
}