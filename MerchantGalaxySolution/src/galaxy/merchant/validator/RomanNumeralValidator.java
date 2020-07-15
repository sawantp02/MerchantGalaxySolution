package galaxy.merchant.validator;

import java.util.regex.Pattern;

public class RomanNumeralValidator {
    public static boolean validateRoman(String romanNumeral) {
        if (!romanNumeral.matches("[IVXLCDM]+")) {
            return false;
        }

        Pattern pattern = Pattern.compile("^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
        return pattern.matcher(romanNumeral).find();
    }
}