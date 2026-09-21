import java.util.*;

class P10 {
    public static void main(String[] args) {
        String s = "ABC";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c + " = " + (int)c);
        }
    }
}