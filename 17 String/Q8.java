import java.util.Scanner;

public class Q8 {
    
// 4. WAP to accept fruit name from the user and check fruit is valid or not.
// Note: valid fruit is the one who has p or m in its nam
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);

System.out.println("Enter The Fruit Name :- ");
String fruit = sc.nextLine();

if(fruit.contains("p") || fruit.contains("m"))
{
    System.out.println("valid");
}
else
{
    System.out.println("Invalid");
}

}

}
