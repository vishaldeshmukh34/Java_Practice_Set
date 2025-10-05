public class DivisibleBy3 {
    public static void main(String[] args) {
        //Use a for loop from 1 to 50.
        //Inside the loop, use modulo (%) to check divisibility:

        for(int a = 1 ; a <= 50 ; a ++  )
        {
            if(a % 3 == 0)
            System.out.println(a);
        }
    }
}
