public class operator {

    public static void main(String[] args) {
          
        int a = 40;
        int b = 30;
        
        System.out.println("1.Arithmetic Operators");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        
        System.out.println("\n2.Relational Operators");
       
       if(a >= 100) {
           System.out.println(" a number is greater than 100");
       }else{
           System.out.println("Numbert is not greater than 100");
       }
       
        if( a == b){
             System.out.println(" numbers are equal");
        }else {
          System.out.println("Numbert is not equal");
        }
       
        System.out.println("\n3.Logical Operators");
        
        int age = 22 ;
         
         if(age > 18) {
             System.out.println("Vishal is eligible for voting");
         }else {
            System.out.println("Vishal is Not eligible for voting"); 
             }
             
             int x = -4 ;
             if( x > 0)  {
        System.out.println("number  is positive");    
             }else {
        System.out.println("numbrt is  not  positive");
             }
             
        System.out.println("\n4.Assignment Operators");
           int n = 100 ;
               n += 10; // 100 += 10 = 110
               n -= 5; // 110 -= 5 = 105
         System.out.println(n);  
         
         System.out.println("\n5.Increment / Decrement Operators");
         
         int k = 45 ;
         int h = 45;
         
         System.out.println("This is pre-increment : " + (++k));
         System.out.println("This is post-increment : " + ( h++));
         
          
         System.out.println("\n6.Conditional (Ternary) Operator");
         
         int largest = (a > b) ? a : b;

        System.out.println("The largest number is: " + largest);
    }
}