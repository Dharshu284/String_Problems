import java.util.*;

class P2 {
    public static void main(String[] args) {
        String s = "COMPUTER";
        int count = 0;

        for (char c : s.toCharArray()) {
            count++;
        }

        System.out.println(count);
    }
}