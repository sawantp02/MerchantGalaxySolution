package galaxy.merchant.processor;

import galaxy.merchant.patterns.IntergalacticDataPatterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternProcessor {
    private static Pattern pattern = null;
    private static Matcher matcher = null;

    public static String validateAssignmentPattern(String patternString) {
        pattern = Pattern.compile(IntergalacticDataPatterns.ASSIGNMENT_PATTERN);
        matcher = pattern.matcher(patternString);
        if (matcher.find()) {
            return patternString;
        }
        return null;
    }

    public static String validateCreditPattern(String patternString) {
        pattern = Pattern.compile(IntergalacticDataPatterns.METAL_CREDIT_PATTERN, Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher(patternString);
        if (matcher.find()) {
            String metalUnits = matcher.group(1);
            String metalCredit = matcher.group(4);
            return metalUnits + " " + metalCredit;
        }
        return null;
    }

    public static String validateQuestionPattern(String patternString) {
        pattern = Pattern.compile(IntergalacticDataPatterns.QUESTION_PATTERN, Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher(patternString);
        if (matcher.find()) {
            return matcher.group(2);
        }
        return null;
    }
}
