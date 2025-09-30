class Main {
    
    // WAM with name sakshi which accepts a character and print its ASCII value.
    
    public void sakshi(char ch)
     {
        int ASCII = (int)ch ;
        System.out.println(ASCII);
     }
     
    // WAM with name pratiksha which accepts 3 numbers and prints minimum of them.
    
    public void pratiksha(int a , int b, int c)
     {
        if(a > b)
        {
              System.out.println("A is greater than B and C");
        }
        else if( b > c)
        {
              System.out.println("B is greater than C and A");
        }
        else if(c > a)
        {
             System.out.println("C is greater than A and B");
        }
        else
        {
            System.out.println("Some numbers are equal or incorrect input");
        }
     }
     
    // WAM with name abhishek which accepts 3 numbers and prints maximum of them.
    
    public void abhishek(int a , int b , int c )
    {
        if(a > b)
        {
            System.out.println("A IS Maximum");
        }
        else if(b > c)
        {
            System.out.println("B IS Maximum");
        }
        else
        {
            System.out.println("C IS Maximum");
        }
    }
    
    // WAM with name sanket which accepts PIN and prints login success or failed.
    
    public void sanket(int n)
    { 
         if(n == 1234)
        {
            System.out.println("Login Success");
        }
        else
        {
            System.out.println("Failed");
        }
    }
    
    // WAM with name Mangesh which accepts a Boolean value and checks if it true or false.
    
      public void Mangesh(Boolean value)
    { 
         if( value == true )
        {
            System.out.println("Mangesh reports: The value is True.");
        }
        else
        {
            System.out.println("Mangesh reports: The value is False.");
        }
    }
    
    // WAM with name Aniket which accepts a name and greets him/her welcome.
    
     public void Aniket(String name)
     {
         System.out.println("Welcome To My Program " + name);
     }
    
    // WAM with name vishal which accepts a number and checks if it is prime or not.
    
    public void  Vishal(int n)
    {
        int c = 0 ;
        
        for(int i = 1 ; i <= n ; i++)
        {
            if(n % i == 0)
            {
               c++;
            }
        }
        
        if(c == 2)
        {
            System.out.println(n + " Is Prime Number");
        }
        else
        {
          
           System.out.println(n + " Is Not Prime Number");
         
        }
    }
    
    public static void main(String[] args) {
        Main obj = new Main();
        obj.sakshi('a');
        obj.pratiksha(1,2,3);
        obj.abhishek(1,2,3);
        obj.sanket(1234);
        obj.Mangesh(true);
        obj.Aniket("Vishal");
        obj.Vishal(2);
    }
}


