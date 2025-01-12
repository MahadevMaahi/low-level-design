package DesignPatterns.ChainOfResponsibilityPattern;

import DesignPatterns.ChainOfResponsibilityPattern.LogProcessor.DebugLogProcessor;
import DesignPatterns.ChainOfResponsibilityPattern.LogProcessor.ErrorLogProcessor;
import DesignPatterns.ChainOfResponsibilityPattern.LogProcessor.InfoLogProcessor;
import DesignPatterns.ChainOfResponsibilityPattern.LogProcessor.LogProcessor;

public class Engine {
    public static void main(String[] args) {
        LogProcessor logger = new InfoLogProcessor(
            new DebugLogProcessor(
                new ErrorLogProcessor(null)
            )
        );

        logger.log(LogProcessor.INFO, "First log");
        logger.log(LogProcessor.DEBUG, "Second log");
        logger.log(LogProcessor.ERROR, "Third log");
        logger.log(0, "Fourth log");
    }
}
