

package MyJavaProgram;
import java.util.Scanner;

public class program1_ {
    public static void main(String[] args) {
        int a ;

        System.out.print("Enter The Student Marks :- ");
        Scanner ref=new Scanner(System.in);
        a=ref.nextInt();

        if(a > 80 && a < 100)
        {
            System.out.println("good");
        }
        else if (a >60 && a< 80)
        {
            System.out.println("Avrage student ");
        }
        else if ( a >35 && a < 60)
        {
            System.out.println("Result Low But Student Pass");
        }
        else if ( a > 1 && a < 35)
        {
            System.out.println("Student Fail......... ");
        }
        else
        {
            System.out.println("Please Enter The Coreect Marks");
        }
    }
}
