package DesignPatterns.ChainOfResponsibilityPattern.LogProcessor;

public class ErrorLogProcessor extends LogProcessor {
    public ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel ==LogProcessor.ERROR) {
            System.out.println("Error Level Log: " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
