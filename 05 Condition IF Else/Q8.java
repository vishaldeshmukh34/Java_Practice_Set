public class Q8 {
    public static void main(String[] args) {
          //4. WAP to input week number and print week day.
        int a = 17;
        
        if( a == 1 || a == 8 || a == 15 || a == 22)
        {
              System.out.println("Monday");
        }
        else if (a == 2 || a == 9|| a == 16 || a == 23)
        {
              System.out.println("Tuesday");
        }
        else if (a == 3 || a == 10 || a == 17 || a == 24)
        {
              System.out.println("Wensday");
        }
        else if (a == 4  || a == 11 || a == 18 || a == 25)
        {
              System.out.println("Thursday");
        }
        else if (a == 5  || a == 12 || a == 19 || a == 26)
        {
              System.out.println("Friday");
        }
        else if(a == 6  || a == 13 || a == 20 || a == 27)
        {
              System.out.println("Satuday");
        }
        else
        {
              System.out.println("Sunday");
        }
    }
}
