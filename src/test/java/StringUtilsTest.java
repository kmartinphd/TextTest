import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void reversesLowerCaseWord() {
        assertEquals("olleh", StringUtils.reverseString("hello"));
    }

    @Test
    void reversesMixedCaseWord() {
        assertEquals("avaJ", StringUtils.reverseString("Java"));
    }

    @Test
    void reversesSingleCharacter() {
        assertEquals("a", StringUtils.reverseString("a"));
    }

    @Test
    void reversesPalindrome() {
        assertEquals("racecar", StringUtils.reverseString("racecar"));
    }

    @Test
    void reversesStringWithSpaces() {
        assertEquals("dlrow olleh", StringUtils.reverseString("hello world"));
    }

    @Test
    void reversesStringWithNumbers() {
        assertEquals("321", StringUtils.reverseString("123"));
    }

    @Test
    void emptyStringReturnsEmpty() {
        assertEquals("", StringUtils.reverseString(""));
    }

    @Test
    void nullReturnsNull() {
        assertNull(StringUtils.reverseString(null));
    }
}
