public class Q11 {
    public static void main(String[] args) {
          int a = 10;
        int b = 200;
        int c = 30;
        
        
        if(  b >= a && c >= b )
        {
            System.out.println("A,B,C VALUE ARE ORDER");
        }
        else
        {
            System.out.println("A,B,C  VALUE ARE NOT ORDER");
            
            
            if(b <= a )
            {
                System.out.println("  RESON := B not grater than  ");
            }
            else if (c <= b)
            {
                System.out.println( "RESONE:= c not grater than b ");
            }
        }
       
    }
}
