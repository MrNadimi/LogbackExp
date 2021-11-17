package com.mrnadimi.logger.logback;

import com.mrnadimi.logger.LoggerBase;
import org.slf4j.MDC;

/**
 * Developer: Mohamad Nadimi
 * Company: Saghe
 * Website: https://www.mrnadimi.com
 * Created on 16 November 2021
 * <p>
 * Description: ...
 *
 * Dar constructre mamulan ya name va ya class gerefte mishavad
 * Har classi ke az in class extend mishavad darvaghe az element <logger
 * dar file logback.xml refrence midahad va az config an appender estefade mikonad
 */
abstract class LoggerCustom extends LoggerBase {

    public LoggerCustom(Class<?> logClass) {
        super(logClass);
    }

    /**
     * MDC is static map on slf4j
     * Thats thread safe and when add from one thread and another thread get this key, the thread b got error value
     */
    protected void addClassNameOnMDC(){
        MDC.put("class_logger" , logClass.getName());
    }

    protected void removeClassNameFromMDC(){
        MDC.remove("class_logger");
    }


    @Override
    public void debug(String message) {
        addClassNameOnMDC();
        LOG.debug(message);
        removeClassNameFromMDC();
    }

    @Override
    public void debug(String message, Throwable t) {
        addClassNameOnMDC();
        LOG.debug(message , t);
        removeClassNameFromMDC();
    }

    @Override
    public void error(String message) {
        addClassNameOnMDC();
        LOG.error(message);
        removeClassNameFromMDC();
    }

    @Override
    public void error(String message, Throwable t) {
        addClassNameOnMDC();
        LOG.error(message , t);
        removeClassNameFromMDC();
    }

    @Override
    public void info(String message) {
        addClassNameOnMDC();
        LOG.info(message);
        removeClassNameFromMDC();
    }

    @Override
    public void info(String message, Throwable t) {
        addClassNameOnMDC();
        LOG.info(message , t);
        removeClassNameFromMDC();
    }

    @Override
    public void trace(String message) {
        addClassNameOnMDC();
        LOG.trace(message);
        removeClassNameFromMDC();
    }

    @Override
    public void trace(String message, Throwable t) {
        addClassNameOnMDC();
        LOG.trace(message , t);
        removeClassNameFromMDC();
    }

    @Override
    public void warn(String message) {
        addClassNameOnMDC();
        LOG.warn(message);
        removeClassNameFromMDC();
    }

    @Override
    public void warn(String message, Throwable t) {
        addClassNameOnMDC();
        LOG.warn(message , t);
        removeClassNameFromMDC();
    }
}
