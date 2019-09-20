package com.game;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Logging {

    public static void write(String logText, String className) {
        // write some logs
        Logger LOGGER = Logger.getLogger(className);
        try {
            File logDir = new File("./logs/");
            if (!(logDir.exists()))
                logDir.mkdir();

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
