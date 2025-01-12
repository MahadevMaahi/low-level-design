package DesignPatterns.ChainOfResponsibilityPattern.LogProcessor;

public class InfoLogProcessor extends LogProcessor {
    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel ==LogProcessor.INFO) {
            System.out.println("Info Level Log: " + message);
        } else {
            super.log(logLevel, message);
        }
    }
    
}