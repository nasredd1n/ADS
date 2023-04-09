public class problem8 {
    public static boolean isAllDigits(String s) {
        if (s.length() == 0) {
            return true;
        }
        char firstChar = s.charAt(0);
        if (!Character.isDigit(firstChar)) {
            return false;
        }
        String remainingChars = s.substring(1);
        return isAllDigits(remainingChars);
    }
}
