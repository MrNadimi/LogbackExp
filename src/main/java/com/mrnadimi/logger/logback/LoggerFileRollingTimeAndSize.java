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
public class LoggerFileRollingTimeAndSize extends LoggerCustom{

    public LoggerFileRollingTimeAndSize(Class<?> logClass) {
        super(logClass);
    }

    @Override
    protected String getLoggerName() {
        return "FILE_ROLLING_TIME_AND_SIZE_LOGGER";
    }
}
