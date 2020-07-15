package galaxy.merchant.maps;

import java.util.HashMap;
import java.util.Map;

public class RomanToDecimalMap {
    private static Map<String, Integer> romanToDecimal = new HashMap<String, Integer>();

    static {
        romanToDecimal.put("I", 1);
        romanToDecimal.put("V", 5);
        romanToDecimal.put("X", 10);
        romanToDecimal.put("L", 50);
        romanToDecimal.put("C", 100);
        romanToDecimal.put("D", 500);
        romanToDecimal.put("M", 1000);
    }

    public static int getRomanToDecimalValue(String key) {
        return romanToDecimal.get(key);
    }
}
