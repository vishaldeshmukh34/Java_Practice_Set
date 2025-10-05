public class Q9 {
    public static void main(String[] args) {
        //WAP to input angles of a triangle and check whether triangle is valid or not.

        int a = 100 ;
        int b = 78 ;
        int c = 78 ;
        
        if(a+b>c && b+c>a && c+a>b )
        {
               System.out.println("IS VALID TRIANGLE");
        }
        else
        {
             System.out.println("IS  NOT VALID TRIANGLE");
        }
    }
}
