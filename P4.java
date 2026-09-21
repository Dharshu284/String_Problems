import java.util.*;

class P4 {
    public static void main(String[] args) {
        String s = "Hello";
        int vowels = 0, consonants = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' ||
                c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' ||
                c == 'O' || c == 'U') {
                vowels++;
            } else if ((c >= 'a' && c <= 'z') ||
                       (c >= 'A' && c <= 'Z')) {
                consonants++;
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }
}
