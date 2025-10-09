

class Main {
    
    String a ;
    String b ;
    String c ;
    String d ;
    
    public Main()
    {
        a = " vishal" ;
        b = "Aditya"  ;
        c  = "Aniket" ;
        d  = "Suraj"  ;
    }
    
    
    public void real()
    {
        System.out.println(a +" "+ b+" " + c +" "+ d);
    }
    
    public static void main(String[] args) {
        Main obj = new Main();
        obj.real();
        
    }
}