public class StringUtils {

    /**
     * Reverses the letters in a given string.
     *
     * @param input the string to reverse
     * @return the reversed string, or null if input is null
     */
    public static String reverseString(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("hello"));   // olleh
        System.out.println(reverseString("Java"));    // avaJ
        System.out.println(reverseString(""));        // (empty)
        System.out.println(reverseString(null));      // null
    }
}
