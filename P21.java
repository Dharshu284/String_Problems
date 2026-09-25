class P21 {
    public static void main(String[] args) {
        String s = "banana";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            boolean already = false;

            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == c) {
                    already = true;
                    break;
                }
            }

            if (!already) {
                int count = 0;

                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == c)
                        count++;
                }

                System.out.println(c + "=" + count);
            }
        }
    }
}