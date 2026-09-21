import java.util.*;

class P8 {
    public static void main(String[] args) {
        String s = "HELLO";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 'A' && c <= 'Z')
                c = (char)(c + 32);

            System.out.print(c);
        }
    }
}
