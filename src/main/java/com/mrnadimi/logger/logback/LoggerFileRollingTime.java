package com.mrnadimi.logger.logback;

/**
 * Developer: Mohamad Nadimi
 * Company: Saghe
 * Website: https://www.mrnadimi.com
 * Created on 17 November 2021
 * <p>
 * Description: ...
 */
public class LoggerFileRollingTime extends LoggerCustom{
    public LoggerFileRollingTime(Class<?> logClass) {
        super(logClass);
    }

    @Override
    protected String getLoggerName() {
        return "FILE_ROLLING_TIME_LOGGER";
    }
}
