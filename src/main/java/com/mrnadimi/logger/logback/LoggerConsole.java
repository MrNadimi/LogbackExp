package com.mrnadimi.logger.logback;

import com.mrnadimi.logger.LoggerBase;

/**
 * Developer: Mohamad Nadimi
 * Company: Saghe
 * Website: https://www.mrnadimi.com
 * Created on 16 November 2021
 * <p>
 * Description: ...
 *
 * LOG default logger
 * see logback.xml <root element
 */
public class LoggerConsole extends LoggerBase {

    public LoggerConsole(Class<?> logClass) {
        super(logClass);

    }

    @Override
    protected String getLoggerName() {
        return logClass.getName();
    }
}
