package com.mrnadimi.logger;

import org.slf4j.Logger;

/**
 * Developer: Mohamad Nadimi
 * Company: Saghe
 * Website: https://www.mrnadimi.com
 * Created on 16 November 2021
 * <p>
 * Description: ...
 *
 * The interface for all logger models
 */
public interface LoggerFace {

    /**
     * Logs an error with debug log level.
     *
     * @param message log this message
     */
    public void debug(String message);


    /**
     * Logs an error with debug log level.
     *
     * @param message log this message
     * @param t log this cause
     */
    public void debug(String message, Throwable t);

    /**
     * Logs a message with error log level.
     *
     * @param message log this message
     */
    public void error(String message);

    /**
     * Logs an error with error log level.
     *
     * @param message log this message
     * @param t log this cause
     */
    public void error(String message, Throwable t);


    /**
     * Logs a message with info log level.
     *
     * @param message log this message
     */
    public void info(String message);

    /**
     * Logs an error with info log level.
     *
     * @param message log this message
     * @param t log this cause
     */
    public void info(String message, Throwable t);


    /**
     * Logs a message with trace log level.
     *
     * @param message log this message
     */
    public void trace(String message);

    /**
     * Logs an error with trace log level.
     *
     * @param message log this message
     * @param t log this cause
     */
    public void trace(String message, Throwable t);

    /**
     * Logs a message with warn log level.
     *
     * @param message log this message
     */
    public void warn(String message);

    /**
     * Logs an error with warn log level.
     *
     * @param message log this message
     * @param t log this cause
     */
    public void warn(String message, Throwable t);
}
