package com.shtohryn.execute;

import com.shtohryn.dataProvider.CsvCommandReader;
import com.shtohryn.receiver.CommandReceiver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CommandImp implements Command {
    private CommandReceiver receiver;
    private static Logger logger = LogManager.getLogger(CommandImp.class);

    public CommandImp(CommandReceiver receiver) {
        this.receiver = receiver;
    }

    public CommandImp() {
    }

    @Override
    public String execute(String command) {
        CsvCommandReader csvCommandReader = new CsvCommandReader();
        String res = null;
//        List<String> arrayList = new ArrayList<>();
//        arrayList = csvCommandReader.read();
       // for (String c : arrayList)
            switch (command) {
                case "W":
                    logger.info("moveDirectUp method");
                    receiver.moveDirectUp();
                    res = receiver.moveDirectUp();
                    break;
                case "S":
                    logger.info("moveDirectDown method");
                    receiver.moveDirectDown();
                    res = receiver.moveDirectDown();
                    break;
                case "D":
                    logger.info("moveDirectForward method");
                    receiver.moveDirectForward();
                    res = receiver.moveDirectForward();
                    break;
                case "A":
                    logger.info("moveDirectBack method");
                    receiver.moveDirectBack();
                    res = receiver.moveDirectBack();
                    break;
                case "X":
                    logger.info("stop method");
                    receiver.stop();
                    res = receiver.stop();
                    break;
                case "G":
                    logger.info("printCopterCoordinates method");
                    receiver.printCopterCoordinates();
                    break;
                case "-":
                    System.exit(0);
            }
        return res;
    }
}

