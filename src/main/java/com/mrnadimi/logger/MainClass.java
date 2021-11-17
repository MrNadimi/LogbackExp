package com.mrnadimi.logger;


import com.mrnadimi.logger.logback.*;

/**
 * Developer: Mohamad Nadimi
 * Company: Saghe
 * Website: https://www.mrnadimi.com
 * Email: nadimibox@gmail.com
 * Created on 12 November 2021
 * <p>
 * Description: ...
 *
 * In my R & D i got log4j2 is better choice : https://stackoverflow.com/a/38159238/6098741 but
 * logback is faster : https://www.baeldung.com/logback
 *
 */
public class MainClass {
    public static void main(String[] args){

        long now = System.currentTimeMillis();

        new LoggerConsole(MainClass.class).warn("aaaaaaa");
        new LoggerConsoleSpring(MainClass.class).warn("aaaaaaaaaaaaa");
        LoggerFace log = new LoggerFileRollingTime(MainClass.class);
        for (int i = 0 ; i < 1000000 ; i++){
            log.info("gav");
        }





    }
}
