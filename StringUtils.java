import java.util.ArrayList;
import java.util.Collections;

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
        ArrayList<Character> chars = new ArrayList<>();
        for (char c : input.toCharArray()) {
            chars.add(c);
        }
        Collections.reverse(chars);
        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("hello"));   // olleh
        System.out.println(reverseString("Java"));    // avaJ
        System.out.println(reverseString(""));        // (empty)
        System.out.println(reverseString(null));      // null
    }
}
