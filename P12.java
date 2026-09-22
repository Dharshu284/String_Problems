class P12 {
    public static void main(String[] args) {
        String s = "madam";
        boolean palindrome = true;

        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                palindrome = false;
                break;
            }
            i++;
            j--;
        }

        System.out.println(palindrome);
    }
}