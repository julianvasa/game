package com.game.logging;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Logging helper class to write logs in output.log
 *
 * @author Julian Vasa
 */
public class Logging {

    public static void write(String logText, String className) {
        // write some logs
        Logger LOGGER = Logger.getLogger(className);
        try {
            /* create logs directory if it doesn't exist */
            File logDir = new File("./logs/");
            if (!(logDir.exists()))
                logDir.mkdir();

            /* append logText to output.log */
            FileHandler handler = new FileHandler(logDir + File.separator + "output.log", true);
            handler.setFormatter(new SimpleFormatter());
            LOGGER.addHandler(handler);
            LOGGER.info(logText);
            handler.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
