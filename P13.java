class P13 {
    public static void main(String[] args) {
        String s = "Madam";
        boolean palindrome = true;

        int i = 0, j = s.length() - 1;

        while (i < j) {
            char a = s.charAt(i);
            char b = s.charAt(j);

            if (a >= 'A' && a <= 'Z')
                a = (char)(a + 32);

            if (b >= 'A' && b <= 'Z')
                b = (char)(b + 32);

            if (a != b) {
                palindrome = false;
                break;
            }

            i++;
            j--;
        }

        System.out.println(palindrome);
    }
}
