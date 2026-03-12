import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Utility class providing helper methods for String manipulation.
 */
public class StringUtils {

    /**
     * Reverses the letters in a given string using a stream pipeline.
     *
     * <p>Iterates character indices from the end to the start of the string,
     * maps each index to its corresponding character, and joins them into
     * a new reversed string.</p>
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
        if (input == null) {
            return null;
        }
        return IntStream.rangeClosed(1, input.length())
                .mapToObj(i -> String.valueOf(input.charAt(input.length() - i)))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(reverseString("hello"));   // olleh
        System.out.println(reverseString("Java"));    // avaJ
        System.out.println(reverseString(""));        // (empty)
        System.out.println(reverseString(null));      // null
    }
}
