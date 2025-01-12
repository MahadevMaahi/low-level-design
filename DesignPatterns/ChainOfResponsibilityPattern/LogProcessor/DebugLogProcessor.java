package DesignPatterns.ChainOfResponsibilityPattern.LogProcessor;

public class DebugLogProcessor extends LogProcessor {
    public DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel ==LogProcessor.DEBUG) {
            System.out.println("Debug Level Log: " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
