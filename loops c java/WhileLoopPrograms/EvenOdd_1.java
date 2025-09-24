// Q1: Write a program to print whether numbers from 1 to 100 are even or odd using a while loop

class EvenOdd_1 {
    public static void main(String[] args) {
        int a = 1 ;
        while(a <= 100) {
            if(a % 2 == 0) {
                 System.out.println("this is even " + a);
            } else {
                System.out.println("this odd " + a);
            }
            a++;
        }
    }
}