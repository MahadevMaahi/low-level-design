package DesignPatterns.ChainOfResponsibilityPattern.LogProcessor;

public abstract class LogProcessor {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    private LogProcessor nextLogProcessor;
    LogProcessor(LogProcessor logProcessor) {
        nextLogProcessor = logProcessor;
    }

    public void log(int logLevel, String message) {
        if (nextLogProcessor != null) {
            nextLogProcessor.log(logLevel, message);
        } else {
            System.out.println("No classificaiton of this log mode");
        }
    }
}