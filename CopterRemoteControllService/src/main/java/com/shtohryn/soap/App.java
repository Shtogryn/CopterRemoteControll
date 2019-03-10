package com.shtohryn.soap;

import com.shtohryn.execute.CommandImp;
import com.shtohryn.receiver.CommandReceiver;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        CommandReceiver receiver = new CommandReceiver();
        CommandImp concreteCommand = new CommandImp(receiver);
        concreteCommand.execute();
    }
}
