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
        return -1;
    }

    private static int[] getNextTable(String str) {
        return null;
    }

    private static String getNextChar(char c) {
        // COMPLICATED CODE AHEAD
        // (int) temp.charAt(i)) -> ascii value of char at i
        // (((int) temp.charAt(i)) + 1) -> next ascii value after i (we ensure its a different value)
        // (char)(((int) temp.charAt(i)) + 1) -> cast that ascii value to char
        // Character.toString((char)(((int) temp.charAt(i)) + 1)) -> make that char a string
        return Character.toString((char) (((int) c) + 1));
    }

    public static void main(String[] args) {
        System.out.println(getNextChar('a'));
    }

}
