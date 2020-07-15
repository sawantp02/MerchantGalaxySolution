package galaxy.merchant.convertor;

import java.util.List;
import java.util.Map;

import galaxy.merchant.maps.IntergalacticToRomanMap;

public class IntergalacticToRomanConvertor {
	public static String convertIntergalacticToRoman(List<String> intergalacticUnit) {
		String romanNumeral = "";
		Map<String, String> intergalacticToRoman = IntergalacticToRomanMap.getIntergalacticToRoman();
		for (String unitString : intergalacticUnit) {
			if (intergalacticToRoman.containsKey(unitString)) {
				romanNumeral += intergalacticToRoman.get(unitString);
			} else {
				return null;
			}
		}
		return romanNumeral;
	}
}
