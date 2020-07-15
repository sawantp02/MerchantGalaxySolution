package galaxy.merchant.validator;

import galaxy.merchant.maps.IntergalacticToRomanMap;

import java.util.List;
import java.util.Map;

public class CreditPatternValidator {
    public static Map<String, String> intergalacticToRomanMap = IntergalacticToRomanMap.getIntergalacticToRoman();

    public static boolean validateMetalCredit(List<String> metalCredit) {
        for (int iter = 0; iter < metalCredit.size() - 2; iter++) {
            if (!intergalacticToRomanMap.containsKey(metalCredit.get(iter))) {
                return false;
            }
        }
        return true;
    }
}
