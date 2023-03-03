public class PasswordValidator {
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
}
