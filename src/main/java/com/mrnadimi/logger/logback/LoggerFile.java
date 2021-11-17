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
 * https://stackoverflow.com/questions/2488558/logback-to-log-different-messages-to-two-files
 *
 * The logger for FILE_LOGGER see logback.xml <logger element
 */
public final class LoggerFile extends LoggerCustom {

    public LoggerFile(Class<?> logClass) {
        super(logClass);
    }

    /**
     *
     * @return The FILE_LOGGER inside the logback.xml <logger element
     */
    @Override
    protected String getLoggerName() {
        return "FILE_LOGGER";
    }


}
