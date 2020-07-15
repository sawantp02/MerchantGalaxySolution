package galaxy.merchant.filehandling;

import galaxy.merchant.factory.PatternProcessorFactory;
import galaxy.merchant.factoryinterface.IDataPattern;

public class IntergalacticDataProcessor {
    public void processIntergalacticData(String patternString) {
        IDataPattern dataPatternInterface = PatternProcessorFactory.getFactoryInstance().getPattern(patternString);
        if (dataPatternInterface != null) {
            dataPatternInterface.processPattern(patternString);
        }
    }
}
