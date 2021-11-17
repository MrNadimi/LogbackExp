package com.mrnadimi.logger.logback.patterns;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.pattern.color.HighlightingCompositeConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

import static ch.qos.logback.core.pattern.color.ANSIConstants.*;
import static ch.qos.logback.core.pattern.color.ANSIConstants.DEFAULT_FG;

/**
 * Developer: Mohamad Nadimi
 * Company: Saghe
 * Website: https://www.mrnadimi.com
 * Created on 16 November 2021
 * <p>
 * Description:
 *
 *
 */
public class CustomPatternLayout extends PatternLayout {

    /**
     * All this key all added on pattern inside <pattern on logback.xml
     */
    static{
        DEFAULT_CONVERTER_MAP.put("SpringColor" ,CustomSpringColor.class.getName() );
    }

    public static class CustomSpringColor extends HighlightingCompositeConverter {
        @Override
        protected String getForegroundColorCode(ILoggingEvent event) {
            Level level = event.getLevel();
            switch (level.toInt()) {
                case Level.ERROR_INT:
                    return BOLD + RED_FG;
                case Level.WARN_INT:
                    return BOLD + YELLOW_FG;
                case Level.INFO_INT:
                    return BOLD + BLUE_FG;
                case Level.DEBUG_INT:
                    return BOLD + GREEN_FG;
                case Level.TRACE_INT:
                    return  BLUE_FG;
                default:
                    return DEFAULT_FG;
            }

        }
    }


}
