class P29 {
    public static void main(String[] args) {
        String s = "ABCz";
        char max = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) > max)
                max = s.charAt(i);
        }

        System.out.println(max);
    }
}