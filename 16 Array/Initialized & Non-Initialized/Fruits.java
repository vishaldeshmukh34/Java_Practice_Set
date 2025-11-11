// Q3. WAP to accept 5 fruit names from the user and print them in reverse order.
// ->



import java.util.Scanner;

public class Fruits {

	public static void main(String[] args) {
		String fruits[]= new String[5];
		Scanner s=new Scanner(System.in);
	    
		System.out.println("Enter 5 fruits name");
		
		
		for (int i=0;i<fruits.length;i++)
		{
			fruits[i]=s.nextLine();
		}
		 System.out.println("reverse order are:");
	        for (int i =fruits.length -1; i >= 0; i--) 
	        { 
	            System.out.println(fruits[i] );
	        }
}

	}


