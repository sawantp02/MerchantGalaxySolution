package galaxy.merchant.processor;

import galaxy.merchant.factoryinterface.IDataPattern;
import galaxy.merchant.maps.IntergalacticToRomanMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class AssignmentPatternProcessor implements IDataPattern {

    public AssignmentPatternProcessor() {}

    @Override
    public void processPattern(String pattern) {
        Map<String, String> intergalacticToRomanMap = IntergalacticToRomanMap.getIntergalacticToRoman();
        List<String> tokenArray = new ArrayList<String>(Arrays.asList(pattern.split(" ")));
        intergalacticToRomanMap.put(tokenArray.get(0), tokenArray.get(tokenArray.size() - 1));
        IntergalacticToRomanMap.setIntergalacticToRoman(intergalacticToRomanMap);
    }
}
