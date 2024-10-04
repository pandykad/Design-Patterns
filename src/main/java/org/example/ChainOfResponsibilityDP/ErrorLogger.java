package org.example.ChainOfResponsibilityDP;

public class ErrorLogger extends Logger{

    public ErrorLogger(Logger nextLogger){
        super(nextLogger);
    }

    public void log(LogType logType, String message){
        if(logType == LogType.ERROR){
            System.out.println("Successfully logged the ERROR");
        }
        else{
            super.log(logType, message);
        }
    }
}
