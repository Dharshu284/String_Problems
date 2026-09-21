import java.util.*;

class P7 {
    public static void main(String[] args) {
        String s = "hello";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 'a' && c <= 'z')
                c = (char)(c - 32);

            System.out.print(c);
        }
    }
}
