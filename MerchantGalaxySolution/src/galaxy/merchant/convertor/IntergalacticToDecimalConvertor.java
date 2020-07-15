package galaxy.merchant.convertor;

import java.util.List;

public class IntergalacticToDecimalConvertor {
    public static int convertIntergalacticToDecimal(List<String> tokenList) {
        int decimalValue;
        String romanNumeral = IntergalacticToRomanConvertor.convertIntergalacticToRoman(tokenList);
        if (romanNumeral != null) {
            decimalValue = RomanToDecimalConvertor.convertRomanToDecimal(romanNumeral);
        } else {
            return -1;
        }
        return decimalValue;
    }
}
