import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
