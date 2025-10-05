public class C {
    public static void main(String[] args) {
     
      //    Q.C] Grade System :-Take marks (0–100) and print grade using switch.



        int a = 60;  // marks

        switch (a / 10) {
            case 10: // when marks = 100
            case 9: 
                System.out.println("A");
                break;
            case 8: 
                System.out.println("B");
                break;
            case 7: 
                System.out.println("C");
                break;
            case 6: 
                System.out.println("D");
                break;
            default:
                System.out.println("Fail");
        }
    }
}
