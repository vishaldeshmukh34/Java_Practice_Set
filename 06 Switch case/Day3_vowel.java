// 3. Vowel or Consonant
// Take a character as input and use a switch-case to check whether it is a
// vowel (a, e, i, o, u) or a consonant. Print the result.

public class Day3_vowel {
    public static void main(String[] args) {
        char ch = 'E';

        switch (Character.toUpperCase(ch)) {
            case 'A': case 'E': case 'I': case 'O': case 'U':
                System.out.println(ch + " is a vowel");
                break;
            default:
                System.out.println(ch + " is a consonant");
        }
    }
}
