package com.shtohryn.execute;

import com.shtohryn.dataProvider.CsvCommandReader;
import com.shtohryn.receiver.CommandReceiver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class CommandImp implements Command {
    private CommandReceiver receiver;

    public CommandImp(CommandReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() throws IOException {
        CsvCommandReader csvCommandReader = new CsvCommandReader();
        List<String> arrayList = new ArrayList<>();
        arrayList = csvCommandReader.read();
        for (String c : arrayList)
            switch (c) {
                case "W":
                    receiver.moveDirectUp();
                    break;
                case "S":
                    receiver.moveDirectDown();
                    break;
                case "D":
                    receiver.moveDirectForward();
                    break;
                case "A":
                    receiver.moveDirectBack();
                    break;
                case "X":
                    receiver.stop();
                    break;
                case "0":
                    System.exit(0);
            }
    }
}

