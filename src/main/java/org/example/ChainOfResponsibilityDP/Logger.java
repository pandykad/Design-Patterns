package org.example.ChainOfResponsibilityDP;

public abstract class Logger {
    Logger nextLogger;

    Logger(Logger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void log(LogType logType, String message){
        if(nextLogger != null){
            nextLogger.log(logType, message);
        }
    }
}
