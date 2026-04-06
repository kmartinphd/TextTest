/**
 * Utility class providing helper methods for String manipulation.
 */
public class StringUtils {

    /**
     * Reverses the letters in a given string using Apache Commons Lang.
     *
     * <p>Delegates to {@code org.apache.commons.lang3.StringUtils.reverse()},
     * which handles {@code null} by returning {@code null} and empty strings
     * by returning an empty string.</p>
     *
     * <p>Examples:</p>
     * <pre>
     *   reverseString("hello") → "olleh"
     *   reverseString("Java")  → "avaJ"
     *   reverseString("")      → ""
     *   reverseString(null)    → null
     * </pre>
     *
     * @param input the string to reverse; may be {@code null}
     * @return the reversed string, or {@code null} if {@code input} is {@code null}
     */
    public static String reverseString(String input) {
        return org.apache.commons.lang3.StringUtils.reverse(input);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("hello"));   // olleh
        System.out.println(reverseString("Java"));    // avaJ
        System.out.println(reverseString(""));        // (empty)
        System.out.println(reverseString(null));      // null
    }
}
