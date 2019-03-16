package com.shtohryn.web.soap;

import java.io.IOException;

public interface CopterRemoteControllService {
    public void runCopter() throws IOException;

    public void stopCopter();
}
