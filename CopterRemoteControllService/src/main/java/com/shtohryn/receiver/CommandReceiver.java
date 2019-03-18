package com.shtohryn.receiver;

import com.shtohryn.entity.Copter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

@Repository
public class CommandReceiver {
    private Copter copter = new Copter();
    private static Logger logger = LogManager.getLogger(CommandReceiver.class);

    private int x = 15;

    public String moveDirectUp() {
        copter.setCoordinateZ((copter.getCoordinateZ() + x));
        logger.info(copter.toString());
        return copter.toString();
    }

    public String moveDirectDown() {
        copter.setCoordinateZ((copter.getCoordinateZ() - x));
        logger.info(copter.toString());
        return copter.toString();
    }

    public String moveDirectForward() {
        copter.setCoordinateX((copter.getCoordinateX() + x));
        logger.info(copter.toString());
        return copter.toString();
    }

    public String moveDirectBack() {
        copter.setCoordinateX((copter.getCoordinateX() - x));
        logger.info(copter.toString());
        return copter.toString();
    }

    public String printCopterCoordinates() {
        return copter.toString();
    }

    public String stop() {
        copter.setCoordinateZ(0);
        logger.info(copter.toString());
        return copter.toString();
    }
}
