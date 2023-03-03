import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {
    @Test
    void expectedTrueWhenPasswordLongerThanEight(){
        // GIVEN
        String longerThanEight = "Hallooooo";
        // WHEN
        boolean actual = PasswordValidator.validateLength(longerThanEight);
        // THEN
        assertEquals(true, actual);
    }
    @Test
    void expectedTrueWhenPasswordIsEqual(){
        // GIVEN
        String equalEight = "Helloooo";
        // WHEN
        boolean actual = PasswordValidator.validateLength(equalEight);
        // THEN
        assertEquals(true, actual);
    }
    @Test
    void expectedFalseWhenPasswordIsShorterThanEight(){
        // GIVEN
        String shorterThanEight = "Hello";
        // WHEN
        boolean actual = PasswordValidator.validateLength(shorterThanEight);
        // THEN
        assertEquals(false, actual);
    }

    @Test
    void expectedFalseWhenPasswordDoesntContainsNumbers() {
        // GIVEN
        String noNumbers = "Hello";
        // WHEN
        boolean actual = PasswordValidator.containsNumbers(noNumbers);
        // THEN
        assertFalse(actual);
    }

    @Test
    void expectedTrueWhenPasswordContainsNumbers() {
        // GIVEN
        String noNumbers = "Hello1";
        // WHEN
        boolean actual = PasswordValidator.containsNumbers(noNumbers);
        // THEN
        assertTrue(actual);
    }
}
