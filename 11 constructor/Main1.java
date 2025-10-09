public class Main1 {
       
    int x;
    int y;

    public Main1(int a , int b) {
        x = a; 
        y = b;
    }
    
    public void show() {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        Main1 obj = new Main1(100 , 2000);
        obj.show();
    }
}
