class P20 {
    public static void main(String[] args) {
        String s = "programming";
        char target = 'g';
        int index = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target) {
                index = i;
            }
        }

        System.out.println(index);
    }
}