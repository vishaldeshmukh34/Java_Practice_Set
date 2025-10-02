// Practice Programs using Methods in Java

class Main {

    // 1. WAM to print Hi on the console.
    public void q1() {
        System.out.println("Hi");
    }

    // 2. WAM to show addition, subtraction, multiplication and division of two numbers.
    public void q2(int a, int b) {
        System.out.println("Addition :- " + (a + b));
        System.out.println("Subtraction :- " + (a - b));
        System.out.println("Multiplication :- " + (a * b));
        System.out.println("Division :- " + (a / b));
    }

    // 3. WAM to calculate factorial of a number.
    public void q3(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        System.out.println("Factorial of " + n + " :- " + f);
    }

    // 4. WAM to display reverse of a number.
    public void q4(int n) {
        int rev = 0, temp = n;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }
        System.out.println("Reverse of " + n + " :- " + rev);
    }

    // 5. WAM to find AND operation of two boolean values.
    public void q5(boolean a, boolean b) {
        System.out.println("AND Result :- " + (a && b));
    }

    // 6. WAM to check whether a number is even or odd.
    public void q6(int num) {
        if (num % 2 == 0)
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd");
    }

    // 7. WAM to print multiplication table of a number (1 to 10).
    public void q7(int n) {
        System.out.println("Multiplication Table of " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }

    // 8. WAM to find maximum of two numbers.
    public void q8(int a, int b) {
        if (a > b)
            System.out.println(a + " is greater");
        else if (b > a)
            System.out.println(b + " is greater");
        else
            System.out.println("Both are equal");
    }

    // 9. WAM to find cube of a number.
    public void q9(int num) {
        System.out.println("Cube of " + num + " = " + (num * num * num));
    }

    // 10. WAM to print all numbers between a and b.
    public void q10(int a, int b) {
        System.out.println("Numbers between " + a + " and " + b + " :-");
        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 11. WAM to check whether a number is prime or not.
    public void q11(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count == 2)
            System.out.println(n + " is Prime");
        else
            System.out.println(n + " is Not Prime");
    }

    // 12. WAM with name sakshi which accepts a character and print its ASCII value.
    public void sakshi(char ch) {
        int ASCII = (int) ch;
        System.out.println("ASCII of " + ch + " :- " + ASCII);
    }

    // 13. WAM with name pratiksha which accepts 3 numbers and prints minimum of them.
    public void pratiksha(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        System.out.println("Minimum number :- " + min);
    }

    // 14. WAM with name abhishek which accepts 3 numbers and prints maximum of them.
    public void abhishek(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        System.out.println("Maximum number :- " + max);
    }

    // 15. WAM with name sanket which accepts PIN and prints login success or failed.
    public void sanket(int pin) {
        if (pin == 1234)
            System.out.println("Login Success");
        else
            System.out.println("Login Failed");
    }

    // 16. WAM with name Mangesh which accepts a Boolean value and checks if it true or false.
    public void Mangesh(boolean value) {
        if (value)
            System.out.println("Mangesh reports: The value is True.");
        else
            System.out.println("Mangesh reports: The value is False.");
    }

    // 17. WAM with name Aniket which accepts a name and greets him/her welcome.
    public void Aniket(String name) {
        System.out.println("Welcome to my program, " + name + "!");
    }

    // 18. WAM with name Vishal which accepts a number and checks if it is prime or not.
    public void Vishal(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        if (count == 2)
            System.out.println(n + " is Prime");
        else
            System.out.println(n + " is Not Prime");
    }
    // 19. WAM to accept a number and print the sum of its digits.
    
    public void Neha(int n)
    {
        int sum = 0 ;
        
        while(n > 0)
        {
            int digits = n % 10 ;
            sum += digits ;
            n = n / 10 ;
        }
        System.out.println("Sum oF Its Digits :- " +sum);
    }
   // 20. WAM to check whether a number is palindrome or not.
   
   public void Rohini(int n )
   {
       int rev = 0 ;
       int tep = n ;
       
       while(n > 0)
       {
          int Digit = n % 10 ;
          rev = rev * 10 + Digit  ;
          n = n / 10 ;
       }
       
       if(tep == rev)
       {
           System.out.println("This is palindrome");
       }
       else
       {
           System.out.println("This Not palindrome");
       }
   }
   
   // 21. Fibonacci Series
    public void q21_Fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    // 22. Greatest Common Divisor (GCD)
    public void q22_GCD(int a, int b) {
        int x = a, y = b;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        System.out.println("GCD of " + a + " and " + b + " is: " + x);
    }

    // 23. Least Common Multiple (LCM)
    public void q23_LCM(int a, int b) {
        int gcd = a, temp = b;
        while (temp != 0) {
            int t = temp;
            temp = gcd % temp;
            gcd = t;
        }
        int lcm = (a * b) / gcd;
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }

    // 24. Armstrong Number
    public void q24_Armstrong(int n) {
        int temp = n, sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        if (sum == n)
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n + " is NOT an Armstrong number");
    }

    // 25. Perfect Number
    public void q25_Perfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        if (sum == n)
            System.out.println(n + " is a Perfect number");
        else
            System.out.println(n + " is NOT a Perfect number");
    }


    // 26. Strong Number
    public void q26_StrongNumber(int n) {
        int temp = n, sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            temp /= 10;
        }
        if (sum == n)
            System.out.println(n + " is a Strong Number");
        else
            System.out.println(n + " is NOT a Strong Number");
    }

    // 27. Count Digits
    public void q27_CountDigits(int n) {
        int count = 0, temp = n;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        System.out.println("Number of digits in " + n + " is: " + count);
    }

    // 28. Find Power (a^b)
    public void q28_Power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println(a + " ^ " + b + " = " + result);
    }

    // 29. Temperature Conversion
    public void q29_TempConversion(double temp, char type) {
        if (type == 'C' || type == 'c') {
            double f = (temp * 9 / 5) + 32;
            System.out.println(temp + "°C = " + f + "°F");
        } else if (type == 'F' || type == 'f') {
            double c = (temp - 32) * 5 / 9;
            System.out.println(temp + "°F = " + c + "°C");
        } else {
            System.out.println("Invalid type! Use 'C' or 'F'");
        }
    }

    // 30. Factor Numbers
    public void q30_Factors(int n) {
        System.out.print("Factors of " + n + " : ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    // 31. Prime Numbers in Range
    public void q31_PrimeInRange(int a, int b) {
        System.out.print("Prime numbers between " + a + " and " + b + " : ");
        for (int n = a; n <= b; n++) {
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0)
                    count++;
            }
            if (count == 2)
                System.out.print(n + " ");
        }
        System.out.println();
    }

    // 32. Sum of Even and Odd Numbers in Range
    public void q32_SumEvenOdd(int a, int b) {
        int sumEven = 0, sumOdd = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0)
                sumEven += i;
            else
                sumOdd += i;
        }
        System.out.println("Sum of Even numbers: " + sumEven);
        System.out.println("Sum of Odd numbers: " + sumOdd);
    }

    // 33. Simple Interest
    public void q33_SimpleInterest(double P, double R, double T) {
        double SI = (P * R * T) / 100;
        System.out.println("Simple Interest: " + SI);
    }

    // 34. Compound Interest
    public void q34_CompoundInterest(double P, double R, double T) {
        double CI = P * Math.pow(1 + R / 100, T) - P;
        System.out.println("Compound Interest: " + CI);
    }

    // 35. Vowel or Consonant
    public void q35_VowelConsonant(char ch) {
        char c = Character.toLowerCase(ch);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            System.out.println(ch + " is a Vowel");
        else
            System.out.println(ch + " is a Consonant");
    }

    // 36. Alphabet / Digit / Special Character
    public void q36_CharType(char ch) {
        if (Character.isLetter(ch))
            System.out.println(ch + " is an Alphabet");
        else if (Character.isDigit(ch))
            System.out.println(ch + " is a Digit");
        else
            System.out.println(ch + " is a Special Character");
    }

    // 37. Uppercase to Lowercase Conversion
    public void q37_ToLower(char ch) {
        if (Character.isUpperCase(ch))
            System.out.println(ch + " in lowercase: " + Character.toLowerCase(ch));
        else
            System.out.println(ch + " is not uppercase");
    }

    // 38. Largest of n Numbers
    public void q38_Largest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest number: " + max);
    }

    // 39. Smallest of n Numbers
    public void q39_Smallest(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Smallest number: " + min);
    }

    // 40. Sum of Array Elements
    public void q40_SumArray(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += n;
        System.out.println("Sum of array elements: " + sum);
    }
  
    // Q 41] . We are having a party with amounts of tea and candy. Print the int outcome of the party encoded as 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5. However, if either tea or candy is at least double the amount of the other one, the party is great (2). However, in all cases, if either tea or candy is less than 5, the party is always bad (0).
    
      public void q41(int tea , int candy)
    {
        
        if(tea < 5 || candy < 5)
        {
            System.out.println("Bad");
        }
        else if(tea >= 2*candy || candy >= 2*tea)
        {
            System.out.println("great");
        }
        else
        {
            System.out.println("good");
        }
        
       
    }

    // main method to call above programs
    public static void main(String[] args) {
        Main obj = new Main();


        obj.q1();
        obj.q2(5, 6);
        obj.q3(5);
        obj.q4(1234);
        obj.q5(true, false);
        obj.q6(11);
        obj.q7(7);
        obj.q8(23, 45);
        obj.q9(5);
        obj.q10(5, 15);
        obj.q11(17);

        obj.sakshi('A');
        obj.pratiksha(3, 1, 2);
        obj.abhishek(3, 8, 5);
        obj.sanket(1234);
        obj.Mangesh(true);
        obj.Aniket("Vishal");
        obj.Vishal(19);
        obj.Neha(12345);
        obj.Rohini(1217);
        
         obj.q21_Fibonacci(10);
        obj.q22_GCD(36, 60);
        obj.q23_LCM(12, 18);
        obj.q24_Armstrong(153);
        obj.q25_Perfect(28);
        obj.q26_StrongNumber(145);
        obj.q27_CountDigits(12345);
        obj.q28_Power(2, 5);
        obj.q29_TempConversion(37, 'C');
        obj.q30_Factors(28);
        obj.q31_PrimeInRange(10, 50);
        obj.q32_SumEvenOdd(1, 10);
        obj.q33_SimpleInterest(10000, 5, 2);
        obj.q34_CompoundInterest(10000, 5, 2);
        obj.q35_VowelConsonant('E');
        obj.q36_CharType('@');
        obj.q37_ToLower('G');
        obj.q38_Largest(new int[]{3, 5, 9, 1, 7});
        obj.q39_Smallest(new int[]{3, 5, 9, 1, 7});
        obj.q40_SumArray(new int[]{3, 5, 9, 1, 7});
        obj.q41(23, 4);
    }
}
