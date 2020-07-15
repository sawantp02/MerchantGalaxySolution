package galaxy.merchant.maps;

import java.util.HashMap;
import java.util.Map;

public class IntergalacticToRomanMap {
    private static Map<String, String> intergalacticToRoman = new HashMap<String, String>();

    public static Map<String, String> getIntergalacticToRoman() {
        return intergalacticToRoman;
    }

    public static void setIntergalacticToRoman(Map<String, String> intergalacticToRoman) {
        IntergalacticToRomanMap.intergalacticToRoman = intergalacticToRoman;
    }
}
