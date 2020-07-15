package galaxy.merchant.processor;

import galaxy.merchant.consts.Constants;
import galaxy.merchant.convertor.IntergalacticToDecimalConvertor;
import galaxy.merchant.factoryinterface.IDataPattern;
import galaxy.merchant.maps.MetalToCreditMap;
import galaxy.merchant.validator.QuestionPatternValidator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class QuestionPatternProcessor implements IDataPattern {
    private String inputString = "";

    public QuestionPatternProcessor(String inputString) {
        this.inputString = inputString;
    }

    @Override
    public void processPattern(String pattern) {
        String answer = getAnswer();
        System.out.println(answer);
    }

    public String getAnswer() {
        List<String> tokenList = new ArrayList<String>(Arrays.asList(inputString.split(" ")));
        String romanStringQuestionPattern = QuestionPatternValidator.getQuestionPattern(tokenList);

        if (romanStringQuestionPattern.equals(Constants.ROMAN_NUMERAL_FORMAT)) {
            return handleRomanNumeral(tokenList);
        } else if (romanStringQuestionPattern.equals(Constants.METAL_CREDIT_FORMAT)) {
            return handleMetalCredit(tokenList);
        } else {
            return Constants.INVALID_PATTERN_FORMAT;
        }
    }

    public String handleRomanNumeral(List<String> tokenList) {
        int creditValue = IntergalacticToDecimalConvertor.convertIntergalacticToDecimal(tokenList);
        if (creditValue != -1) {
            return inputString + " is " + creditValue + " Credits";
        } else {
            return Constants.INVALID_PATTERN_FORMAT;
        }
    }

    public String handleMetalCredit(List<String> tokenList) {
        double creditValue = calculateCredits(tokenList);
        if (creditValue != -1) {
            return inputString + " is " + creditValue + " Credits";
        } else {
            return Constants.INVALID_PATTERN_FORMAT;
        }
    }

    public double calculateCredits(List<String> tokenList) {
        int romanValue = IntergalacticToDecimalConvertor
                .convertIntergalacticToDecimal(tokenList.subList(0, tokenList.size() - 1));
        if (romanValue != -1) {
            Map<String, Double> metalToCredit = MetalToCreditMap.getMetalToCredit();
            return romanValue * metalToCredit.get(tokenList.get(tokenList.size() - 1));
        } else {
            return -1;
        }
    }
}