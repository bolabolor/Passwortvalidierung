public class PasswordValidator {

    public static boolean validateAll(String password) {
        return validateLength(password) && containsNumbers(password) && validateUpperLower(password);
    }

    public static boolean validateLength(String password) {

        return (password.length() >=8);
    }

    public static boolean containsNumbers(String password) {
        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

        for (String number : numbers) {
            if (password.contains(number))
                return true;
        }

        return false;
    }

    public static boolean validateUpperLower(String password) {
        return !password.toLowerCase().equals(password)
                && !password.toUpperCase().equals(password);
    }

    public static boolean containsSpecialCharacters(String password) {
        String[] specialCharacters = {"!", "§", "$", "%", "&", "?"};
        for (String item : specialCharacters) {
            if (password.contains(item))

                return true;
        }

        return false;

    }


}
