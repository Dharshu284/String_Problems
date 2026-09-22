class P15 {
    public static void main(String[] args) {
        String s = "hello world";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                System.out.print("-");
            else
                System.out.print(s.charAt(i));
        }
    }
}
