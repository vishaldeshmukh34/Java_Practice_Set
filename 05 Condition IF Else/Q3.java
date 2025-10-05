public class Q3 {
    

   
    public static void main(String[] args) {
        
        String username = "vishal";   // input username
        String password = "vishal123"; // input password

        // check username
        if (username.equals("vishal") || username.equals("Drashna") || 
            username.equals("neha") || username.equals("rohini")) {
            
            // if username correct, check password
            if ((username.equals("vishal") && password.equals("vishal123")) ||
                (username.equals("Drashna") && password.equals("drashna123")) ||
                (username.equals("neha") && password.equals("neha123")) ||
                (username.equals("rohini") && password.equals("rohini123"))) {
                
                System.out.println("Login Successful ✅");
            } else {
                System.out.println("Invalid Password ❌");
            }
            
        } else {
            System.out.println("Invalid Username ❌");
        }
    }
}


