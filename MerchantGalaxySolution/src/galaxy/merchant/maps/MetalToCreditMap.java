package galaxy.merchant.maps;

import java.util.HashMap;
import java.util.Map;

public class MetalToCreditMap {
    private static Map<String, Double> metalToCredit = new HashMap<String, Double>();

    public static Map<String, Double> getMetalToCredit() {
        return metalToCredit;
    }

    public static void setMetalToCredit(Map<String, Double> metalToCredit) {
        MetalToCreditMap.metalToCredit = metalToCredit;
    }
}
