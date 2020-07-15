package galaxy.merchant.processor;

import galaxy.merchant.consts.Constants;
import galaxy.merchant.convertor.IntergalacticToDecimalConvertor;
import galaxy.merchant.factoryinterface.IDataPattern;
import galaxy.merchant.maps.MetalToCreditMap;
import galaxy.merchant.validator.CreditPatternValidator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class CreditPatternProcessor implements IDataPattern {
    private String inputString = "";

    public CreditPatternProcessor(String inputString) {
        this.inputString = inputString;
    }

    @Override
    public void processPattern(String pattern) {
        List<String> tokenList = new ArrayList<String>(Arrays.asList(inputString.split(" ")));
        if (CreditPatternValidator.validateMetalCredit(tokenList)) {
            processCreditPattern(tokenList);
        } else {
            System.out.println(Constants.INVALID_CREDIT_FORMAT);
        }

    }

    public void processCreditPattern(List<String> tokenList) {
        int romanValue = IntergalacticToDecimalConvertor
                .convertIntergalacticToDecimal(tokenList.subList(0, tokenList.size() - 2));
        if (romanValue != -1) {
            double totalCredits = Double.parseDouble(tokenList.get(tokenList.size() - 1));
            double credits = totalCredits / romanValue;

            Map<String, Double> metalToCredit = MetalToCreditMap.getMetalToCredit();
            metalToCredit.put(tokenList.get(tokenList.size() - 2), credits);
            MetalToCreditMap.setMetalToCredit(metalToCredit);
        } else {
            System.out.println(Constants.INVALID_CREDIT_FORMAT);
        }
    }
}
