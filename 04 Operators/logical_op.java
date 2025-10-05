public class logical_op {
    public static void main(String[] args) {

        System.out.println("Logical AND");
        System.out.println((23>10) && (67>10));   // true
        System.out.println((23>10) && (67<10));   // false
        System.out.println((23<10) && (67>10));   // false  
        System.out.println((23<10) && (67<10));   // false
        System.out.println((23==10) && (67<10));  // false

        System.out.println("Logical OR");
        System.out.println((23>10) || (67>10));   // true
        System.out.println((23>10) || (67<10));   // true
        System.out.println((23<10) || (67>10));   // true   
        System.out.println((23<10) || (67<10));   // false
        System.out.println((23==10) || (67<10));  // false
        
        System.out.println("Logical NOT");
        System.out.println(!(23>10));   // false
        System.out.println(!(23<10));   // true
        System.out.println(!(67>10));   // false
        System.out.println(!(67<10));   // true
        System.out.println(!(23==10));  // true


        System.out.println("logical not operator");
        System.out.println(!(78>89));  // false
        System.out.println(!(78<89));  // true
        System.out.println(!(78==89)); // true
        System.out.println(!(78!=89)); // false
        System.out.println(!(78<=89)); // false
    
        
    }
}
