import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}
