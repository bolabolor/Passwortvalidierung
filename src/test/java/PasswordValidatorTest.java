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



    @Test
    void expectedFalseWhenAllLowerCase() {
        //GIVEN
        String allLower = "sdbhigklr";
        //WHEN
        boolean actual = PasswordValidator.validateUpperLower(allLower);
        //THEN
        assertFalse(actual);
    }

    @Test
    void expectedFalseWhenAllUpperCase() {
        //GIVEN
        String allUpper = "FJGREIGOET";
        //WHEN
        boolean actual = PasswordValidator.validateUpperLower(allUpper);
        //THEN
        assertFalse(actual);
    }

    @Test
    void expectedTrueWhenPasswordContainsUpperAndLower() {
        //GIVEN
        String upperLower = "FJfjfkfdJDKF";
        //WHEN
        boolean actual = PasswordValidator.validateUpperLower(upperLower);
        //THEN
        assertTrue(actual);
    }
    @Test
    void expectedTrueWhenPasswordContainsSpecialCharacters() {
        // GIVEN
        String specialCharacters = "Hello&§$%!";
        // WHEN
        boolean actual = PasswordValidator.containsSpecialCharacters(specialCharacters);
        // THEN
        assertTrue(actual);
    }
    @Test
    void expectedFalseWhenPasswordContainsNoSpecialCharacters() {
        // GIVEN
        String specialCharacters = "Hello";
        // WHEN
        boolean actual = PasswordValidator.containsSpecialCharacters(specialCharacters);
        // THEN
        assertFalse(actual);
    }

}
