
// login(String username, String password)
// login(String emailID)
// login(long phone, String OTP)

public class main {

    public void show(String username , String password)
    {
       System.out.println(username);
       System.out.println(password);
    }

    public void show(String emailID )
    {
     System.out.println(emailID);
    }
    public void show(long phone , String OTP )
    {
     System.out.println(emailID);
    }

      public static void main(String[] args) {
        
        main obj = new main();
        obj.show("76878969677" , "345334");
    }



    
}
