//Q2 . WAP to accept 10 numbers from the user and print alternate numbers from it.

import java.util.Scanner;

public class alternate{

	public static void main(String[] args) {
		int num[]= new int[10];
		Scanner s=new Scanner(System.in);
	    
		System.out.println("Enter10 numberss");
		
		
		for (int i=0;i<num.length;i++)
		{
			num[i]=s.nextInt();
		}
		 System.out.println("Alternate numbers are:");
	        for (int i = 0; i < 10; i += 2) { // skip every second number
	            System.out.print(num[i] + " ");
	        }
}

	}
