package com.mrnadimi.logger.logback;

/**
 * Developer: Mohamad Nadimi
 * Company: Saghe
 * Website: https://www.mrnadimi.com
 * Created on 17 November 2021
 * <p>
 * Description: ...
 */
@Deprecated
public class LoggerFileRollingSize extends LoggerCustom{

    public LoggerFileRollingSize(Class<?> logClass) {
        super(logClass);
    }

    @Override
    protected String getLoggerName() {
        return "FILE_ROLLING_SIZE_LOGGER";
    }
}
