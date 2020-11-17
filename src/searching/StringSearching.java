package searching;

public class StringSearching {
    /**
     * Simple algorithm that can work well in practice.
     * Worst case behaviour is O(text.length * pattern.length)
     * Expected performance is O(text.length + pattern.length)
     *
     * @param text
     * @param pattern
     * @return position of pattern in text if found
     */
    public static int bruteForceSearch(String text, String pattern) {
        int t = text.length();
        int p = pattern.length();
        for (int i = 0; i < (t - p); i++) {
            int letter = 0;
            while (letter < p && text.charAt(i + letter) == pattern.charAt(letter)) {
                letter++;
            }
            if (letter == p) return i;
        }
        return -1;
    }

    public static int KMP(String text, String pattern) {
        int[] next = getNextTable(pattern);
        int t = text.length();
        int p = pattern.length();

        for (int i = 0; i <= (t - p); i++) {
            int letter = 0;
            while (letter < p && text.charAt(i + letter) == pattern.charAt(letter)) {
                letter++;
            }
            if (letter == p) return i;
            else i += (letter - next[letter] - 1);
        }
        return -1;
    }

    private static int[] getNextTable(String str) {
        int[] next_table = new int[str.length()];
        next_table[0] = -1;
        int pos = 1;
        int cnd = 0;

        while (pos < str.length()) {
            if (str.charAt(pos) == str.charAt(cnd))
                next_table[pos] = next_table[cnd];
            else {
                next_table[pos] = cnd;
                cnd = next_table[cnd];
                while (cnd >= 0 && str.charAt(pos) != str.charAt(cnd)) {
                    cnd = next_table[cnd];
                }
            }
            pos++;
            cnd++;
        }
        return next_table;
    }

    public static int BoyerMoore(String text, String pattern) {
        int t = text.length();
        int p = pattern.length();
        int i = 0;

        while (i < (t - p)) {
            int letter = p-1;
            while (letter > 0 && text.charAt(i + letter) == pattern.charAt(letter)) {
                letter--;
            }
            if (letter == 0) return i;
            i += p;
        }
        return -1;
    }

    public static void main(String[] args) {
        String text = "ABBDABAEABBCD";
        String str = "ABBC";

        System.out.println(BoyerMoore(text, str));
    }

}
