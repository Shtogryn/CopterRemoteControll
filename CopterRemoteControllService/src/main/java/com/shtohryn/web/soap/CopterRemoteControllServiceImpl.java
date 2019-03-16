package com.shtohryn.web.soap;

import com.shtohryn.execute.CommandImp;
import com.shtohryn.receiver.CommandReceiver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class CopterRemoteControllServiceImpl implements CopterRemoteControllService {
    private static Logger logger = LogManager.getLogger(CopterRemoteControllServiceImpl.class);
    private static CommandReceiver commandReceiver = new CommandReceiver();

    public void runCopter() throws IOException {
        logger.info("Copter really made the grade");
        CommandReceiver receiver = new CommandReceiver();
        CommandImp concreteCommand = new CommandImp(receiver);
        concreteCommand.execute("s");
    }

    public void stopCopter() {
        logger.info("stopCopter method ");
        commandReceiver.stop();
    }
}
