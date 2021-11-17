package com.mrnadimi.logger;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Developer: Mohamad Nadimi
 * Company: Saghe
 * Website: https://www.mrnadimi.com
 * Created on 16 November 2021
 * <p>
 * Description: Just System log
 */
public class SystemLog implements LoggerFace {


    public static SystemLog getLog(Class<?> logClass){
        return new SystemLog(logClass);
    }

    private final Class<?> logClass;

    protected SystemLog(Class<?> logClass) {
        this.logClass = logClass;
    }

    /**
     * Logs an error with debug log level.
     *
     * @param message log this message
     */
    public void debug(String message){
        System.out.println("DEBUG: "+message);
    }


    /**
     * Logs an error with debug log level.
     *
     * @param message log this message
     * @param t log this cause
     */
    public void debug(String message, Throwable t){
        System.out.println("DEBUG: "+message +"  "+ getStackTrace(t));
    }

    /**
     * Logs a message with error log level.
     *
     * @param message log this message
     */
    public void error(String message){
        System.out.println("ERROR: "+message);
    }

    /**
     * Logs an error with error log level.
     *
     * @param message log this message
     * @param t log this cause
     */
    public void error(String message, Throwable t){
        System.out.println("ERROR: "+message +"  "+ getStackTrace(t));
    }


    /**
     * Logs a message with info log level.
     *
     * @param message log this message
     */
    public void info(String message){
        System.out.println("INFO: "+message);
    }

    /**
     * Logs an error with info log level.
     *
     * @param message log this message
     * @param t log this cause
     */
    public void info(String message, Throwable t){
        System.out.println("INFO: "+message +"  "+ getStackTrace(t));
    }


    /**
     * Logs a message with trace log level.
     *
     * @param message log this message
     */
    public void trace(String message){
        System.out.println(message);
    }

    /**
     * Logs an error with trace log level.
     *
     * @param message log this message
     * @param t log this cause
     */
    public void trace(String message, Throwable t){
        System.out.println("TRACE: "+message +"  "+ getStackTrace(t));
    }

    /**
     * Logs a message with warn log level.
     *
     * @param message log this message
     */
    public void warn(String message){
        System.out.println("WARN: "+message);
    }

    /**
     * Logs an error with warn log level.
     *
     * @param message log this message
     * @param t log this cause
     */
    public void warn(String message, Throwable t){
        System.out.println("WARN: "+message +"  "+ getStackTrace(t));
    }

    public Class<?> getLogClass() {
        return logClass;
    }

    public static String getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        t.printStackTrace(new PrintWriter(sw));
        return "\n"+sw.toString();
    }
}
