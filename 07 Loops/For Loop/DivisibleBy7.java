// Program to count numbers between 1 and 200 divisible by 7

class DivisibleBy7 {
    public static void main(String[] args) {
        int count = 0;

        for(int i = 1; i <= 200; i++) {
            if(i % 7 == 0) {
                count++;
                System.out.println(i + " is divisible by 7"); // Optional: print the number
            }
        }

        System.out.println("Total numbers divisible by 7 between 1 and 200: " + count);
    }
}
