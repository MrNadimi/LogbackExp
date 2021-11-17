package com.mrnadimi.logger.logback;

/**
 * Developer: Mohamad Nadimi
 * Company: Saghe
 * Website: https://www.mrnadimi.com
 * Created on 16 November 2021
 * <p>
 * Description: ...
 */
public class LoggerConsoleSpring extends LoggerCustom{

    public LoggerConsoleSpring(Class<?> logClass) {
        super(logClass);
    }

    @Override
    protected String getLoggerName() {
        return "SPRING_LOGGER";
    }
}
