class P23 {
    public static void main(String[] args) {
        String s = "banana";
        char result = s.charAt(0);
        int min = s.length() + 1;

        for (int i = 0; i < s.length(); i++) {
            int count = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    count++;
            }

            if (count < min) {
                min = count;
                result = s.charAt(i);
            }
        }

        System.out.println(result);
    }
}
