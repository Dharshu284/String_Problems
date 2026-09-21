import java.util.*;

class P6 {
    public static void main(String[] args) {
        String s = "abc123@#";
        int digits = 0, special = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= '0' && c <= '9')
                digits++;
            else if (!((c >= 'A' && c <= 'Z') ||
                       (c >= 'a' && c <= 'z')))
                special++;
        }

        System.out.println("Digits = " + digits);
        System.out.println("Special = " + special);
    }
}