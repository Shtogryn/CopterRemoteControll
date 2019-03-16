package com.shtohryn.execute;

import java.io.IOException;

public interface Command {
    public String execute(String command) throws IOException;
}
