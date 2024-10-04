package org.example.ChainOfResponsibilityDP;

public class DebugLogger extends Logger{
    public DebugLogger(Logger nextLogger){
        super(nextLogger);
    }

    public void log(LogType logType, String message){
        if(logType == LogType.DEBUG){
            System.out.println("Successfully logged the DEBUG");
        }
        else{
            super.log(logType, message);
        }
    }
}
