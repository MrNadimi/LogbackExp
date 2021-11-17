package com.mrnadimi.logger;

import com.mrnadimi.logger.LoggerFace;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Developer: Mohamad Nadimi
 * Company: Saghe
 * Website: https://www.mrnadimi.com
 * Created on 16 November 2021
 * <p>
 * Description: ..
 *
 * Base logger for all alf4j loggers.
 */
public abstract class LoggerBase implements LoggerFace {

    protected final Class<?> logClass;
    protected final Logger LOG;


    public LoggerBase(Class<?> logClass) {
        this.logClass = logClass;
        this.LOG = LoggerFactory.getLogger(getLoggerName());
    }

    protected abstract String getLoggerName();

    public Logger getLogger(){
        return LOG;
    }

    @Override
    public void debug(String message) {
        LOG.debug(message);
    }

    @Override
    public void debug(String message, Throwable t) {
        LOG.debug(message , t);
    }

    @Override
    public void error(String message) {
        LOG.error(message);
    }

    @Override
    public void error(String message, Throwable t) {
        LOG.error(message , t);
    }

    @Override
    public void info(String message) {
        LOG.info(message);
    }

    @Override
    public void info(String message, Throwable t) {
        LOG.info(message , t);
    }

    @Override
    public void trace(String message) {
        LOG.trace(message);
    }

    @Override
    public void trace(String message, Throwable t) {
        LOG.trace(message , t);
    }

    @Override
    public void warn(String message) {
        LOG.warn(message);
    }

    @Override
    public void warn(String message, Throwable t) {
        LOG.warn(message , t);
    }




}
