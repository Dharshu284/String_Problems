class Main {
    public static void main(String[] args) {
        String s = "banana";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            boolean already = false;

            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    already = true;
                    break;
                }
            }

            if (!already)
                count++;
        }

        System.out.println(count);
    }
}