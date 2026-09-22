class P16 {
    public static void main(String[] args) {
        String s = "I love coding";
        int count = 0;
        boolean insideWord = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && !insideWord) {
                count++;
                insideWord = true;
            } else if (s.charAt(i) == ' ') {
                insideWord = false;
            }
        }

        System.out.println(count);
    }
}
