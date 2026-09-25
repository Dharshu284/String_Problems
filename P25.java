class P25 {
    public static void main(String[] args) {
        String s = "programming";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            boolean repeated = false;
            boolean already = false;

            for (int j = 0; j < s.length(); j++) {
                if (i != j && c == s.charAt(j)) {
                    repeated = true;
                    break;
                }
            }

            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == c) {
                    already = true;
                    break;
                }
            }

            if (repeated && !already)
                System.out.print(c + " ");
        }
    }
}