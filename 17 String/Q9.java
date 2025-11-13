import java.util.Scanner;

public class Q9 {
    
//WAP to accept names of 5 friends of the user. Store them in an array. Print only those friends whose name starts with K.
    public static void main(String[] args) {
        
   Scanner sc =  new Scanner(System.in);     
   String name[] = new String[5];

 System.out.println("Enter The Your 5 Friends Name :- ");
 
   for(int i=0;i<name.length;i++)
          {
        	  name[i]=sc.next();
          }

      System.out.println("This your want to :- ");    

    for(int i=0; i<name.length; i++)
          {
        	  if(name[i].startsWith("k"))
              {
                System.out.println(name[i]);
              }
          }


    }
}
