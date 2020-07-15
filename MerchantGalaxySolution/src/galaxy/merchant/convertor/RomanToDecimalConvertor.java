package galaxy.merchant.convertor;

import galaxy.merchant.maps.RomanToDecimalMap;
import galaxy.merchant.validator.RomanNumeralValidator;

public class RomanToDecimalConvertor {
    public static int convertRomanToDecimal(String romanNumeral) {
        int creditValue = -1;
        boolean isValidate = RomanNumeralValidator.validateRoman(romanNumeral);
        if (isValidate) {
            creditValue = getDecimalValue(romanNumeral);
        }
        return creditValue;
    }

    public static int getDecimalValue(String romanNumeral) {
        int creditValue = 0, prevDecValue, decValue = 0;
        String tokenString;
        for (int iteratorRoman = romanNumeral.length() - 1; iteratorRoman >= 0; iteratorRoman--) {
            prevDecValue = decValue;
            tokenString = "" + romanNumeral.charAt(iteratorRoman);
            decValue = RomanToDecimalMap.getRomanToDecimalValue(tokenString);
            if (decValue < prevDecValue) {
                creditValue -= decValue;
            } else {
                creditValue += decValue;
            }
        }
        return creditValue;
    }
}
