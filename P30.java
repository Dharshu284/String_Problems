class P30 {
    public static void main(String[] args) {
        String s = "abcde";
        boolean unique = true;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (!unique)
                break;
        }

        System.out.println(unique);
    }
}
