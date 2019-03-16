package com.shtohryn.web.rest;

import com.shtohryn.execute.CommandImp;
import com.shtohryn.receiver.CommandReceiver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class CopterRemoteControllRestServiceImpl {
    private static CommandReceiver receiver = new CommandReceiver();
    @Autowired
    private static CommandImp commandImp = new CommandImp(receiver);

    @RequestMapping(value = "/Copter/POSTcommand",
            method = RequestMethod.POST,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public String setDirect(@RequestBody String command) throws IOException {
        return commandImp.execute(command);
    }

    @RequestMapping(value = "/Copter/GETcoordinats",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public String getCoordinats(@RequestBody String command) throws IOException {
        return commandImp.execute(command);
    }

}
