package com.mrnadimi.logger.logback.patterns;

import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import com.mrnadimi.logger.logback.patterns.CustomPatternLayout;

/**
 * Developer: Mohamad Nadimi
 * Company: Saghe
 * Website: https://www.mrnadimi.com
 * Created on 17 November 2021
 * <p>
 * Description: ...
 */
public class CustomPatternLayoutEncoder extends PatternLayoutEncoder {

    @Override
    public void start() {
        CustomPatternLayout patternLayout = new CustomPatternLayout();
        patternLayout.setContext(context);
        patternLayout.setPattern(getPattern());
        patternLayout.setOutputPatternAsHeader(outputPatternAsHeader);
        patternLayout.start();
        this.layout = patternLayout;
        super.start();
    }
}
