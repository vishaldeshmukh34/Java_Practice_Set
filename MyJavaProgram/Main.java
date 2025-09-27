//  Write a Java program to find the sum of all even digits from a given number

class Main {
    public static void main(String[] args) {
           
           int n = 123456 ;
           int sum = 0 ;
           
           while(n != 0)
           {
             int digit = n % 10 ;
               
               if(digit % 2 == 0 )
               {
                   sum = sum + digit ;
                //   n = n / 10 ;
                    //  System.out.print(sum);
               }
                 n = n / 10 ;
            //   System.out.print(sum);
           }
             System.out.print("The sum of all even digits :-" +sum);
    }
}