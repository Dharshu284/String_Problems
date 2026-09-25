class P27 {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        if (s1.length() != s2.length()) {
            System.out.println(false);
            return;
        }

        boolean anagram = true;

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);

            int count1 = 0;
            int count2 = 0;

            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(j) == c)
                    count1++;

                if (s2.charAt(j) == c)
                    count2++;
            }

            if (count1 != count2) {
                anagram = false;
                break;
            }
        }

        System.out.println(anagram);
    }
}
