package galaxy.merchant.factory;

import galaxy.merchant.consts.Constants;
import galaxy.merchant.factoryinterface.IDataPattern;
import galaxy.merchant.processor.AssignmentPatternProcessor;
import galaxy.merchant.processor.CreditPatternProcessor;
import galaxy.merchant.processor.PatternProcessor;
import galaxy.merchant.processor.QuestionPatternProcessor;

public class PatternProcessorFactory {
    private static PatternProcessorFactory patternProcessorFactory = new PatternProcessorFactory();

    private PatternProcessorFactory() {

    }

    public IDataPattern getPattern(String patternString) {
        String patternMatch;
        if ((patternMatch = PatternProcessor.validateAssignmentPattern(patternString)) != null) {
            return new AssignmentPatternProcessor();
        } else if ((patternMatch = PatternProcessor.validateCreditPattern(patternString)) != null) {
            return new CreditPatternProcessor(patternMatch);
        } else if ((patternMatch = PatternProcessor.validateQuestionPattern(patternString)) != null) {
            return new QuestionPatternProcessor(patternMatch);
        } else {
            System.out.println(Constants.INVALID_PATTERN_FORMAT);
        }
        return null;
    }

    public static PatternProcessorFactory getFactoryInstance() {
        return patternProcessorFactory;
    }
}
