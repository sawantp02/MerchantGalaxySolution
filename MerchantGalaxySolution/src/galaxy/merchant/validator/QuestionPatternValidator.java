package galaxy.merchant.validator;

import galaxy.merchant.consts.Constants;
import galaxy.merchant.maps.IntergalacticToRomanMap;
import galaxy.merchant.maps.MetalToCreditMap;

import java.util.List;
import java.util.Map;

public class QuestionPatternValidator {
    public static Map<String, String> intergalacticToRomanMap = IntergalacticToRomanMap.getIntergalacticToRoman();
    public static Map<String, Double> metalToCreditMap = MetalToCreditMap.getMetalToCredit();

    public static String getQuestionPattern(List<String> question) {
        if (validateQuestion(question)) {
            if (intergalacticToRomanMap.containsKey(question.get(question.size() - 1))) {
                return Constants.ROMAN_NUMERAL_FORMAT;
            } else if (metalToCreditMap.containsKey(question.get(question.size() - 1))) {
                return Constants.METAL_CREDIT_FORMAT;
            } else {
                return Constants.INVALID_QUESTION_FORMAT;
            }
        } else {
            return Constants.INVALID_QUESTION_FORMAT;
        }
    }

    public static boolean validateQuestion(List<String> question) {
        for (int iter = 0; iter < question.size() - 2; iter++) {
            if (!intergalacticToRomanMap.containsKey(question.get(iter))) {
                return false;
            }
        }
        return true;
    }
}
