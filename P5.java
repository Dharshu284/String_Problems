import java.util.*;

class P5 {
    public static void main(String[] args) {
        String s = "HeLLo";
        int upper = 0, lower = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 'A' && c <= 'Z')
                upper++;
            else if (c >= 'a' && c <= 'z')
                lower++;
        }

        System.out.println("Uppercase = " + upper);
        System.out.println("Lowercase = " + lower);
    }
}
