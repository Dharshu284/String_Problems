class P17 {
    public static void main(String[] args) {
        String s = "I love coding";
        String word = "";

        for (int i = 0; i <= s.length(); i++) {

            if (i == s.length() || s.charAt(i) == ' ') {

                for (int j = word.length() - 1; j >= 0; j--) {
                    System.out.print(word.charAt(j));
                }

                if (i != s.length())
                    System.out.print(" ");

                word = "";
            } else {
                word += s.charAt(i);
            }
        }
    }
}