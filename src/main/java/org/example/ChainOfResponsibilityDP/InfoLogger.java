package org.example.ChainOfResponsibilityDP;

public class InfoLogger extends Logger{

    public InfoLogger(Logger nextLogger){
        super(nextLogger);
    }

    public void log(LogType logType, String message){
        if(logType == LogType.INFO){
            System.out.println("Successfully logged the INFO");
        }
        else{
            super.log(logType, message);
        }
    }
}
