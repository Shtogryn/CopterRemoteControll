package com.shtohryn.receiver;

import com.shtohryn.entity.Copter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CommandReceiver {
    private Copter copter = new Copter();
    private static Logger logger = LogManager.getLogger(CommandReceiver.class);

    private int x = 15;
    private int limit = 100;

    public void moveDirectUp() {
        copter.setCoordinateZ((copter.getCoordinateZ() + x));
        logger.info(copter.toString());
    }

    public void moveDirectDown() {
        copter.setCoordinateZ((copter.getCoordinateZ() - x));
        logger.info(copter.toString());
    }

    public void moveDirectForward() {
        copter.setCoordinateX((copter.getCoordinateX() + x));
        logger.info(copter.toString());
    }

    public void moveDirectBack() {
        copter.setCoordinateX((copter.getCoordinateX() - x));
        logger.info(copter.toString());
    }

    public void stop() {
        System.out.println(copter.toString());
    }
}
