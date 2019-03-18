package com.shtohryn.web.rest;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public interface CopterRemoteControllRestService {
    @RequestMapping(value = "/Copter/POSTcommand",
            method = RequestMethod.POST,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public String setDirect(@RequestBody String command) throws IOException ;
    @RequestMapping(value = "/Copter/coordinats",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public String getCoordinats(@RequestBody String command) throws IOException;

}
